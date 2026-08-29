package p4;

import a4.w;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.exoplayer2.upstream.s0;
import f5.d0;
import i7.n6;
import j3.a1;
import j3.t0;
import j3.t1;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
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
import q8.l0;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends DefaultHandler implements s0 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public e() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
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
        char c6 = 3;
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
                    String b10 = n6.b(attributeValue4);
                    b10.getClass();
                    switch (b10.hashCode()) {
                        case 1596796:
                            if (b10.equals("4000")) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 2937391:
                            if (b10.equals("a000")) {
                                c6 = 1;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 3094035:
                            if (b10.equals("f801")) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    switch (c6) {
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
        } while (!f5.a.y(xmlPullParser, "AudioChannelConfiguration"));
        return i11;
    }

    public static long e(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) {
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
        } while (!f5.a.y(xmlPullParser, "BaseURL"));
        if (str != null && f5.a.u(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return q8.l.k(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar = (b) arrayList.get(i10);
            String G = f5.a.G(bVar.a, str);
            String str2 = attributeValue3 == null ? G : attributeValue3;
            if (z10) {
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
    public static Pair g(XmlPullParser xmlPullParser) {
        String str;
        ?? r6;
        String str2;
        String str3;
        ?? r72;
        char c3;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String b10 = n6.b(attributeValue);
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
                    r6 = j3.h.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 1:
                    r6 = j3.h.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 2:
                    r6 = j3.h.d;
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
                        r6 = j3.h.b;
                        str3 = null;
                        r72 = w3.j.a(r6, uuidArr, null);
                        break;
                    } else {
                        r6 = null;
                        str2 = r6;
                        str3 = str2;
                        r72 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!f5.a.z(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r72 = r72;
                } else if (f5.a.z(xmlPullParser, "ms:laurl")) {
                    if (r72 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            o1.a e10 = w3.j.e(decode);
                            UUID uuid = e10 == null ? null : (UUID) e10.b;
                            if (uuid == null) {
                                f5.a.K("MpdParser", "Skipping malformed cenc:pssh data");
                                r6 = uuid;
                                r72 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r72 = decode;
                                r6 = uuid2;
                            }
                        }
                    }
                    if (r72 == 0) {
                        ?? r9 = j3.h.e;
                        if (r9.equals(r6) && f5.a.z(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r72 = w3.j.a(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r72 = r72;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r72 = r72;
                }
            } while (!f5.a.y(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r6 != null ? new n3.b(r6, str3, "video/mp4", r72) : null);
        }
        str = null;
        r6 = null;
        str2 = r6;
        str3 = str2;
        r72 = str2;
        do {
            xmlPullParser.next();
            if (!f5.a.z(xmlPullParser, "clearkey:Laurl")) {
            }
            if (f5.a.z(xmlPullParser, "ms:laurl")) {
            }
        } while (!f5.a.y(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r6 != null ? new n3.b(r6, str3, "video/mp4", r72) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
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

    public static f i(XmlPullParser xmlPullParser, String str) {
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
        } while (!f5.a.y(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j10) {
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

    public static float k(XmlPullParser xmlPullParser, float f9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0944, code lost:
    
        r3 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0950, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L342;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0f5b A[LOOP:5: B:182:0x040a->B:190:0x0f5b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dd2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0c33 A[LOOP:11: B:348:0x0643->B:356:0x0c33, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0886 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1318 A[LOOP:1: B:35:0x00d3->B:43:0x1318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x12e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0abc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0956  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c l(XmlPullParser xmlPullParser, Uri uri) {
        boolean z10;
        long j10;
        ArrayList arrayList;
        long j11;
        boolean z11;
        ArrayList arrayList2;
        long j12;
        long j13;
        long j14;
        ArrayList arrayList3;
        long j15;
        ArrayList arrayList4;
        String str;
        String str2;
        String str3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str4;
        String str5;
        String str6;
        long j16;
        ArrayList arrayList8;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        long j17;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str12;
        String str13;
        String str14;
        String str15;
        float f9;
        String str16;
        ArrayList arrayList12;
        String str17;
        ArrayList arrayList13;
        ArrayList arrayList14;
        String str18;
        String str19;
        ArrayList arrayList15;
        int i10;
        long j18;
        long j19;
        ArrayList arrayList16;
        String str20;
        ArrayList arrayList17;
        String str21;
        String str22;
        String str23;
        ArrayList arrayList18;
        int parseInt;
        String str24;
        String str25;
        String str26;
        int parseInt2;
        String str27;
        float f10;
        int parseInt3;
        int i11;
        String str28;
        String str29;
        ArrayList arrayList19;
        String str30;
        ArrayList arrayList20;
        int i12;
        String str31;
        int i13;
        int i14;
        long j20;
        ArrayList arrayList21;
        String str32;
        String str33;
        ArrayList arrayList22;
        String str34;
        ArrayList arrayList23;
        String str35;
        long j21;
        long j22;
        String str36;
        ArrayList arrayList24;
        long j23;
        String str37;
        ArrayList arrayList25;
        long j24;
        ArrayList arrayList26;
        String str38;
        s sVar;
        int i15;
        String str39;
        String str40;
        String str41;
        String c3;
        long j25;
        String str42;
        int i16;
        ArrayList arrayList27;
        int i17;
        int i18;
        int i19;
        Pair pair;
        int parseInt4;
        int i20;
        String str43;
        char c6;
        int i21;
        int i22;
        String str44;
        long j26;
        int i23;
        long j27;
        m kVar;
        String str45;
        long j28;
        String[] strArr = new String[0];
        String str46 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i24 = 0;
        while (true) {
            if (i24 >= length) {
                z10 = false;
                break;
            }
            if (strArr[i24].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z10 = true;
                break;
            }
            i24++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j29 = -9223372036854775807L;
        long K = attributeValue2 == null ? -9223372036854775807L : d0.K(attributeValue2);
        long j30 = j(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long j31 = j(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long j32 = equals ? j(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long j33 = equals ? j(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long j34 = equals ? j(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long K2 = attributeValue3 == null ? -9223372036854775807L : d0.K(attributeValue3);
        long j35 = equals ? 0L : -9223372036854775807L;
        ArrayList k9 = q8.l.k(new b(z10 ? 1 : TLObject.FLAG_31, 1, uri.toString(), uri.toString()));
        ArrayList arrayList28 = new ArrayList();
        ArrayList arrayList29 = new ArrayList();
        long j36 = equals ? -9223372036854775807L : 0L;
        i iVar = null;
        d9.c cVar = null;
        Uri uri2 = null;
        a1 a1Var = null;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            xmlPullParser.next();
            String str47 = "BaseURL";
            if (f5.a.z(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    j35 = e(xmlPullParser, j35);
                    z12 = true;
                }
                arrayList29.addAll(f(xmlPullParser, k9, z10));
                arrayList = k9;
                j13 = j29;
                arrayList3 = arrayList29;
                j11 = j36;
                z11 = z10;
                arrayList2 = arrayList28;
            } else {
                char c10 = 1;
                String str48 = "lang";
                if (f5.a.z(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str46, "moreInformationURL");
                    String str49 = attributeValue4 == null ? str46 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str46, "lang");
                    String str50 = attributeValue5 == null ? str46 : attributeValue5;
                    String str51 = str46;
                    String str52 = str51;
                    String str53 = str52;
                    while (true) {
                        xmlPullParser.next();
                        j10 = j29;
                        if (f5.a.z(xmlPullParser, "Title")) {
                            str51 = xmlPullParser.nextText();
                        } else if (f5.a.z(xmlPullParser, "Source")) {
                            str52 = xmlPullParser.nextText();
                        } else if (f5.a.z(xmlPullParser, "Copyright")) {
                            str53 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str54 = str51;
                        String str55 = str52;
                        String str56 = str53;
                        if (f5.a.y(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str54, str55, str56, str49, str50);
                            arrayList = k9;
                            arrayList3 = arrayList29;
                            j11 = j36;
                            z11 = z10;
                            arrayList2 = arrayList28;
                            iVar = iVar2;
                        } else {
                            str51 = str54;
                            str52 = str55;
                            str53 = str56;
                            j29 = j10;
                        }
                    }
                } else {
                    j10 = j29;
                    if (f5.a.z(xmlPullParser, "UTCTiming")) {
                        arrayList = k9;
                        arrayList3 = arrayList29;
                        j11 = j36;
                        cVar = new d9.c(3, xmlPullParser.getAttributeValue(str46, "schemeIdUri"), xmlPullParser.getAttributeValue(str46, "value"));
                    } else if (f5.a.z(xmlPullParser, "Location")) {
                        uri2 = f5.a.H(uri.toString(), xmlPullParser.nextText());
                        arrayList = k9;
                        arrayList3 = arrayList29;
                        j11 = j36;
                    } else {
                        if (f5.a.z(xmlPullParser, "ServiceDescription")) {
                            long j37 = j10;
                            long j38 = j37;
                            long j39 = j38;
                            float f11 = -3.4028235E38f;
                            float f12 = -3.4028235E38f;
                            while (true) {
                                xmlPullParser.next();
                                if (f5.a.z(xmlPullParser, "Latency")) {
                                    arrayList = k9;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j37 = attributeValue6 == null ? j10 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j38 = attributeValue7 == null ? j10 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j39 = attributeValue8 == null ? j10 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = k9;
                                    if (f5.a.z(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f11 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f12 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j40 = j37;
                                long j41 = j35;
                                long j42 = j38;
                                long j43 = j33;
                                long j44 = j39;
                                if (f5.a.y(xmlPullParser, "ServiceDescription")) {
                                    a1 a1Var2 = new a1();
                                    a1Var2.a = j40;
                                    a1Var2.b = j42;
                                    a1Var2.c = j44;
                                    a1Var2.d = f11;
                                    a1Var2.e = f12;
                                    a1Var = a1Var2;
                                    j11 = j36;
                                    z11 = z10;
                                    arrayList2 = arrayList28;
                                    j35 = j41;
                                    j12 = j43;
                                    j13 = j10;
                                    arrayList3 = arrayList29;
                                } else {
                                    j39 = j44;
                                    j33 = j43;
                                    k9 = arrayList;
                                    j38 = j42;
                                    j35 = j41;
                                    j37 = j40;
                                }
                            }
                        } else {
                            arrayList = k9;
                            long j45 = j35;
                            long j46 = j33;
                            if (!f5.a.z(xmlPullParser, "Period") || z13) {
                                j11 = j36;
                                z11 = z10;
                                arrayList2 = arrayList28;
                                j12 = j46;
                                j13 = j10;
                                j14 = j45;
                                arrayList3 = arrayList29;
                                b(xmlPullParser);
                            } else {
                                ArrayList arrayList30 = !arrayList29.isEmpty() ? arrayList29 : arrayList;
                                String str57 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long j47 = j(xmlPullParser, "start", j36);
                                String str58 = "duration";
                                String str59 = "value";
                                long j48 = K != j10 ? K + j47 : j10;
                                long j49 = j(xmlPullParser, "duration", j10);
                                ArrayList arrayList31 = new ArrayList();
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                long j50 = j10;
                                String str60 = "schemeIdUri";
                                String str61 = "Period";
                                long j51 = j45;
                                s sVar2 = null;
                                boolean z14 = false;
                                while (true) {
                                    xmlPullParser.next();
                                    if (f5.a.z(xmlPullParser, str47)) {
                                        if (!z14) {
                                            j51 = e(xmlPullParser, j51);
                                            z14 = true;
                                        }
                                        arrayList33.addAll(f(xmlPullParser, arrayList30, z10));
                                        arrayList4 = arrayList30;
                                        str = str57;
                                        j11 = j36;
                                        str2 = str47;
                                        str6 = str58;
                                        str5 = str59;
                                        z11 = z10;
                                        j15 = j51;
                                        str3 = str48;
                                        j12 = j46;
                                        arrayList8 = arrayList31;
                                        arrayList5 = arrayList32;
                                        str4 = str60;
                                        str7 = str61;
                                        j13 = -9223372036854775807L;
                                        j14 = j45;
                                        arrayList3 = arrayList29;
                                        arrayList7 = arrayList28;
                                        long j52 = j49;
                                        arrayList6 = arrayList33;
                                        j16 = j52;
                                    } else {
                                        j15 = j51;
                                        arrayList4 = arrayList30;
                                        if (f5.a.z(xmlPullParser, "AdaptationSet")) {
                                            ArrayList arrayList34 = !arrayList33.isEmpty() ? arrayList33 : arrayList4;
                                            String str62 = "SegmentTemplate";
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str57);
                                            int parseInt5 = attributeValue12 == null ? -1 : Integer.parseInt(attributeValue12);
                                            int h = h(xmlPullParser);
                                            String str63 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList35 = arrayList33;
                                            String str64 = "codecs";
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            ArrayList arrayList36 = arrayList29;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt6 = attributeValue15 == null ? -1 : Integer.parseInt(attributeValue15);
                                            j11 = j36;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt7 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                            float k10 = k(xmlPullParser, -1.0f);
                                            String str65 = str58;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt8 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, str48);
                                            String str66 = str59;
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList37 = new ArrayList();
                                            String str67 = attributeValue19;
                                            ArrayList arrayList38 = new ArrayList();
                                            ArrayList arrayList39 = new ArrayList();
                                            String str68 = "SegmentList";
                                            ArrayList arrayList40 = new ArrayList();
                                            String str69 = "SegmentBase";
                                            ArrayList arrayList41 = new ArrayList();
                                            String str70 = "audioSamplingRate";
                                            ArrayList arrayList42 = new ArrayList();
                                            float f13 = k10;
                                            ArrayList arrayList43 = new ArrayList();
                                            ArrayList arrayList44 = new ArrayList();
                                            String str71 = "mimeType";
                                            str = str57;
                                            String str72 = "width";
                                            s sVar3 = sVar2;
                                            long j53 = j50;
                                            long j54 = j15;
                                            String str73 = attributeValue18;
                                            boolean z15 = false;
                                            int i25 = -1;
                                            String str74 = "height";
                                            int i26 = h;
                                            String str75 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (f5.a.z(xmlPullParser, str47)) {
                                                    if (!z15) {
                                                        j54 = e(xmlPullParser, j54);
                                                        z15 = true;
                                                    }
                                                    j17 = j54;
                                                    arrayList44.addAll(f(xmlPullParser, arrayList34, z10));
                                                } else {
                                                    j17 = j54;
                                                    if (f5.a.z(xmlPullParser, "ContentProtection")) {
                                                        Pair g10 = g(xmlPullParser);
                                                        Object obj = g10.first;
                                                        if (obj != null) {
                                                            str75 = (String) obj;
                                                        }
                                                        Object obj2 = g10.second;
                                                        if (obj2 != null) {
                                                            arrayList37.add((n3.b) obj2);
                                                        }
                                                    } else if (f5.a.z(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue20 = xmlPullParser.getAttributeValue(null, str48);
                                                        if (str73 == null) {
                                                            str73 = attributeValue20;
                                                        } else if (attributeValue20 != null) {
                                                            f5.a.i(str73.equals(attributeValue20));
                                                        }
                                                        int h10 = h(xmlPullParser);
                                                        if (i26 == -1) {
                                                            i26 = h10;
                                                        } else if (h10 != -1) {
                                                            f5.a.i(i26 == h10);
                                                        }
                                                    } else {
                                                        if (f5.a.z(xmlPullParser, "Role")) {
                                                            arrayList40.add(i(xmlPullParser, "Role"));
                                                        } else {
                                                            String str76 = "AudioChannelConfiguration";
                                                            if (f5.a.z(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i25 = c(xmlPullParser);
                                                            } else {
                                                                String str77 = "ContentProtection";
                                                                if (f5.a.z(xmlPullParser, "Accessibility")) {
                                                                    arrayList39.add(i(xmlPullParser, "Accessibility"));
                                                                } else if (f5.a.z(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList41.add(i(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    str3 = str48;
                                                                    if (f5.a.z(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList42.add(i(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList10 = arrayList37;
                                                                        str19 = str73;
                                                                        i10 = i26;
                                                                        str2 = str47;
                                                                        z11 = z10;
                                                                        arrayList9 = arrayList40;
                                                                        arrayList11 = arrayList41;
                                                                        arrayList8 = arrayList31;
                                                                        arrayList5 = arrayList32;
                                                                        str12 = str63;
                                                                        str13 = str65;
                                                                        str14 = str66;
                                                                        str18 = str68;
                                                                        str20 = str69;
                                                                        str15 = str70;
                                                                        f9 = f13;
                                                                        arrayList16 = arrayList43;
                                                                        str16 = str72;
                                                                        j18 = j53;
                                                                        str17 = str64;
                                                                        arrayList13 = arrayList44;
                                                                        j16 = j49;
                                                                        arrayList6 = arrayList35;
                                                                        arrayList12 = arrayList34;
                                                                        arrayList15 = arrayList39;
                                                                        j19 = j46;
                                                                        arrayList17 = arrayList38;
                                                                        j14 = j45;
                                                                        arrayList3 = arrayList36;
                                                                        arrayList14 = arrayList42;
                                                                        arrayList7 = arrayList28;
                                                                        j53 = j18;
                                                                        str21 = str67;
                                                                        j54 = j17;
                                                                        i26 = i10;
                                                                        str22 = str12;
                                                                        if (f5.a.y(xmlPullParser, str22)) {
                                                                            long j55 = j19;
                                                                            c10 = 1;
                                                                            arrayList38 = arrayList17;
                                                                            str69 = str20;
                                                                            arrayList43 = arrayList16;
                                                                            arrayList28 = arrayList7;
                                                                            arrayList34 = arrayList12;
                                                                            str72 = str16;
                                                                            z10 = z11;
                                                                            str67 = str21;
                                                                            arrayList39 = arrayList15;
                                                                            arrayList42 = arrayList14;
                                                                            str48 = str3;
                                                                            f13 = f9;
                                                                            arrayList41 = arrayList11;
                                                                            str70 = str15;
                                                                            str47 = str2;
                                                                            arrayList32 = arrayList5;
                                                                            arrayList37 = arrayList10;
                                                                            str66 = str14;
                                                                            str65 = str13;
                                                                            str63 = str22;
                                                                            arrayList36 = arrayList3;
                                                                            j45 = j14;
                                                                            arrayList35 = arrayList6;
                                                                            arrayList44 = arrayList13;
                                                                            j46 = j55;
                                                                            j49 = j16;
                                                                            str68 = str18;
                                                                            str64 = str17;
                                                                            arrayList40 = arrayList9;
                                                                            str73 = str19;
                                                                            arrayList31 = arrayList8;
                                                                        } else {
                                                                            ArrayList arrayList45 = new ArrayList(arrayList16.size());
                                                                            int i27 = 0;
                                                                            while (i27 < arrayList16.size()) {
                                                                                d dVar = (d) arrayList16.get(i27);
                                                                                j3.s0 a2 = dVar.a.a();
                                                                                if (str21 != null) {
                                                                                    a2.b = str21;
                                                                                }
                                                                                String str78 = dVar.d;
                                                                                if (str78 == null) {
                                                                                    str78 = str75;
                                                                                }
                                                                                ArrayList arrayList46 = dVar.e;
                                                                                ArrayList arrayList47 = arrayList10;
                                                                                arrayList46.addAll(arrayList47);
                                                                                if (arrayList46.isEmpty()) {
                                                                                    i22 = i27;
                                                                                    str44 = str21;
                                                                                    j26 = j16;
                                                                                    i23 = i26;
                                                                                    j27 = j19;
                                                                                } else {
                                                                                    i22 = i27;
                                                                                    str44 = str21;
                                                                                    int i28 = 0;
                                                                                    while (true) {
                                                                                        if (i28 < arrayList46.size()) {
                                                                                            n3.b bVar = (n3.b) arrayList46.get(i28);
                                                                                            j26 = j16;
                                                                                            if (!j3.h.c.equals(bVar.b) || (str45 = bVar.c) == null) {
                                                                                                i28++;
                                                                                                j16 = j26;
                                                                                            } else {
                                                                                                arrayList46.remove(i28);
                                                                                            }
                                                                                        } else {
                                                                                            j26 = j16;
                                                                                            str45 = null;
                                                                                        }
                                                                                    }
                                                                                    if (str45 != null) {
                                                                                        int i29 = 0;
                                                                                        while (i29 < arrayList46.size()) {
                                                                                            n3.b bVar2 = (n3.b) arrayList46.get(i29);
                                                                                            int i30 = i26;
                                                                                            if (j3.h.b.equals(bVar2.b) && bVar2.c == null) {
                                                                                                j28 = j19;
                                                                                                arrayList46.set(i29, new n3.b(j3.h.c, str45, bVar2.d, bVar2.e));
                                                                                            } else {
                                                                                                j28 = j19;
                                                                                            }
                                                                                            i29++;
                                                                                            i26 = i30;
                                                                                            j19 = j28;
                                                                                        }
                                                                                    }
                                                                                    i23 = i26;
                                                                                    j27 = j19;
                                                                                    for (int size = arrayList46.size() - 1; size >= 0; size--) {
                                                                                        n3.b bVar3 = (n3.b) arrayList46.get(size);
                                                                                        if (bVar3.e == null) {
                                                                                            int i31 = 0;
                                                                                            while (true) {
                                                                                                if (i31 < arrayList46.size()) {
                                                                                                    n3.b bVar4 = (n3.b) arrayList46.get(i31);
                                                                                                    if (bVar4.e != null && bVar3.e == null) {
                                                                                                        UUID uuid = bVar3.b;
                                                                                                        bVar4.getClass();
                                                                                                        UUID uuid2 = j3.h.a;
                                                                                                        UUID uuid3 = bVar4.b;
                                                                                                        if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
                                                                                                            arrayList46.remove(size);
                                                                                                        }
                                                                                                    }
                                                                                                    i31++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    a2.r = new n3.c(str78, arrayList46);
                                                                                }
                                                                                ArrayList arrayList48 = dVar.f;
                                                                                arrayList48.addAll(arrayList17);
                                                                                t0 t0Var = new t0(a2);
                                                                                z zVar = dVar.b;
                                                                                s sVar4 = dVar.c;
                                                                                ArrayList arrayList49 = dVar.g;
                                                                                ArrayList arrayList50 = dVar.h;
                                                                                if (sVar4 instanceof r) {
                                                                                    kVar = new l(t0Var, zVar, (r) sVar4, arrayList48, arrayList49, arrayList50);
                                                                                } else {
                                                                                    if (!(sVar4 instanceof n)) {
                                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                    }
                                                                                    kVar = new k(t0Var, zVar, (n) sVar4, arrayList48, arrayList49, arrayList50);
                                                                                }
                                                                                arrayList45.add(kVar);
                                                                                i27 = i22 + 1;
                                                                                arrayList10 = arrayList47;
                                                                                str21 = str44;
                                                                                i26 = i23;
                                                                                j16 = j26;
                                                                                j19 = j27;
                                                                            }
                                                                            c10 = 1;
                                                                            arrayList8.add(new a(parseInt5, i26, arrayList45, arrayList15, arrayList11, arrayList14));
                                                                            str4 = str60;
                                                                            j12 = j19;
                                                                            str5 = str14;
                                                                            str6 = str13;
                                                                        }
                                                                    } else {
                                                                        arrayList9 = arrayList40;
                                                                        String str79 = "Representation";
                                                                        if (f5.a.z(xmlPullParser, "Representation")) {
                                                                            if (arrayList44.isEmpty()) {
                                                                                str23 = "SupplementalProperty";
                                                                                arrayList18 = arrayList34;
                                                                            } else {
                                                                                str23 = "SupplementalProperty";
                                                                                arrayList18 = arrayList44;
                                                                            }
                                                                            ArrayList arrayList51 = arrayList37;
                                                                            String str80 = "InbandEventStream";
                                                                            String str81 = str;
                                                                            String str82 = "EssentialProperty";
                                                                            String attributeValue21 = xmlPullParser.getAttributeValue(null, str81);
                                                                            String str83 = str81;
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue22 == null) {
                                                                                str24 = str71;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str84 = str71;
                                                                                parseInt = Integer.parseInt(attributeValue22);
                                                                                str24 = str84;
                                                                            }
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, str24);
                                                                            String str85 = attributeValue23 == null ? attributeValue13 : attributeValue23;
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str64);
                                                                            String str86 = str24;
                                                                            String str87 = str72;
                                                                            String str88 = attributeValue24 == null ? attributeValue14 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str87);
                                                                            if (attributeValue25 == null) {
                                                                                String str89 = str74;
                                                                                str25 = str87;
                                                                                str26 = str89;
                                                                                parseInt2 = parseInt6;
                                                                            } else {
                                                                                String str90 = str74;
                                                                                str25 = str87;
                                                                                str26 = str90;
                                                                                parseInt2 = Integer.parseInt(attributeValue25);
                                                                            }
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str26);
                                                                            if (attributeValue26 == null) {
                                                                                float f14 = f13;
                                                                                str27 = str26;
                                                                                f10 = f14;
                                                                                parseInt3 = parseInt7;
                                                                            } else {
                                                                                float f15 = f13;
                                                                                str27 = str26;
                                                                                f10 = f15;
                                                                                parseInt3 = Integer.parseInt(attributeValue26);
                                                                            }
                                                                            float k11 = k(xmlPullParser, f10);
                                                                            f9 = f10;
                                                                            String str91 = str70;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str91);
                                                                            int parseInt9 = attributeValue27 == null ? parseInt8 : Integer.parseInt(attributeValue27);
                                                                            ArrayList arrayList52 = new ArrayList();
                                                                            ArrayList arrayList53 = new ArrayList();
                                                                            ArrayList arrayList54 = new ArrayList(arrayList41);
                                                                            arrayList11 = arrayList41;
                                                                            ArrayList arrayList55 = new ArrayList(arrayList42);
                                                                            ArrayList arrayList56 = new ArrayList();
                                                                            str15 = str91;
                                                                            ArrayList arrayList57 = arrayList34;
                                                                            String str92 = str73;
                                                                            int i32 = i26;
                                                                            s sVar5 = sVar3;
                                                                            long j56 = j53;
                                                                            int i33 = i25;
                                                                            long j57 = j17;
                                                                            boolean z16 = false;
                                                                            String str93 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (f5.a.z(xmlPullParser, str47)) {
                                                                                    if (!z16) {
                                                                                        j57 = e(xmlPullParser, j57);
                                                                                        z16 = true;
                                                                                    }
                                                                                    i11 = parseInt9;
                                                                                    arrayList56.addAll(f(xmlPullParser, arrayList18, z10));
                                                                                } else {
                                                                                    i11 = parseInt9;
                                                                                    if (f5.a.z(xmlPullParser, str76)) {
                                                                                        i33 = c(xmlPullParser);
                                                                                    } else {
                                                                                        String str94 = str69;
                                                                                        if (f5.a.z(xmlPullParser, str94)) {
                                                                                            str69 = str94;
                                                                                            sVar5 = p(xmlPullParser, (r) sVar5);
                                                                                        } else {
                                                                                            String str95 = str68;
                                                                                            if (f5.a.z(xmlPullParser, str95)) {
                                                                                                arrayList13 = arrayList44;
                                                                                                str2 = str47;
                                                                                                long e10 = e(xmlPullParser, j56);
                                                                                                long j58 = j48;
                                                                                                str33 = str76;
                                                                                                str28 = str95;
                                                                                                arrayList22 = arrayList18;
                                                                                                arrayList8 = arrayList31;
                                                                                                arrayList5 = arrayList32;
                                                                                                str29 = str63;
                                                                                                str13 = str65;
                                                                                                str16 = str25;
                                                                                                str14 = str66;
                                                                                                arrayList19 = arrayList38;
                                                                                                str30 = str94;
                                                                                                str74 = str27;
                                                                                                arrayList20 = arrayList43;
                                                                                                i12 = parseInt;
                                                                                                str34 = str77;
                                                                                                arrayList10 = arrayList51;
                                                                                                str71 = str86;
                                                                                                str31 = str92;
                                                                                                i13 = i32;
                                                                                                i14 = i11;
                                                                                                str17 = str64;
                                                                                                long j59 = j49;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList12 = arrayList57;
                                                                                                arrayList21 = arrayList39;
                                                                                                ArrayList arrayList58 = arrayList54;
                                                                                                str32 = str82;
                                                                                                str = str83;
                                                                                                ArrayList arrayList59 = arrayList36;
                                                                                                arrayList14 = arrayList42;
                                                                                                long j60 = j46;
                                                                                                j14 = j45;
                                                                                                arrayList3 = arrayList59;
                                                                                                arrayList7 = arrayList28;
                                                                                                arrayList23 = arrayList56;
                                                                                                str35 = str62;
                                                                                                j20 = j59;
                                                                                                str36 = str80;
                                                                                                j24 = e10;
                                                                                                j23 = j58;
                                                                                                j21 = j57;
                                                                                                str38 = str79;
                                                                                                sVar = q(xmlPullParser, (o) sVar5, j58, j59, j57, e10, j60);
                                                                                                arrayList25 = arrayList58;
                                                                                                arrayList26 = arrayList55;
                                                                                                i15 = i33;
                                                                                                z11 = z10;
                                                                                                str39 = str93;
                                                                                                j22 = j60;
                                                                                                arrayList24 = arrayList52;
                                                                                            } else {
                                                                                                str28 = str95;
                                                                                                long j61 = j57;
                                                                                                arrayList13 = arrayList44;
                                                                                                str2 = str47;
                                                                                                arrayList8 = arrayList31;
                                                                                                arrayList5 = arrayList32;
                                                                                                str29 = str63;
                                                                                                str13 = str65;
                                                                                                str16 = str25;
                                                                                                str14 = str66;
                                                                                                arrayList19 = arrayList38;
                                                                                                str30 = str94;
                                                                                                str74 = str27;
                                                                                                arrayList20 = arrayList43;
                                                                                                i12 = parseInt;
                                                                                                arrayList10 = arrayList51;
                                                                                                str71 = str86;
                                                                                                str31 = str92;
                                                                                                i13 = i32;
                                                                                                i14 = i11;
                                                                                                str17 = str64;
                                                                                                j20 = j49;
                                                                                                arrayList6 = arrayList35;
                                                                                                arrayList12 = arrayList57;
                                                                                                arrayList21 = arrayList39;
                                                                                                ArrayList arrayList60 = arrayList54;
                                                                                                str32 = str82;
                                                                                                str = str83;
                                                                                                long j62 = j48;
                                                                                                str33 = str76;
                                                                                                arrayList22 = arrayList18;
                                                                                                str34 = str77;
                                                                                                ArrayList arrayList61 = arrayList36;
                                                                                                arrayList14 = arrayList42;
                                                                                                long j63 = j46;
                                                                                                j14 = j45;
                                                                                                arrayList3 = arrayList61;
                                                                                                arrayList7 = arrayList28;
                                                                                                arrayList23 = arrayList56;
                                                                                                str35 = str62;
                                                                                                if (f5.a.z(xmlPullParser, str35)) {
                                                                                                    j22 = j63;
                                                                                                    long e11 = e(xmlPullParser, j56);
                                                                                                    z11 = z10;
                                                                                                    j21 = j61;
                                                                                                    s r6 = r(xmlPullParser, (p) sVar5, arrayList14, j62, j20, j21, e11, j22);
                                                                                                    str36 = str80;
                                                                                                    j24 = e11;
                                                                                                    j23 = j62;
                                                                                                    str38 = str79;
                                                                                                    sVar = r6;
                                                                                                    arrayList24 = arrayList52;
                                                                                                    arrayList25 = arrayList60;
                                                                                                    arrayList26 = arrayList55;
                                                                                                } else {
                                                                                                    j21 = j61;
                                                                                                    z11 = z10;
                                                                                                    j22 = j63;
                                                                                                    if (f5.a.z(xmlPullParser, str34)) {
                                                                                                        Pair g11 = g(xmlPullParser);
                                                                                                        Object obj3 = g11.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str93 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = g11.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList24 = arrayList52;
                                                                                                            arrayList24.add((n3.b) obj4);
                                                                                                        } else {
                                                                                                            arrayList24 = arrayList52;
                                                                                                        }
                                                                                                        j23 = j62;
                                                                                                        str36 = str80;
                                                                                                        sVar = sVar5;
                                                                                                        arrayList25 = arrayList60;
                                                                                                        i15 = i33;
                                                                                                        j24 = j56;
                                                                                                        str38 = str79;
                                                                                                        str39 = str93;
                                                                                                        arrayList26 = arrayList55;
                                                                                                    } else {
                                                                                                        str36 = str80;
                                                                                                        arrayList24 = arrayList52;
                                                                                                        if (f5.a.z(xmlPullParser, str36)) {
                                                                                                            j23 = j62;
                                                                                                            arrayList53.add(i(xmlPullParser, str36));
                                                                                                            j24 = j56;
                                                                                                            str37 = str23;
                                                                                                            arrayList25 = arrayList60;
                                                                                                        } else {
                                                                                                            j23 = j62;
                                                                                                            ArrayList arrayList62 = arrayList53;
                                                                                                            if (f5.a.z(xmlPullParser, str32)) {
                                                                                                                arrayList53 = arrayList62;
                                                                                                                arrayList25 = arrayList60;
                                                                                                                arrayList25.add(i(xmlPullParser, str32));
                                                                                                                j24 = j56;
                                                                                                                str37 = str23;
                                                                                                            } else {
                                                                                                                arrayList53 = arrayList62;
                                                                                                                str37 = str23;
                                                                                                                arrayList25 = arrayList60;
                                                                                                                if (f5.a.z(xmlPullParser, str37)) {
                                                                                                                    j24 = j56;
                                                                                                                    arrayList26 = arrayList55;
                                                                                                                    arrayList26.add(i(xmlPullParser, str37));
                                                                                                                } else {
                                                                                                                    j24 = j56;
                                                                                                                    arrayList26 = arrayList55;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                str23 = str37;
                                                                                                                str38 = str79;
                                                                                                                sVar = sVar5;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList26 = arrayList55;
                                                                                                        str23 = str37;
                                                                                                        str38 = str79;
                                                                                                        sVar = sVar5;
                                                                                                    }
                                                                                                }
                                                                                                i15 = i33;
                                                                                                str39 = str93;
                                                                                            }
                                                                                            if (f5.a.y(xmlPullParser, str38)) {
                                                                                                ArrayList arrayList63 = arrayList25;
                                                                                                arrayList52 = arrayList24;
                                                                                                long j64 = j22;
                                                                                                long j65 = j20;
                                                                                                str79 = str38;
                                                                                                arrayList55 = arrayList26;
                                                                                                j57 = j21;
                                                                                                str62 = str35;
                                                                                                str77 = str34;
                                                                                                arrayList56 = arrayList23;
                                                                                                arrayList28 = arrayList7;
                                                                                                arrayList18 = arrayList22;
                                                                                                str64 = str17;
                                                                                                z10 = z11;
                                                                                                arrayList39 = arrayList21;
                                                                                                arrayList42 = arrayList14;
                                                                                                arrayList44 = arrayList13;
                                                                                                str86 = str71;
                                                                                                j56 = j24;
                                                                                                str93 = str39;
                                                                                                i32 = i13;
                                                                                                arrayList31 = arrayList8;
                                                                                                arrayList51 = arrayList10;
                                                                                                arrayList38 = arrayList19;
                                                                                                str92 = str31;
                                                                                                parseInt = i12;
                                                                                                str66 = str14;
                                                                                                str69 = str30;
                                                                                                str68 = str28;
                                                                                                str63 = str29;
                                                                                                str65 = str13;
                                                                                                c10 = 1;
                                                                                                str80 = str36;
                                                                                                arrayList36 = arrayList3;
                                                                                                j45 = j14;
                                                                                                arrayList35 = arrayList6;
                                                                                                sVar5 = sVar;
                                                                                                j46 = j64;
                                                                                                str47 = str2;
                                                                                                i33 = i15;
                                                                                                parseInt9 = i14;
                                                                                                str85 = str85;
                                                                                                str76 = str33;
                                                                                                j48 = j23;
                                                                                                str83 = str;
                                                                                                arrayList43 = arrayList20;
                                                                                                str82 = str32;
                                                                                                str27 = str74;
                                                                                                arrayList54 = arrayList63;
                                                                                                arrayList57 = arrayList12;
                                                                                                str25 = str16;
                                                                                                j49 = j65;
                                                                                                arrayList32 = arrayList5;
                                                                                            } else {
                                                                                                if (f5.o.h(str85)) {
                                                                                                    if (str88 != null) {
                                                                                                        for (String str96 : d0.Q(str88)) {
                                                                                                            c3 = f5.o.c(str96);
                                                                                                            if (c3 != null && f5.o.h(c3)) {
                                                                                                                str40 = c3;
                                                                                                                str41 = str85;
                                                                                                                if ("audio/eac3".equals(str40)) {
                                                                                                                    int i34 = 0;
                                                                                                                    while (true) {
                                                                                                                        j25 = j20;
                                                                                                                        str42 = "ec+3";
                                                                                                                        if (i34 < arrayList26.size()) {
                                                                                                                            f fVar = (f) arrayList26.get(i34);
                                                                                                                            String str97 = fVar.a;
                                                                                                                            String str98 = fVar.b;
                                                                                                                            int i35 = i34;
                                                                                                                            if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str97) || !"JOC".equals(str98)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str97) || !"ec+3".equals(str98))) {
                                                                                                                                i34 = i35 + 1;
                                                                                                                                j20 = j25;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str40 = "audio/eac3";
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    j25 = j20;
                                                                                                                }
                                                                                                                str42 = str88;
                                                                                                                i16 = 0;
                                                                                                                int i36 = 0;
                                                                                                                while (i16 < arrayList9.size()) {
                                                                                                                    ArrayList arrayList64 = arrayList9;
                                                                                                                    ArrayList arrayList65 = arrayList26;
                                                                                                                    f fVar2 = (f) arrayList64.get(i16);
                                                                                                                    int i37 = i16;
                                                                                                                    if (n6.a("urn:mpeg:dash:role:2011", fVar2.a)) {
                                                                                                                        String str99 = fVar2.b;
                                                                                                                        i36 |= (str99 != null && (str99.equals("forced_subtitle") || str99.equals("forced-subtitle"))) ? 2 : 0;
                                                                                                                    }
                                                                                                                    i16 = i37 + 1;
                                                                                                                    arrayList9 = arrayList64;
                                                                                                                    arrayList26 = arrayList65;
                                                                                                                }
                                                                                                                ArrayList arrayList66 = arrayList26;
                                                                                                                arrayList27 = arrayList9;
                                                                                                                i17 = 0;
                                                                                                                int i38 = 0;
                                                                                                                while (i17 < arrayList27.size()) {
                                                                                                                    f fVar3 = (f) arrayList27.get(i17);
                                                                                                                    int i39 = i17;
                                                                                                                    if (n6.a("urn:mpeg:dash:role:2011", fVar3.a)) {
                                                                                                                        i38 |= n(fVar3.b);
                                                                                                                    }
                                                                                                                    i17 = i39 + 1;
                                                                                                                }
                                                                                                                i18 = 0;
                                                                                                                int i40 = 0;
                                                                                                                while (i18 < arrayList21.size()) {
                                                                                                                    ArrayList arrayList67 = arrayList21;
                                                                                                                    int i41 = i18;
                                                                                                                    f fVar4 = (f) arrayList67.get(i18);
                                                                                                                    ArrayList arrayList68 = arrayList24;
                                                                                                                    String str100 = fVar4.a;
                                                                                                                    long j66 = j22;
                                                                                                                    String str101 = fVar4.b;
                                                                                                                    if (n6.a("urn:mpeg:dash:role:2011", str100)) {
                                                                                                                        i21 = n(str101);
                                                                                                                    } else if (n6.a("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.a)) {
                                                                                                                        if (str101 != null) {
                                                                                                                            switch (str101.hashCode()) {
                                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                                                                                    if (str101.equals("1")) {
                                                                                                                                        c6 = 0;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                                                                                    if (str101.equals("2")) {
                                                                                                                                        c6 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                                case 51:
                                                                                                                                    if (str101.equals("3")) {
                                                                                                                                        c6 = 2;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                                case 52:
                                                                                                                                    if (str101.equals("4")) {
                                                                                                                                        c6 = 3;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                                case 53:
                                                                                                                                default:
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    if (str101.equals("6")) {
                                                                                                                                        c6 = 4;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    c6 = 65535;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (c6) {
                                                                                                                                case 0:
                                                                                                                                    i21 = 512;
                                                                                                                                    break;
                                                                                                                                case 1:
                                                                                                                                    i21 = 2048;
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    i21 = 4;
                                                                                                                                    break;
                                                                                                                                case 3:
                                                                                                                                    i21 = 8;
                                                                                                                                    break;
                                                                                                                                case 4:
                                                                                                                                    i21 = 1;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i21 = 0;
                                                                                                                    } else {
                                                                                                                        i18 = i41 + 1;
                                                                                                                        arrayList21 = arrayList67;
                                                                                                                        arrayList24 = arrayList68;
                                                                                                                        j22 = j66;
                                                                                                                    }
                                                                                                                    i40 |= i21;
                                                                                                                    i18 = i41 + 1;
                                                                                                                    arrayList21 = arrayList67;
                                                                                                                    arrayList24 = arrayList68;
                                                                                                                    j22 = j66;
                                                                                                                }
                                                                                                                ArrayList arrayList69 = arrayList24;
                                                                                                                long j67 = j22;
                                                                                                                ArrayList arrayList70 = arrayList21;
                                                                                                                int o10 = i38 | i40 | o(arrayList25) | o(arrayList66);
                                                                                                                i19 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList25.size()) {
                                                                                                                        f fVar5 = (f) arrayList25.get(i19);
                                                                                                                        if ((n6.a("http://dashif.org/thumbnail_tile", fVar5.a) || n6.a("http://dashif.org/guidelines/thumbnail_tile", fVar5.a)) && (str43 = fVar5.b) != null) {
                                                                                                                            int i42 = d0.a;
                                                                                                                            String[] split = str43.split("x", -1);
                                                                                                                            if (split.length != 2) {
                                                                                                                                continue;
                                                                                                                            } else {
                                                                                                                                try {
                                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[c10])));
                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i19++;
                                                                                                                    } else {
                                                                                                                        pair = null;
                                                                                                                    }
                                                                                                                }
                                                                                                                j3.s0 s0Var = new j3.s0();
                                                                                                                s0Var.a = attributeValue21;
                                                                                                                s0Var.n = str41;
                                                                                                                s0Var.o = str40;
                                                                                                                s0Var.h = str42;
                                                                                                                s0Var.g = i12;
                                                                                                                s0Var.d = i36;
                                                                                                                s0Var.e = o10;
                                                                                                                String str102 = str31;
                                                                                                                s0Var.c = str102;
                                                                                                                s0Var.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                s0Var.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                if (f5.o.j(str40)) {
                                                                                                                    s0Var.t = parseInt2;
                                                                                                                    s0Var.u = parseInt3;
                                                                                                                    s0Var.v = k11;
                                                                                                                } else {
                                                                                                                    int i43 = parseInt2;
                                                                                                                    int i44 = parseInt3;
                                                                                                                    if (f5.o.h(str40)) {
                                                                                                                        s0Var.B = i15;
                                                                                                                        s0Var.C = i14;
                                                                                                                    } else if (f5.o.i(str40)) {
                                                                                                                        if ("application/cea-608".equals(str40)) {
                                                                                                                            for (int i45 = 0; i45 < arrayList70.size(); i45++) {
                                                                                                                                f fVar6 = (f) arrayList70.get(i45);
                                                                                                                                String str103 = fVar6.a;
                                                                                                                                String str104 = fVar6.b;
                                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(str103) && str104 != null) {
                                                                                                                                    Matcher matcher = c.matcher(str104);
                                                                                                                                    if (matcher.matches()) {
                                                                                                                                        parseInt4 = Integer.parseInt(matcher.group(1));
                                                                                                                                        s0Var.G = parseInt4;
                                                                                                                                    } else {
                                                                                                                                        f5.a.K("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str104));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            parseInt4 = -1;
                                                                                                                            s0Var.G = parseInt4;
                                                                                                                        } else {
                                                                                                                            if ("application/cea-708".equals(str40)) {
                                                                                                                                for (int i46 = 0; i46 < arrayList70.size(); i46++) {
                                                                                                                                    f fVar7 = (f) arrayList70.get(i46);
                                                                                                                                    String str105 = fVar7.a;
                                                                                                                                    String str106 = fVar7.b;
                                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str105) && str106 != null) {
                                                                                                                                        Matcher matcher2 = d.matcher(str106);
                                                                                                                                        if (matcher2.matches()) {
                                                                                                                                            parseInt4 = Integer.parseInt(matcher2.group(1));
                                                                                                                                            s0Var.G = parseInt4;
                                                                                                                                        } else {
                                                                                                                                            f5.a.K("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str106));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            parseInt4 = -1;
                                                                                                                            s0Var.G = parseInt4;
                                                                                                                        }
                                                                                                                    } else if ("image".equals(f5.o.f(str40))) {
                                                                                                                        s0Var.t = i43;
                                                                                                                        s0Var.u = i44;
                                                                                                                    }
                                                                                                                }
                                                                                                                t0 t0Var2 = new t0(s0Var);
                                                                                                                d dVar2 = new d(t0Var2, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList69, arrayList53, arrayList25, arrayList66);
                                                                                                                i26 = f5.o.g(t0Var2.B);
                                                                                                                i20 = i13;
                                                                                                                if (i20 != -1) {
                                                                                                                    if (i26 != -1) {
                                                                                                                        f5.a.i(i20 == i26);
                                                                                                                    }
                                                                                                                    i26 = i20;
                                                                                                                }
                                                                                                                ArrayList arrayList71 = arrayList20;
                                                                                                                arrayList71.add(dVar2);
                                                                                                                arrayList16 = arrayList71;
                                                                                                                str19 = str102;
                                                                                                                arrayList15 = arrayList70;
                                                                                                                arrayList9 = arrayList27;
                                                                                                                str62 = str35;
                                                                                                                str21 = str67;
                                                                                                                j48 = j23;
                                                                                                                j54 = j17;
                                                                                                                j16 = j25;
                                                                                                                j19 = j67;
                                                                                                                arrayList17 = arrayList19;
                                                                                                                str20 = str30;
                                                                                                                str18 = str28;
                                                                                                                str22 = str29;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str41 = str85;
                                                                                                    str40 = null;
                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                    }
                                                                                                    str42 = str88;
                                                                                                    i16 = 0;
                                                                                                    int i362 = 0;
                                                                                                    while (i16 < arrayList9.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList662 = arrayList26;
                                                                                                    arrayList27 = arrayList9;
                                                                                                    i17 = 0;
                                                                                                    int i382 = 0;
                                                                                                    while (i17 < arrayList27.size()) {
                                                                                                    }
                                                                                                    i18 = 0;
                                                                                                    int i402 = 0;
                                                                                                    while (i18 < arrayList21.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList692 = arrayList24;
                                                                                                    long j672 = j22;
                                                                                                    ArrayList arrayList702 = arrayList21;
                                                                                                    int o102 = i382 | i402 | o(arrayList25) | o(arrayList662);
                                                                                                    i19 = 0;
                                                                                                    while (true) {
                                                                                                        if (i19 < arrayList25.size()) {
                                                                                                        }
                                                                                                        i19++;
                                                                                                    }
                                                                                                    j3.s0 s0Var2 = new j3.s0();
                                                                                                    s0Var2.a = attributeValue21;
                                                                                                    s0Var2.n = str41;
                                                                                                    s0Var2.o = str40;
                                                                                                    s0Var2.h = str42;
                                                                                                    s0Var2.g = i12;
                                                                                                    s0Var2.d = i362;
                                                                                                    s0Var2.e = o102;
                                                                                                    String str1022 = str31;
                                                                                                    s0Var2.c = str1022;
                                                                                                    s0Var2.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                    s0Var2.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                    if (f5.o.j(str40)) {
                                                                                                    }
                                                                                                    t0 t0Var22 = new t0(s0Var2);
                                                                                                    if (sVar != null) {
                                                                                                    }
                                                                                                    d dVar22 = new d(t0Var22, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList692, arrayList53, arrayList25, arrayList662);
                                                                                                    i26 = f5.o.g(t0Var22.B);
                                                                                                    i20 = i13;
                                                                                                    if (i20 != -1) {
                                                                                                    }
                                                                                                    ArrayList arrayList712 = arrayList20;
                                                                                                    arrayList712.add(dVar22);
                                                                                                    arrayList16 = arrayList712;
                                                                                                    str19 = str1022;
                                                                                                    arrayList15 = arrayList702;
                                                                                                    arrayList9 = arrayList27;
                                                                                                    str62 = str35;
                                                                                                    str21 = str67;
                                                                                                    j48 = j23;
                                                                                                    j54 = j17;
                                                                                                    j16 = j25;
                                                                                                    j19 = j672;
                                                                                                    arrayList17 = arrayList19;
                                                                                                    str20 = str30;
                                                                                                    str18 = str28;
                                                                                                    str22 = str29;
                                                                                                } else if (f5.o.j(str85)) {
                                                                                                    if (str88 != null) {
                                                                                                        for (String str107 : d0.Q(str88)) {
                                                                                                            c3 = f5.o.c(str107);
                                                                                                            if (c3 != null && f5.o.j(c3)) {
                                                                                                                str40 = c3;
                                                                                                                str41 = str85;
                                                                                                                if ("audio/eac3".equals(str40)) {
                                                                                                                }
                                                                                                                str42 = str88;
                                                                                                                i16 = 0;
                                                                                                                int i3622 = 0;
                                                                                                                while (i16 < arrayList9.size()) {
                                                                                                                }
                                                                                                                ArrayList arrayList6622 = arrayList26;
                                                                                                                arrayList27 = arrayList9;
                                                                                                                i17 = 0;
                                                                                                                int i3822 = 0;
                                                                                                                while (i17 < arrayList27.size()) {
                                                                                                                }
                                                                                                                i18 = 0;
                                                                                                                int i4022 = 0;
                                                                                                                while (i18 < arrayList21.size()) {
                                                                                                                }
                                                                                                                ArrayList arrayList6922 = arrayList24;
                                                                                                                long j6722 = j22;
                                                                                                                ArrayList arrayList7022 = arrayList21;
                                                                                                                int o1022 = i3822 | i4022 | o(arrayList25) | o(arrayList6622);
                                                                                                                i19 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i19 < arrayList25.size()) {
                                                                                                                    }
                                                                                                                    i19++;
                                                                                                                }
                                                                                                                j3.s0 s0Var22 = new j3.s0();
                                                                                                                s0Var22.a = attributeValue21;
                                                                                                                s0Var22.n = str41;
                                                                                                                s0Var22.o = str40;
                                                                                                                s0Var22.h = str42;
                                                                                                                s0Var22.g = i12;
                                                                                                                s0Var22.d = i3622;
                                                                                                                s0Var22.e = o1022;
                                                                                                                String str10222 = str31;
                                                                                                                s0Var22.c = str10222;
                                                                                                                s0Var22.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                s0Var22.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                if (f5.o.j(str40)) {
                                                                                                                }
                                                                                                                t0 t0Var222 = new t0(s0Var22);
                                                                                                                if (sVar != null) {
                                                                                                                }
                                                                                                                d dVar222 = new d(t0Var222, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList6922, arrayList53, arrayList25, arrayList6622);
                                                                                                                i26 = f5.o.g(t0Var222.B);
                                                                                                                i20 = i13;
                                                                                                                if (i20 != -1) {
                                                                                                                }
                                                                                                                ArrayList arrayList7122 = arrayList20;
                                                                                                                arrayList7122.add(dVar222);
                                                                                                                arrayList16 = arrayList7122;
                                                                                                                str19 = str10222;
                                                                                                                arrayList15 = arrayList7022;
                                                                                                                arrayList9 = arrayList27;
                                                                                                                str62 = str35;
                                                                                                                str21 = str67;
                                                                                                                j48 = j23;
                                                                                                                j54 = j17;
                                                                                                                j16 = j25;
                                                                                                                j19 = j6722;
                                                                                                                arrayList17 = arrayList19;
                                                                                                                str20 = str30;
                                                                                                                str18 = str28;
                                                                                                                str22 = str29;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str41 = str85;
                                                                                                    str40 = null;
                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                    }
                                                                                                    str42 = str88;
                                                                                                    i16 = 0;
                                                                                                    int i36222 = 0;
                                                                                                    while (i16 < arrayList9.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList66222 = arrayList26;
                                                                                                    arrayList27 = arrayList9;
                                                                                                    i17 = 0;
                                                                                                    int i38222 = 0;
                                                                                                    while (i17 < arrayList27.size()) {
                                                                                                    }
                                                                                                    i18 = 0;
                                                                                                    int i40222 = 0;
                                                                                                    while (i18 < arrayList21.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList69222 = arrayList24;
                                                                                                    long j67222 = j22;
                                                                                                    ArrayList arrayList70222 = arrayList21;
                                                                                                    int o10222 = i38222 | i40222 | o(arrayList25) | o(arrayList66222);
                                                                                                    i19 = 0;
                                                                                                    while (true) {
                                                                                                        if (i19 < arrayList25.size()) {
                                                                                                        }
                                                                                                        i19++;
                                                                                                    }
                                                                                                    j3.s0 s0Var222 = new j3.s0();
                                                                                                    s0Var222.a = attributeValue21;
                                                                                                    s0Var222.n = str41;
                                                                                                    s0Var222.o = str40;
                                                                                                    s0Var222.h = str42;
                                                                                                    s0Var222.g = i12;
                                                                                                    s0Var222.d = i36222;
                                                                                                    s0Var222.e = o10222;
                                                                                                    String str102222 = str31;
                                                                                                    s0Var222.c = str102222;
                                                                                                    s0Var222.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                    s0Var222.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                    if (f5.o.j(str40)) {
                                                                                                    }
                                                                                                    t0 t0Var2222 = new t0(s0Var222);
                                                                                                    if (sVar != null) {
                                                                                                    }
                                                                                                    d dVar2222 = new d(t0Var2222, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList69222, arrayList53, arrayList25, arrayList66222);
                                                                                                    i26 = f5.o.g(t0Var2222.B);
                                                                                                    i20 = i13;
                                                                                                    if (i20 != -1) {
                                                                                                    }
                                                                                                    ArrayList arrayList71222 = arrayList20;
                                                                                                    arrayList71222.add(dVar2222);
                                                                                                    arrayList16 = arrayList71222;
                                                                                                    str19 = str102222;
                                                                                                    arrayList15 = arrayList70222;
                                                                                                    arrayList9 = arrayList27;
                                                                                                    str62 = str35;
                                                                                                    str21 = str67;
                                                                                                    j48 = j23;
                                                                                                    j54 = j17;
                                                                                                    j16 = j25;
                                                                                                    j19 = j67222;
                                                                                                    arrayList17 = arrayList19;
                                                                                                    str20 = str30;
                                                                                                    str18 = str28;
                                                                                                    str22 = str29;
                                                                                                } else {
                                                                                                    if (f5.o.i(str85) || "image".equals(f5.o.f(str85))) {
                                                                                                        str40 = str85;
                                                                                                        str41 = str40;
                                                                                                    } else {
                                                                                                        str41 = str85;
                                                                                                        if ("application/mp4".equals(str41)) {
                                                                                                            str40 = f5.o.c(str88);
                                                                                                            if ("text/vtt".equals(str40)) {
                                                                                                                str40 = "application/x-mp4-vtt";
                                                                                                            }
                                                                                                        }
                                                                                                        str40 = null;
                                                                                                    }
                                                                                                    if ("audio/eac3".equals(str40)) {
                                                                                                    }
                                                                                                    str42 = str88;
                                                                                                    i16 = 0;
                                                                                                    int i362222 = 0;
                                                                                                    while (i16 < arrayList9.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList662222 = arrayList26;
                                                                                                    arrayList27 = arrayList9;
                                                                                                    i17 = 0;
                                                                                                    int i382222 = 0;
                                                                                                    while (i17 < arrayList27.size()) {
                                                                                                    }
                                                                                                    i18 = 0;
                                                                                                    int i402222 = 0;
                                                                                                    while (i18 < arrayList21.size()) {
                                                                                                    }
                                                                                                    ArrayList arrayList692222 = arrayList24;
                                                                                                    long j672222 = j22;
                                                                                                    ArrayList arrayList702222 = arrayList21;
                                                                                                    int o102222 = i382222 | i402222 | o(arrayList25) | o(arrayList662222);
                                                                                                    i19 = 0;
                                                                                                    while (true) {
                                                                                                        if (i19 < arrayList25.size()) {
                                                                                                        }
                                                                                                        i19++;
                                                                                                    }
                                                                                                    j3.s0 s0Var2222 = new j3.s0();
                                                                                                    s0Var2222.a = attributeValue21;
                                                                                                    s0Var2222.n = str41;
                                                                                                    s0Var2222.o = str40;
                                                                                                    s0Var2222.h = str42;
                                                                                                    s0Var2222.g = i12;
                                                                                                    s0Var2222.d = i362222;
                                                                                                    s0Var2222.e = o102222;
                                                                                                    String str1022222 = str31;
                                                                                                    s0Var2222.c = str1022222;
                                                                                                    s0Var2222.H = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                    s0Var2222.I = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                    if (f5.o.j(str40)) {
                                                                                                    }
                                                                                                    t0 t0Var22222 = new t0(s0Var2222);
                                                                                                    if (sVar != null) {
                                                                                                    }
                                                                                                    d dVar22222 = new d(t0Var22222, !arrayList23.isEmpty() ? arrayList23 : arrayList22, sVar != null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList692222, arrayList53, arrayList25, arrayList662222);
                                                                                                    i26 = f5.o.g(t0Var22222.B);
                                                                                                    i20 = i13;
                                                                                                    if (i20 != -1) {
                                                                                                    }
                                                                                                    ArrayList arrayList712222 = arrayList20;
                                                                                                    arrayList712222.add(dVar22222);
                                                                                                    arrayList16 = arrayList712222;
                                                                                                    str19 = str1022222;
                                                                                                    arrayList15 = arrayList702222;
                                                                                                    arrayList9 = arrayList27;
                                                                                                    str62 = str35;
                                                                                                    str21 = str67;
                                                                                                    j48 = j23;
                                                                                                    j54 = j17;
                                                                                                    j16 = j25;
                                                                                                    j19 = j672222;
                                                                                                    arrayList17 = arrayList19;
                                                                                                    str20 = str30;
                                                                                                    str18 = str28;
                                                                                                    str22 = str29;
                                                                                                }
                                                                                                str7 = str61;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str2 = str47;
                                                                                z11 = z10;
                                                                                arrayList8 = arrayList31;
                                                                                arrayList5 = arrayList32;
                                                                                str29 = str63;
                                                                                str13 = str65;
                                                                                str16 = str25;
                                                                                str14 = str66;
                                                                                arrayList19 = arrayList38;
                                                                                str28 = str68;
                                                                                str30 = str69;
                                                                                str74 = str27;
                                                                                arrayList20 = arrayList43;
                                                                                i12 = parseInt;
                                                                                arrayList10 = arrayList51;
                                                                                str36 = str80;
                                                                                str71 = str86;
                                                                                str31 = str92;
                                                                                i13 = i32;
                                                                                sVar = sVar5;
                                                                                i15 = i33;
                                                                                i14 = i11;
                                                                                j24 = j56;
                                                                                str17 = str64;
                                                                                arrayList13 = arrayList44;
                                                                                j23 = j48;
                                                                                str38 = str79;
                                                                                str39 = str93;
                                                                                arrayList26 = arrayList55;
                                                                                str33 = str76;
                                                                                j21 = j57;
                                                                                arrayList25 = arrayList54;
                                                                                arrayList22 = arrayList18;
                                                                                j20 = j49;
                                                                                arrayList6 = arrayList35;
                                                                                str32 = str82;
                                                                                str34 = str77;
                                                                                str = str83;
                                                                                arrayList12 = arrayList57;
                                                                                arrayList21 = arrayList39;
                                                                                j22 = j46;
                                                                                j14 = j45;
                                                                                arrayList3 = arrayList36;
                                                                                arrayList14 = arrayList42;
                                                                                arrayList7 = arrayList28;
                                                                                arrayList24 = arrayList52;
                                                                                arrayList23 = arrayList56;
                                                                                str35 = str62;
                                                                                if (f5.a.y(xmlPullParser, str38)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList10 = arrayList37;
                                                                            str2 = str47;
                                                                            z11 = z10;
                                                                            arrayList11 = arrayList41;
                                                                            long j68 = j46;
                                                                            long j69 = j49;
                                                                            arrayList8 = arrayList31;
                                                                            arrayList5 = arrayList32;
                                                                            String str108 = str62;
                                                                            str12 = str63;
                                                                            arrayList6 = arrayList35;
                                                                            str13 = str65;
                                                                            str14 = str66;
                                                                            ArrayList arrayList72 = arrayList38;
                                                                            String str109 = str68;
                                                                            String str110 = str69;
                                                                            str15 = str70;
                                                                            f9 = f13;
                                                                            ArrayList arrayList73 = arrayList43;
                                                                            str16 = str72;
                                                                            arrayList12 = arrayList34;
                                                                            str17 = str64;
                                                                            String str111 = str73;
                                                                            arrayList13 = arrayList44;
                                                                            ArrayList arrayList74 = arrayList39;
                                                                            j14 = j45;
                                                                            long j70 = j48;
                                                                            arrayList3 = arrayList36;
                                                                            int i47 = i26;
                                                                            arrayList14 = arrayList42;
                                                                            arrayList7 = arrayList28;
                                                                            if (f5.a.z(xmlPullParser, str110)) {
                                                                                sVar3 = p(xmlPullParser, (r) sVar3);
                                                                                str19 = str111;
                                                                                arrayList15 = arrayList74;
                                                                                i26 = i47;
                                                                                str62 = str108;
                                                                                str21 = str67;
                                                                                j48 = j70;
                                                                                j16 = j69;
                                                                                j19 = j68;
                                                                                arrayList17 = arrayList72;
                                                                                arrayList16 = arrayList73;
                                                                                str18 = str109;
                                                                                str22 = str12;
                                                                                str20 = str110;
                                                                                j54 = j17;
                                                                            } else {
                                                                                str18 = str109;
                                                                                if (f5.a.z(xmlPullParser, str18)) {
                                                                                    long e12 = e(xmlPullParser, j53);
                                                                                    str19 = str111;
                                                                                    arrayList15 = arrayList74;
                                                                                    i10 = i47;
                                                                                    arrayList16 = arrayList73;
                                                                                    sVar3 = q(xmlPullParser, (o) sVar3, j70, j69, j17, e12, j68);
                                                                                    j19 = j68;
                                                                                    j16 = j69;
                                                                                    j48 = j70;
                                                                                    j53 = e12;
                                                                                    str62 = str108;
                                                                                    str21 = str67;
                                                                                    str20 = str110;
                                                                                } else {
                                                                                    str19 = str111;
                                                                                    arrayList15 = arrayList74;
                                                                                    i10 = i47;
                                                                                    j48 = j70;
                                                                                    j18 = j53;
                                                                                    j16 = j69;
                                                                                    j19 = j68;
                                                                                    arrayList16 = arrayList73;
                                                                                    if (f5.a.z(xmlPullParser, str108)) {
                                                                                        long e13 = e(xmlPullParser, j18);
                                                                                        str62 = str108;
                                                                                        str20 = str110;
                                                                                        sVar3 = r(xmlPullParser, (p) sVar3, arrayList14, j48, j16, j17, e13, j19);
                                                                                        j53 = e13;
                                                                                        str21 = str67;
                                                                                    } else {
                                                                                        str62 = str108;
                                                                                        str20 = str110;
                                                                                        if (f5.a.z(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList17 = arrayList72;
                                                                                            arrayList17.add(i(xmlPullParser, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList17 = arrayList72;
                                                                                            if (f5.a.z(xmlPullParser, "Label")) {
                                                                                                String str112 = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str112 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                } while (!f5.a.y(xmlPullParser, "Label"));
                                                                                                j53 = j18;
                                                                                                str21 = str112;
                                                                                                j54 = j17;
                                                                                                i26 = i10;
                                                                                                str22 = str12;
                                                                                            } else if (xmlPullParser.getEventType() == 2) {
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                        j53 = j18;
                                                                                        str21 = str67;
                                                                                        j54 = j17;
                                                                                        i26 = i10;
                                                                                        str22 = str12;
                                                                                    }
                                                                                }
                                                                                j54 = j17;
                                                                                i26 = i10;
                                                                                arrayList17 = arrayList72;
                                                                                str22 = str12;
                                                                            }
                                                                        }
                                                                        if (f5.a.y(xmlPullParser, str22)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList10 = arrayList37;
                                                        str19 = str73;
                                                        i10 = i26;
                                                        str2 = str47;
                                                        z11 = z10;
                                                        arrayList9 = arrayList40;
                                                        arrayList11 = arrayList41;
                                                        str3 = str48;
                                                        arrayList8 = arrayList31;
                                                        arrayList5 = arrayList32;
                                                        str12 = str63;
                                                        str13 = str65;
                                                        str14 = str66;
                                                        str18 = str68;
                                                        str20 = str69;
                                                        str15 = str70;
                                                        f9 = f13;
                                                        arrayList16 = arrayList43;
                                                        str16 = str72;
                                                        j18 = j53;
                                                        str17 = str64;
                                                        arrayList13 = arrayList44;
                                                        j16 = j49;
                                                        arrayList6 = arrayList35;
                                                        arrayList12 = arrayList34;
                                                        arrayList15 = arrayList39;
                                                        j19 = j46;
                                                        arrayList17 = arrayList38;
                                                        j14 = j45;
                                                        arrayList3 = arrayList36;
                                                        arrayList14 = arrayList42;
                                                        arrayList7 = arrayList28;
                                                        j53 = j18;
                                                        str21 = str67;
                                                        j54 = j17;
                                                        i26 = i10;
                                                        str22 = str12;
                                                        if (f5.a.y(xmlPullParser, str22)) {
                                                        }
                                                    }
                                                }
                                                arrayList10 = arrayList37;
                                                str19 = str73;
                                                str2 = str47;
                                                z11 = z10;
                                                arrayList9 = arrayList40;
                                                arrayList11 = arrayList41;
                                                str3 = str48;
                                                arrayList8 = arrayList31;
                                                arrayList5 = arrayList32;
                                                str13 = str65;
                                                str14 = str66;
                                                str21 = str67;
                                                str18 = str68;
                                                str20 = str69;
                                                str15 = str70;
                                                f9 = f13;
                                                arrayList16 = arrayList43;
                                                str16 = str72;
                                                j54 = j17;
                                                str17 = str64;
                                                arrayList13 = arrayList44;
                                                j16 = j49;
                                                str22 = str63;
                                                arrayList6 = arrayList35;
                                                arrayList12 = arrayList34;
                                                arrayList15 = arrayList39;
                                                j19 = j46;
                                                arrayList17 = arrayList38;
                                                j14 = j45;
                                                arrayList3 = arrayList36;
                                                arrayList14 = arrayList42;
                                                arrayList7 = arrayList28;
                                                if (f5.a.y(xmlPullParser, str22)) {
                                                }
                                            }
                                        } else {
                                            str = str57;
                                            j11 = j36;
                                            str2 = str47;
                                            String str113 = str58;
                                            String str114 = str59;
                                            z11 = z10;
                                            str3 = str48;
                                            long j71 = j46;
                                            long j72 = j49;
                                            ArrayList arrayList75 = arrayList31;
                                            arrayList5 = arrayList32;
                                            arrayList6 = arrayList33;
                                            j14 = j45;
                                            arrayList3 = arrayList29;
                                            arrayList7 = arrayList28;
                                            if (f5.a.z(xmlPullParser, "EventStream")) {
                                                str4 = str60;
                                                String attributeValue28 = xmlPullParser.getAttributeValue(null, str4);
                                                String str115 = attributeValue28 == null ? "" : attributeValue28;
                                                String str116 = str114;
                                                String attributeValue29 = xmlPullParser.getAttributeValue(null, str116);
                                                String str117 = attributeValue29 == null ? "" : attributeValue29;
                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong = attributeValue30 == null ? 1L : Long.parseLong(attributeValue30);
                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong2 = attributeValue31 == null ? 0L : Long.parseLong(attributeValue31);
                                                ArrayList arrayList76 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str118 = "Event";
                                                    if (f5.a.z(xmlPullParser, "Event")) {
                                                        str8 = str;
                                                        String attributeValue32 = xmlPullParser.getAttributeValue(null, str8);
                                                        long parseLong3 = attributeValue32 == null ? 0L : Long.parseLong(attributeValue32);
                                                        String str119 = str113;
                                                        String attributeValue33 = xmlPullParser.getAttributeValue(null, str119);
                                                        long parseLong4 = attributeValue33 == null ? -9223372036854775807L : Long.parseLong(attributeValue33);
                                                        String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong5 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                        long O = d0.O(parseLong4, 1000L, parseLong);
                                                        long O2 = d0.O(parseLong5 - parseLong2, 1000000L, parseLong);
                                                        String attributeValue35 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue35 == null) {
                                                            attributeValue35 = null;
                                                        }
                                                        byteArrayOutputStream.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str5 = str116;
                                                        newSerializer.setOutput(byteArrayOutputStream, p8.d.c.name());
                                                        xmlPullParser.nextToken();
                                                        while (!f5.a.y(xmlPullParser, str118)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    str9 = str118;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i48 = 0;
                                                                    while (i48 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i48), xmlPullParser.getAttributeName(i48), xmlPullParser.getAttributeValue(i48));
                                                                        i48++;
                                                                        str115 = str115;
                                                                        str117 = str117;
                                                                    }
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 3:
                                                                    str9 = str118;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                                default:
                                                                    str9 = str118;
                                                                    str10 = str115;
                                                                    str11 = str117;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            str118 = str9;
                                                            str115 = str10;
                                                            str117 = str11;
                                                        }
                                                        String str120 = str115;
                                                        String str121 = str117;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(O2);
                                                        if (attributeValue35 != null) {
                                                            byteArray = attributeValue35.getBytes(p8.d.c);
                                                        }
                                                        str6 = str119;
                                                        str115 = str120;
                                                        str117 = str121;
                                                        arrayList76.add(Pair.create(valueOf, new d4.a(str115, str117, O, parseLong3, byteArray)));
                                                    } else {
                                                        str5 = str116;
                                                        str8 = str;
                                                        str6 = str113;
                                                        b(xmlPullParser);
                                                    }
                                                    if (f5.a.y(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList76.size()];
                                                        d4.a[] aVarArr = new d4.a[arrayList76.size()];
                                                        for (int i49 = 0; i49 < arrayList76.size(); i49++) {
                                                            Pair pair2 = (Pair) arrayList76.get(i49);
                                                            jArr[i49] = ((Long) pair2.first).longValue();
                                                            aVarArr[i49] = (d4.a) pair2.second;
                                                        }
                                                        arrayList5.add(new g(str115, str117, jArr, aVarArr));
                                                        arrayList8 = arrayList75;
                                                        str = str8;
                                                        j16 = j72;
                                                        j12 = j71;
                                                    } else {
                                                        str = str8;
                                                        str113 = str6;
                                                        str116 = str5;
                                                    }
                                                }
                                            } else {
                                                str4 = str60;
                                                str5 = str114;
                                                str6 = str113;
                                                if (f5.a.z(xmlPullParser, "SegmentBase")) {
                                                    sVar2 = p(xmlPullParser, null);
                                                    arrayList5 = arrayList5;
                                                    arrayList8 = arrayList75;
                                                    str7 = str61;
                                                    j16 = j72;
                                                    j12 = j71;
                                                    j13 = -9223372036854775807L;
                                                } else if (f5.a.z(xmlPullParser, "SegmentList")) {
                                                    j13 = -9223372036854775807L;
                                                    long e14 = e(xmlPullParser, -9223372036854775807L);
                                                    arrayList5 = arrayList5;
                                                    sVar2 = q(xmlPullParser, null, j48, j72, j15, e14, j71);
                                                    j16 = j72;
                                                    j50 = e14;
                                                    arrayList8 = arrayList75;
                                                    str7 = str61;
                                                    j12 = j71;
                                                } else {
                                                    arrayList5 = arrayList5;
                                                    j16 = j72;
                                                    j13 = -9223372036854775807L;
                                                    if (f5.a.z(xmlPullParser, "SegmentTemplate")) {
                                                        long e15 = e(xmlPullParser, -9223372036854775807L);
                                                        x xVar = z.b;
                                                        arrayList8 = arrayList75;
                                                        j12 = j71;
                                                        sVar2 = r(xmlPullParser, null, l0.e, j48, j16, j15, e15, j12);
                                                        j50 = e15;
                                                    } else {
                                                        arrayList8 = arrayList75;
                                                        j12 = j71;
                                                        if (f5.a.z(xmlPullParser, "AssetIdentifier")) {
                                                            i(xmlPullParser, "AssetIdentifier");
                                                        } else {
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                    str7 = str61;
                                                }
                                            }
                                        }
                                        j13 = -9223372036854775807L;
                                        str7 = str61;
                                    }
                                    if (f5.a.y(xmlPullParser, str7)) {
                                        Pair create = Pair.create(new h(attributeValue11, j47, arrayList8, arrayList5), Long.valueOf(j16));
                                        h hVar = (h) create.first;
                                        if (hVar.b != j13) {
                                            long longValue = ((Long) create.second).longValue();
                                            long j73 = longValue == j13 ? j13 : longValue + hVar.b;
                                            arrayList2 = arrayList7;
                                            arrayList2.add(hVar);
                                            j11 = j73;
                                        } else {
                                            if (!equals) {
                                                throw t1.b("Unable to determine start of period " + arrayList7.size(), null);
                                            }
                                            arrayList2 = arrayList7;
                                            z13 = true;
                                        }
                                    } else {
                                        long j74 = j16;
                                        arrayList33 = arrayList6;
                                        j49 = j74;
                                        str61 = str7;
                                        str60 = str4;
                                        arrayList28 = arrayList7;
                                        arrayList29 = arrayList3;
                                        j45 = j14;
                                        j51 = j15;
                                        arrayList30 = arrayList4;
                                        j36 = j11;
                                        str58 = str6;
                                        str57 = str;
                                        str48 = str3;
                                        str47 = str2;
                                        arrayList31 = arrayList8;
                                        arrayList32 = arrayList5;
                                        j46 = j12;
                                        z10 = z11;
                                        str59 = str5;
                                    }
                                }
                            }
                            j35 = j14;
                        }
                        if (!f5.a.y(xmlPullParser, "MPD")) {
                            if (j30 == j13) {
                                if (j11 != j13) {
                                    j30 = j11;
                                } else if (!equals) {
                                    throw t1.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                throw t1.b("No periods found.", null);
                            }
                            return new c(K, j30, j31, equals, j32, j12, j34, K2, iVar, cVar, a1Var, uri2, arrayList2);
                        }
                        arrayList28 = arrayList2;
                        j33 = j12;
                        j29 = j13;
                        arrayList29 = arrayList3;
                        k9 = arrayList;
                        z10 = z11;
                        j36 = j11;
                        str46 = null;
                    }
                    z11 = z10;
                    arrayList2 = arrayList28;
                }
                j13 = j10;
            }
            j12 = j33;
            if (!f5.a.y(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
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

    public static int n(String str) {
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

    public static int o(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (n6.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) {
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
            if (f5.a.z(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (f5.a.y(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j11, j13, j17, j16);
            }
            jVar = jVar2;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) {
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
            if (f5.a.z(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (f5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j16, j11);
            } else if (f5.a.z(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!f5.a.y(xmlPullParser, "SegmentList"));
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
        return new o(jVar, j16, j18, j22, j20, list2, j24, list, d0.H(j14), d0.H(j10));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) {
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
            if (n6.a("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                j15 = Long.parseLong(fVar.b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        v5.l t10 = t(xmlPullParser, "media", pVar != null ? pVar.k : null);
        v5.l t11 = t(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (f5.a.z(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (f5.a.z(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!f5.a.y(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.a;
            }
            if (list2 == null) {
                list2 = pVar.f;
            }
        }
        return new p(jVar, j17, j19, j23, j24, j21, list2, j26, t11, t10, d0.H(j14), d0.H(j10));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j10, long j11) {
        long j12;
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        long j14 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (f5.a.z(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
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
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!f5.a.y(xmlPullParser, "SegmentTimeline"));
        if (!z10) {
            return arrayList;
        }
        a(arrayList, j13, j14, i10, d0.O(j11, j10, 1000L));
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.String[]] */
    public static v5.l t(XmlPullParser xmlPullParser, String str, v5.l lVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return lVar;
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
                r14[i11] = w.q(new StringBuilder(), r14[i11], "$");
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
        return new v5.l((Serializable) r14, (Serializable) r02, (Serializable) r12, i11);
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public final Object d(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(oVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return l(newPullParser, uri);
            }
            throw t1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw t1.b(null, e10);
        }
    }
}
