// default package

import android.media.MediaCodecInfo;
import android.os.Build;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class wm6 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((nm6) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(nm6.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new jz0(new lq5((byte) 26), (byte) 4));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((nm6) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((nm6) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(ko4 ko4Var) {
        qk2 d;
        boolean z;
        String str = ko4Var.t;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (d = rk2.d(ko4Var)) != null && (z = d.c)) {
            yve.p(z);
            int i = d.a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                bm2 bm2Var = ko4Var.L;
                if (bm2Var != null && bm2Var.c == 6 && bm2Var.b == 1) {
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
        synchronized (wm6.class) {
            sm6 sm6Var = new sm6(str, z, z2);
            HashMap hashMap = a;
            List list = (List) hashMap.get(sm6Var);
            if (list != null) {
                return list;
            }
            ArrayList f = f(sm6Var, new n31(z, z2, str.equals("video/mv-hevc")));
            if (z && f.isEmpty() && Build.VERSION.SDK_INT == 23) {
                f = f(sm6Var, new faf((byte) 21));
                if (!f.isEmpty()) {
                    efd.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((nm6) f.get(0)).a);
                }
            }
            a(str, f);
            po5 q = po5.q(f);
            hashMap.put(sm6Var, q);
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
    public static ArrayList f(sm6 sm6Var, um6 um6Var) {
        boolean z;
        String str;
        int i;
        boolean j;
        boolean z2;
        sm6 sm6Var2 = sm6Var;
        boolean z3 = sm6Var2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sm6Var2.a;
            int V = um6Var.V();
            boolean t0 = um6Var.t0();
            int i2 = 0;
            while (i2 < V) {
                MediaCodecInfo e = um6Var.e(i2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 29 || !e.isAlias()) {
                    String name = e.getName();
                    if (h(e, name, t0, str2)) {
                        int i4 = i2;
                        String d = d(e, name, str2);
                        if (d != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = e.getCapabilitiesForType(d);
                                boolean t = um6Var.t("tunneled-playback", d, capabilitiesForType);
                                boolean R = um6Var.R("tunneled-playback", capabilitiesForType);
                                if (!sm6Var2.c) {
                                    if (!R) {
                                        boolean t2 = um6Var.t("secure-playback", d, capabilitiesForType);
                                        boolean R2 = um6Var.R("secure-playback", capabilitiesForType);
                                        if (!z3) {
                                            if (!R2) {
                                                boolean i5 = i(e, str2);
                                                z = t0;
                                                try {
                                                    j = j(e, str2);
                                                    if (i3 >= 29) {
                                                        z2 = e.isVendor();
                                                    } else {
                                                        String c = jrd.c(e.getName());
                                                        z2 = (c.startsWith("omx.google.") || c.startsWith("c2.android.") || c.startsWith("c2.google.")) ? false : true;
                                                    }
                                                    if (!z) {
                                                        if (z3) {
                                                            boolean z4 = z2;
                                                            i = i4;
                                                            if (t2) {
                                                                str = name;
                                                                try {
                                                                    arrayList.add(nm6.i(name + ".secure", str2, d, capabilitiesForType, i5, j, z4, true));
                                                                    break;
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    if (Build.VERSION.SDK_INT != 23) {
                                                                    }
                                                                    efd.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
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
                                                        efd.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    efd.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i2 = i + 1;
                                                    sm6Var2 = sm6Var;
                                                    t0 = z;
                                                }
                                                try {
                                                    arrayList.add(nm6.i(name, str2, d, capabilitiesForType, i5, j, z2, false));
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23) {
                                                    }
                                                    efd.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                    throw e;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                z = t0;
                                str = name;
                            }
                            i2 = i + 1;
                            sm6Var2 = sm6Var;
                            t0 = z;
                        }
                        z = t0;
                        i = i4;
                        i2 = i + 1;
                        sm6Var2 = sm6Var;
                        t0 = z;
                    }
                }
                z = t0;
                i = i2;
                i2 = i + 1;
                sm6Var2 = sm6Var;
                t0 = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new tm6("Failed to query underlying media codecs", e6);
        }
    }

    public static j99 g(ko4 ko4Var, boolean z, boolean z2) {
        Iterable e;
        List e2 = e(ko4Var.t, z, z2);
        String c = c(ko4Var);
        if (c == null) {
            no5 no5Var = po5.b;
            e = j99.e;
        } else {
            e = e(c, z, z2);
        }
        mo5 p = po5.p();
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
        if (dg7.i(str)) {
            return true;
        }
        String c = jrd.c(mediaCodecInfo.getName());
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
