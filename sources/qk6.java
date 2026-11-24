// default package

import android.media.MediaCodecInfo;
import android.os.Build;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qk6 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((ik6) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(ik6.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new bz0(new w26((byte) 14), (byte) 3));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((ik6) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((ik6) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(fm4 fm4Var) {
        vj2 d;
        boolean z;
        String str = fm4Var.t;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (d = wj2.d(fm4Var)) != null && (z = d.c)) {
            gre.p(z);
            int i = d.a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                hl2 hl2Var = fm4Var.L;
                if (hl2Var != null && hl2Var.c == 6 && hl2Var.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (qk6.class) {
            mk6 mk6Var = new mk6(str, z, z2);
            HashMap hashMap = a;
            List list = (List) hashMap.get(mk6Var);
            if (list != null) {
                return list;
            }
            ArrayList f = f(mk6Var, new e31(z, z2, str.equals("video/mv-hevc")));
            if (z && f.isEmpty() && Build.VERSION.SDK_INT == 23) {
                f = f(mk6Var, new o5f((byte) 21));
                if (!f.isEmpty()) {
                    lad.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((ik6) f.get(0)).a);
                }
            }
            a(str, f);
            mm5 q = mm5.q(f);
            hashMap.put(mk6Var, q);
            return q;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r3 != r11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0068, code lost:
    
        if (r11 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0059, code lost:
    
        if (r17 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[Catch: Exception -> 0x0148, TRY_ENTER, TryCatch #2 {Exception -> 0x0148, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:11:0x011d, B:12:0x002f, B:14:0x003f, B:42:0x00f6, B:45:0x00fe, B:47:0x0104, B:50:0x0125, B:51:0x0146), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(mk6 mk6Var, ok6 ok6Var) {
        boolean z;
        String str;
        int i;
        boolean j;
        boolean z2;
        mk6 mk6Var2 = mk6Var;
        boolean z3 = mk6Var2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = mk6Var2.a;
            int K = ok6Var.K();
            boolean k0 = ok6Var.k0();
            int i2 = 0;
            while (i2 < K) {
                MediaCodecInfo e = ok6Var.e(i2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 29 || !e.isAlias()) {
                    String name = e.getName();
                    if (h(e, name, k0, str2)) {
                        int i4 = i2;
                        String d = d(e, name, str2);
                        if (d != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = e.getCapabilitiesForType(d);
                                boolean j2 = ok6Var.j("tunneled-playback", d, capabilitiesForType);
                                boolean H = ok6Var.H("tunneled-playback", capabilitiesForType);
                                if (!mk6Var2.c) {
                                    if (!H) {
                                        boolean j3 = ok6Var.j("secure-playback", d, capabilitiesForType);
                                        boolean H2 = ok6Var.H("secure-playback", capabilitiesForType);
                                        if (!z3) {
                                            if (!H2) {
                                                boolean i5 = i(e, str2);
                                                z = k0;
                                                try {
                                                    j = j(e, str2);
                                                    if (i3 >= 29) {
                                                        z2 = e.isVendor();
                                                    } else {
                                                        String c = smd.c(e.getName());
                                                        z2 = (c.startsWith("omx.google.") || c.startsWith("c2.android.") || c.startsWith("c2.google.")) ? false : true;
                                                    }
                                                    if (!z) {
                                                        if (z3) {
                                                            boolean z4 = z2;
                                                            i = i4;
                                                            if (j3) {
                                                                str = name;
                                                                try {
                                                                    arrayList.add(ik6.i(name + ".secure", str2, d, capabilitiesForType, i5, j, z4, true));
                                                                    break;
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    if (Build.VERSION.SDK_INT != 23) {
                                                                    }
                                                                    lad.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                                    throw e;
                                                                }
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                    i = i4;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    str = name;
                                                    i = i4;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        lad.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    lad.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i2 = i + 1;
                                                    mk6Var2 = mk6Var;
                                                    k0 = z;
                                                }
                                                try {
                                                    arrayList.add(ik6.i(name, str2, d, capabilitiesForType, i5, j, z2, false));
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23) {
                                                    }
                                                    lad.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                    throw e;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                z = k0;
                                str = name;
                            }
                            i2 = i + 1;
                            mk6Var2 = mk6Var;
                            k0 = z;
                        }
                        z = k0;
                        i = i4;
                        i2 = i + 1;
                        mk6Var2 = mk6Var;
                        k0 = z;
                    }
                }
                z = k0;
                i = i2;
                i2 = i + 1;
                mk6Var2 = mk6Var;
                k0 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new nk6("Failed to query underlying media codecs", e6);
        }
    }

    public static w59 g(fm4 fm4Var, boolean z, boolean z2) {
        Iterable e;
        List e2 = e(fm4Var.t, z, z2);
        String c = c(fm4Var);
        if (c == null) {
            km5 km5Var = mm5.b;
            e = w59.e;
        } else {
            e = e(c, z, z2);
        }
        jm5 p = mm5.p();
        p.d(e2);
        p.d(e);
        return p.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ud7.i(str)) {
            return true;
        }
        String c = smd.c(mediaCodecInfo.getName());
        if (c.startsWith("arc.")) {
            return false;
        }
        if (c.startsWith("omx.google.") || c.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((c.startsWith("omx.sec.") && c.contains(".sw.")) || c.equals("omx.qcom.video.decoder.hevcswvdec") || c.startsWith("c2.android.") || c.startsWith("c2.google.")) {
            return true;
        }
        return (c.startsWith("omx.") || c.startsWith("c2.")) ? false : true;
    }
}
