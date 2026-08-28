package y3;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import bg.l0;
import d5.f0;
import g7.b0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o8.z;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (f0.a < 26 && f0.b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new l0(new r(2), 5));
        }
        int i9 = f0.a;
        if (i9 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new l0(new r(3), 5));
            }
        }
        if (i9 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(t0 t0Var) {
        Pair d;
        if ("audio/eac3-joc".equals(t0Var.B)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(t0Var.B) || (d = d(t0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return MediaController.VIDEO_MIME_TYPE;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(t0 t0Var) {
        char c10;
        int i9;
        int i10;
        int parseInt;
        int parseInt2;
        int i11;
        char c11;
        int i12;
        char c12;
        Integer num;
        char c13;
        Integer num2 = 1024;
        String str = t0Var.r;
        String str2 = t0Var.r;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(t0Var.B);
        Pattern pattern = a;
        if (!equals) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 3004662:
                    if (str3.equals("av01")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i13 = 20;
            switch (c10) {
                case 0:
                    e5.b bVar = t0Var.N;
                    if (split.length < 4) {
                        ta.b.i("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                int i14 = 8;
                                if (parseInt5 != 8 && parseInt5 != 10) {
                                    e2.c.t(parseInt5, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                                    break;
                                } else {
                                    int i15 = parseInt5 == 8 ? 1 : (bVar == null || !(bVar.d != null || (i9 = bVar.c) == 7 || i9 == 6)) ? 2 : 4096;
                                    switch (parseInt4) {
                                        case 0:
                                            i14 = 1;
                                            break;
                                        case 1:
                                            i14 = 2;
                                            break;
                                        case 2:
                                            i14 = 4;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i14 = 16;
                                            break;
                                        case 5:
                                            i14 = 32;
                                            break;
                                        case 6:
                                            i14 = 64;
                                            break;
                                        case 7:
                                            i14 = 128;
                                            break;
                                        case 8:
                                            i14 = 256;
                                            break;
                                        case 9:
                                            i14 = 512;
                                            break;
                                        case 10:
                                            i14 = 1024;
                                            break;
                                        case 11:
                                            i14 = 2048;
                                            break;
                                        case 12:
                                            i14 = 4096;
                                            break;
                                        case 13:
                                            i14 = 8192;
                                            break;
                                        case 14:
                                            i14 = 16384;
                                            break;
                                        case 15:
                                            i14 = 32768;
                                            break;
                                        case 16:
                                            i14 = 65536;
                                            break;
                                        case 17:
                                            i14 = 131072;
                                            break;
                                        case 18:
                                            i14 = 262144;
                                            break;
                                        case 19:
                                            i14 = TLObject.FLAG_19;
                                            break;
                                        case 20:
                                            i14 = 1048576;
                                            break;
                                        case 21:
                                            i14 = TLObject.FLAG_21;
                                            break;
                                        case 22:
                                            i14 = TLObject.FLAG_22;
                                            break;
                                        case 23:
                                            i14 = TLObject.FLAG_23;
                                            break;
                                        default:
                                            i14 = -1;
                                            break;
                                    }
                                    if (i14 != -1) {
                                        break;
                                    } else {
                                        e2.c.t(parseInt4, "Unknown AV1 level: ", "MediaCodecUtil");
                                        break;
                                    }
                                }
                            } else {
                                e2.c.t(parseInt3, "Unknown AV1 profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            ta.b.i("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
                    break;
                case 1:
                case 2:
                    if (split.length < 2) {
                        ta.b.i("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i10 = 16;
                                if (split.length < 3) {
                                    d5.a.K("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i10 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            int i16 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4 : 2 : 1;
                            if (i16 != -1) {
                                switch (parseInt2) {
                                    case 10:
                                        i10 = 1;
                                        break;
                                    case 11:
                                        i10 = 4;
                                        break;
                                    case 12:
                                        i10 = 8;
                                        break;
                                    case 13:
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i10 = 32;
                                                break;
                                            case 21:
                                                i10 = 64;
                                                break;
                                            case 22:
                                                i10 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                        i10 = 256;
                                                        break;
                                                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                        i10 = 512;
                                                        break;
                                                    case 32:
                                                        i10 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                                i10 = 2048;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                                i10 = 4096;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                                i10 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                        i10 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i10 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i10 = 65536;
                                                                        break;
                                                                    default:
                                                                        i10 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i10 != -1) {
                                    break;
                                } else {
                                    e2.c.t(parseInt2, "Unknown AVC level: ", "MediaCodecUtil");
                                    break;
                                }
                            } else {
                                e2.c.t(parseInt, "Unknown AVC profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            ta.b.i("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
                case 3:
                case 4:
                    if (split.length < 4) {
                        ta.b.i("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        Matcher matcher = pattern.matcher(split[1]);
                        if (!matcher.matches()) {
                            ta.b.i("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                            break;
                        } else {
                            String group = matcher.group(1);
                            if (!"1".equals(group)) {
                                if (!"2".equals(group)) {
                                    ta.b.i("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                                    break;
                                } else {
                                    i11 = 2;
                                }
                            } else {
                                i11 = 1;
                            }
                            String str4 = split[3];
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case 70821:
                                        if (str4.equals("H30")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 70914:
                                        if (str4.equals("H60")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 70917:
                                        if (str4.equals("H63")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 71007:
                                        if (str4.equals("H90")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 71010:
                                        if (str4.equals("H93")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 74665:
                                        if (str4.equals("L30")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 74758:
                                        if (str4.equals("L60")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 74761:
                                        if (str4.equals("L63")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 74851:
                                        if (str4.equals("L90")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 74854:
                                        if (str4.equals("L93")) {
                                            c11 = '\t';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193639:
                                        if (str4.equals("H120")) {
                                            c11 = '\n';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193642:
                                        if (str4.equals("H123")) {
                                            c11 = 11;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193732:
                                        if (str4.equals("H150")) {
                                            c11 = '\f';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193735:
                                        if (str4.equals("H153")) {
                                            c11 = '\r';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193738:
                                        if (str4.equals("H156")) {
                                            c11 = 14;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193825:
                                        if (str4.equals("H180")) {
                                            c11 = 15;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193828:
                                        if (str4.equals("H183")) {
                                            c11 = 16;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2193831:
                                        if (str4.equals("H186")) {
                                            c11 = 17;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312803:
                                        if (str4.equals("L120")) {
                                            c11 = 18;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312806:
                                        if (str4.equals("L123")) {
                                            c11 = 19;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312896:
                                        if (str4.equals("L150")) {
                                            c11 = 20;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312899:
                                        if (str4.equals("L153")) {
                                            c11 = 21;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312902:
                                        if (str4.equals("L156")) {
                                            c11 = 22;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312989:
                                        if (str4.equals("L180")) {
                                            c11 = 23;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312992:
                                        if (str4.equals("L183")) {
                                            c11 = 24;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case 2312995:
                                        if (str4.equals("L186")) {
                                            c11 = 25;
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
                                        num2 = 2;
                                        break;
                                    case 1:
                                        num2 = 8;
                                        break;
                                    case 2:
                                        num2 = 32;
                                        break;
                                    case 3:
                                        num2 = 128;
                                        break;
                                    case 4:
                                        num2 = 512;
                                        break;
                                    case 5:
                                        num2 = 1;
                                        break;
                                    case 6:
                                        num2 = 4;
                                        break;
                                    case 7:
                                        num2 = 16;
                                        break;
                                    case '\b':
                                        num2 = 64;
                                        break;
                                    case '\t':
                                        num2 = 256;
                                        break;
                                    case '\n':
                                        num2 = 2048;
                                        break;
                                    case 11:
                                        num2 = 8192;
                                        break;
                                    case '\f':
                                        num2 = 32768;
                                        break;
                                    case '\r':
                                        num2 = 131072;
                                        break;
                                    case 14:
                                        num2 = Integer.valueOf(TLObject.FLAG_19);
                                        break;
                                    case 15:
                                        num2 = Integer.valueOf(TLObject.FLAG_21);
                                        break;
                                    case 16:
                                        num2 = Integer.valueOf(TLObject.FLAG_23);
                                        break;
                                    case 17:
                                        num2 = 33554432;
                                        break;
                                    case 19:
                                        num2 = 4096;
                                        break;
                                    case 20:
                                        num2 = 16384;
                                        break;
                                    case 21:
                                        num2 = 65536;
                                        break;
                                    case 22:
                                        num2 = 262144;
                                        break;
                                    case 23:
                                        num2 = 1048576;
                                        break;
                                    case 24:
                                        num2 = Integer.valueOf(TLObject.FLAG_22);
                                        break;
                                    case 25:
                                        num2 = 16777216;
                                        break;
                                }
                                if (num2 == null) {
                                    break;
                                } else {
                                    ta.b.i("Unknown HEVC level string: ", str4, "MediaCodecUtil");
                                    break;
                                }
                            }
                            num2 = null;
                            if (num2 == null) {
                            }
                        }
                    }
                case 5:
                    if (split.length == 3) {
                        try {
                            if (MediaController.AUDIO_MIME_TYPE.equals(d5.q.d(Integer.parseInt(split[1], 16)))) {
                                int parseInt6 = Integer.parseInt(split[2]);
                                if (parseInt6 == 17) {
                                    i13 = 17;
                                } else if (parseInt6 != 20) {
                                    if (parseInt6 == 23) {
                                        i13 = 23;
                                    } else if (parseInt6 == 29) {
                                        i13 = 29;
                                    } else if (parseInt6 == 39) {
                                        i13 = 39;
                                    } else if (parseInt6 != 42) {
                                        switch (parseInt6) {
                                            case 1:
                                                i13 = 1;
                                                break;
                                            case 2:
                                                i13 = 2;
                                                break;
                                            case 3:
                                                i13 = 3;
                                                break;
                                            case 4:
                                                i13 = 4;
                                                break;
                                            case 5:
                                                i13 = 5;
                                                break;
                                            case 6:
                                                i13 = 6;
                                                break;
                                            default:
                                                i13 = -1;
                                                break;
                                        }
                                    } else {
                                        i13 = 42;
                                    }
                                }
                                if (i13 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            ta.b.i("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                            break;
                        }
                    } else {
                        ta.b.i("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        break;
                    }
                    break;
                case 6:
                    if (split.length < 3) {
                        ta.b.i("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            int parseInt7 = Integer.parseInt(split[1]);
                            int parseInt8 = Integer.parseInt(split[2]);
                            int i17 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i17 != -1) {
                                if (parseInt8 == 10) {
                                    i12 = 1;
                                } else if (parseInt8 == 11) {
                                    i12 = 2;
                                } else if (parseInt8 == 20) {
                                    i12 = 4;
                                } else if (parseInt8 == 21) {
                                    i12 = 8;
                                } else if (parseInt8 == 30) {
                                    i12 = 16;
                                } else if (parseInt8 == 31) {
                                    i12 = 32;
                                } else if (parseInt8 == 40) {
                                    i12 = 64;
                                } else if (parseInt8 == 41) {
                                    i12 = 128;
                                } else if (parseInt8 == 50) {
                                    i12 = 256;
                                } else if (parseInt8 != 51) {
                                    switch (parseInt8) {
                                        case 60:
                                            i12 = 2048;
                                            break;
                                        case 61:
                                            i12 = 4096;
                                            break;
                                        case 62:
                                            i12 = 8192;
                                            break;
                                        default:
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i12 = 512;
                                }
                                if (i12 != -1) {
                                    break;
                                } else {
                                    e2.c.t(parseInt8, "Unknown VP9 level: ", "MediaCodecUtil");
                                    break;
                                }
                            } else {
                                e2.c.t(parseInt7, "Unknown VP9 profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused4) {
                            ta.b.i("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            ta.b.i("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            return null;
        }
        Matcher matcher2 = pattern.matcher(split[1]);
        if (!matcher2.matches()) {
            ta.b.i("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            return null;
        }
        String group2 = matcher2.group(1);
        if (group2 != null) {
            switch (group2.hashCode()) {
                case 1536:
                    if (group2.equals("00")) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1537:
                    if (group2.equals("01")) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1538:
                    if (group2.equals("02")) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1539:
                    if (group2.equals("03")) {
                        c12 = 3;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1540:
                    if (group2.equals("04")) {
                        c12 = 4;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1541:
                    if (group2.equals("05")) {
                        c12 = 5;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1542:
                    if (group2.equals("06")) {
                        c12 = 6;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1543:
                    if (group2.equals("07")) {
                        c12 = 7;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1544:
                    if (group2.equals("08")) {
                        c12 = '\b';
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1545:
                    if (group2.equals("09")) {
                        c12 = '\t';
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
                    num = 1;
                    break;
                case 1:
                    num = 2;
                    break;
                case 2:
                    num = 4;
                    break;
                case 3:
                    num = 8;
                    break;
                case 4:
                    num = 16;
                    break;
                case 5:
                    num = 32;
                    break;
                case 6:
                    num = 64;
                    break;
                case 7:
                    num = 128;
                    break;
                case '\b':
                    num = 256;
                    break;
                case '\t':
                    num = 512;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num == null) {
            ta.b.i("Unknown Dolby Vision profile string: ", group2, "MediaCodecUtil");
            return null;
        }
        String str5 = split[2];
        if (str5 != null) {
            switch (str5.hashCode()) {
                case 1537:
                    if (str5.equals("01")) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1538:
                    if (str5.equals("02")) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1539:
                    if (str5.equals("03")) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1540:
                    if (str5.equals("04")) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1541:
                    if (str5.equals("05")) {
                        c13 = 4;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1542:
                    if (str5.equals("06")) {
                        c13 = 5;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1543:
                    if (str5.equals("07")) {
                        c13 = 6;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1544:
                    if (str5.equals("08")) {
                        c13 = 7;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1545:
                    if (str5.equals("09")) {
                        c13 = '\b';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1567:
                    if (str5.equals("10")) {
                        c13 = '\t';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1568:
                    if (str5.equals("11")) {
                        c13 = '\n';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1569:
                    if (str5.equals("12")) {
                        c13 = 11;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1570:
                    if (str5.equals("13")) {
                        c13 = '\f';
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
                    num2 = 1;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = 8;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case '\b':
                    num2 = 256;
                    break;
                case '\t':
                    num2 = 512;
                    break;
                case 11:
                    num2 = 2048;
                    break;
                case '\f':
                    num2 = 4096;
                    break;
            }
            if (num2 == null) {
                return new Pair(num, num2);
            }
            ta.b.i("Unknown Dolby Vision level string: ", str5, "MediaCodecUtil");
            return null;
        }
        num2 = null;
        if (num2 == null) {
        }
        return null;
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = b;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                int i9 = f0.a;
                ArrayList f10 = f(sVar, i9 >= 21 ? new n2.w(z10, z11) : new wa.a(26));
                if (z10 && f10.isEmpty() && 21 <= i9 && i9 <= 23) {
                    f10 = f(sVar, new wa.a(26));
                    if (!f10.isEmpty()) {
                        d5.a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) f10.get(0)).a);
                    }
                }
                a(str, f10);
                z u10 = z.u(f10);
                hashMap.put(sVar, u10);
                return u10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7 A[Catch: Exception -> 0x013f, TRY_ENTER, TryCatch #1 {Exception -> 0x013f, blocks: (B:3:0x000c, B:5:0x001f, B:7:0x0029, B:11:0x0116, B:12:0x0031, B:16:0x003d, B:53:0x00ef, B:56:0x00f7, B:58:0x00fd, B:61:0x011c, B:62:0x013d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(s sVar, u uVar) {
        String c10;
        String str;
        String str2;
        String str3;
        s sVar2 = sVar;
        boolean z10 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = sVar2.a;
            int B = uVar.B();
            boolean I = uVar.I();
            int i9 = 0;
            while (i9 < B) {
                MediaCodecInfo b10 = uVar.b(i9);
                int i10 = f0.a;
                if (i10 < 29 || !b10.isAlias()) {
                    String name = b10.getName();
                    if (g(b10, name, I, str4) && (c10 = c(b10, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = b10.getCapabilitiesForType(c10);
                            boolean p6 = uVar.p("tunneled-playback", c10, capabilitiesForType);
                            boolean y10 = uVar.y("tunneled-playback", capabilitiesForType);
                            boolean z11 = sVar2.c;
                            if ((z11 || !y10) && (!z11 || p6)) {
                                boolean p9 = uVar.p("secure-playback", c10, capabilitiesForType);
                                boolean y11 = uVar.y("secure-playback", capabilitiesForType);
                                if ((z10 || !y11) && (!z10 || p9)) {
                                    try {
                                        boolean h = h(b10, str4);
                                        i(b10, str4);
                                        if (i10 >= 29) {
                                            b10.isVendor();
                                        } else {
                                            String b11 = b0.b(b10.getName());
                                            if (!b11.startsWith("omx.google.") && !b11.startsWith("c2.android.")) {
                                                b11.startsWith("c2.google.");
                                            }
                                        }
                                        if (!(I && z10 == p9) && (I || z10)) {
                                            str3 = name;
                                            if (!I && p9) {
                                                str2 = str3;
                                                str = c10;
                                                try {
                                                    arrayList.add(n.h(str3 + ".secure", str4, str, capabilitiesForType, h, true));
                                                    break;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    if (f0.a > 23) {
                                                    }
                                                    d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            str3 = name;
                                            str = c10;
                                            try {
                                            } catch (Exception e11) {
                                                e = e11;
                                                str2 = str3;
                                                if (f0.a > 23 || arrayList.isEmpty()) {
                                                    d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                d5.a.o("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i9++;
                                                sVar2 = sVar;
                                            }
                                            try {
                                                arrayList.add(n.h(str3, str4, str, capabilitiesForType, h, false));
                                            } catch (Exception e12) {
                                                e = e12;
                                                str2 = str3;
                                                str = c10;
                                                if (f0.a > 23) {
                                                }
                                                d5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str2 = name;
                                    }
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str = c10;
                            str2 = name;
                        }
                    }
                }
                i9++;
                sVar2 = sVar;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new t("Failed to query underlying media codecs", e15);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i9 = f0.a;
        if (i9 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i9 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = f0.b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(f0.c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = f0.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i9 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = f0.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i9 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(f0.c))) {
            String str6 = f0.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i9 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(f0.c)) {
            String str7 = f0.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i9 <= 19 && f0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i9 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        return f0.a >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (f0.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (d5.q.h(str)) {
            return true;
        }
        String b10 = b0.b(mediaCodecInfo.getName());
        if (b10.startsWith("arc.")) {
            return false;
        }
        if (b10.startsWith("omx.google.") || b10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((b10.startsWith("omx.sec.") && b10.contains(".sw.")) || b10.equals("omx.qcom.video.decoder.hevcswvdec") || b10.startsWith("c2.android.") || b10.startsWith("c2.google.")) {
            return true;
        }
        return (b10.startsWith("omx.") || b10.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i9;
        if (c == -1) {
            int i10 = 0;
            List e10 = e(MediaController.VIDEO_MIME_TYPE, false, false);
            n nVar = e10.isEmpty() ? null : (n) e10.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = codecProfileLevelArr[i10].level;
                    if (i12 != 1 && i12 != 2) {
                        switch (i12) {
                            case 8:
                            case 16:
                            case 32:
                                i9 = 101376;
                                break;
                            case 64:
                                i9 = 202752;
                                break;
                            case 128:
                            case 256:
                                i9 = 414720;
                                break;
                            case 512:
                                i9 = 921600;
                                break;
                            case 1024:
                                i9 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i9 = TLObject.FLAG_21;
                                break;
                            case 8192:
                                i9 = 2228224;
                                break;
                            case 16384:
                                i9 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i9 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case TLObject.FLAG_19 /* 524288 */:
                                i9 = 35651584;
                                break;
                            default:
                                i9 = -1;
                                break;
                        }
                    } else {
                        i9 = 25344;
                    }
                    i11 = Math.max(i9, i11);
                    i10++;
                }
                i10 = Math.max(i11, f0.a >= 21 ? 345600 : 172800);
            }
            c = i10;
        }
        return c;
    }
}
