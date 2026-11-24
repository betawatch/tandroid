// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ud7 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        zw8 f;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (f = f(str2)) != null && (a2 = f.a()) != 0 && a2 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] e0 = g8c.e0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : e0) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        zw8 f;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (f = f(str2)) == null) {
                    return 0;
                }
                return f.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        zw8 f;
        String str2 = null;
        if (str != null) {
            String c = smd.c(str.trim());
            if (c.startsWith("avc1") || c.startsWith("avc3")) {
                return "video/avc";
            }
            if (c.startsWith("hev1") || c.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (c.startsWith("vvc1") || c.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (c.startsWith("dvav") || c.startsWith("dva1") || c.startsWith("dvhe") || c.startsWith("dvh1") || c.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (c.startsWith("av01")) {
                return "video/av01";
            }
            if (c.startsWith("vp9") || c.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (c.startsWith("vp8") || c.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (c.startsWith("mp4a")) {
                if (c.startsWith("mp4a.") && (f = f(c)) != null) {
                    str2 = e(f.b);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (c.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (c.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (c.startsWith("ac-3") || c.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (c.startsWith("ec-3") || c.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (c.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (c.startsWith("ac-4") || c.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (c.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (c.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (c.startsWith("dtsh") || c.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (c.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (c.startsWith("opus")) {
                return "audio/opus";
            }
            if (c.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (c.startsWith("flac")) {
                return "audio/flac";
            }
            if (c.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (c.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (c.contains("cea708")) {
                return "application/cea-708";
            }
            if (c.contains("eia608") || c.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                fyb.g();
                return null;
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case kk7.h1 /* 97 */:
            case kk7.i1 /* 98 */:
            case kk7.j1 /* 99 */:
            case kk7.k1 /* 100 */:
            case 101:
                return "video/mpeg2";
            case kk7.m1 /* 102 */:
            case kk7.n1 /* 103 */:
            case kk7.o1 /* 104 */:
                return "audio/mp4a-latm";
            case kk7.p1 /* 105 */:
            case kk7.r1 /* 107 */:
                return "audio/mpeg";
            case kk7.q1 /* 106 */:
                return "video/mpeg";
            case kk7.s1 /* 108 */:
                return "image/jpeg";
            default:
                switch (i) {
                    case kk7.y2 /* 169 */:
                    case kk7.B2 /* 172 */:
                        return "audio/vnd.dts";
                    case kk7.z2 /* 170 */:
                    case kk7.A2 /* 171 */:
                        return "audio/vnd.dts.hd";
                    case kk7.C2 /* 173 */:
                        return "audio/opus";
                    case kk7.D2 /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static zw8 f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new zw8(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, (byte) 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        fyb.g();
        return 0;
    }

    public static boolean i(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(g(str));
    }

    public static String n(String str) {
        String c;
        if (str == null) {
            return null;
        }
        c = smd.c(str);
        c.getClass();
        switch (c) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return c;
        }
    }
}
