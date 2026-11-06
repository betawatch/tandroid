package u2;

import a8.ga;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import bi.s5;
import e2.s0;
import h9.f0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new s5(new i(), 6));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i7, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i7;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String c(e2.u uVar) {
        Pair b10;
        String str = uVar.s;
        String str2 = uVar.s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = h2.g.b(uVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                e2.m mVar = uVar.I;
                if (mVar != null && mVar.c == 6 && mVar.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
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

    public static synchronized List e(String str, boolean z9, boolean z10) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z9, z10);
                HashMap hashMap = a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList f10 = f(sVar, new f5.u(z9, z10, str.equals("video/mv-hevc")));
                if (z9 && f10.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f10 = f(sVar, new nb.a(25));
                    if (!f10.isEmpty()) {
                        h2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f10.get(0)).a);
                    }
                }
                a(str, f10);
                i0 q10 = i0.q(f10);
                hashMap.put(sVar, q10);
                return q10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0109 A[Catch: Exception -> 0x0153, TRY_ENTER, TryCatch #4 {Exception -> 0x0153, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:11:0x0128, B:12:0x0035, B:15:0x0040, B:47:0x0101, B:50:0x0109, B:52:0x010f, B:55:0x0130, B:56:0x0151), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(s sVar, u uVar) {
        boolean z9;
        String str;
        int i7;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean t6;
        boolean I;
        boolean z10;
        boolean j3;
        boolean z11;
        s sVar2 = sVar;
        boolean z12 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int L = uVar.L();
            boolean Y = uVar.Y();
            int i10 = 0;
            while (i10 < L) {
                MediaCodecInfo f10 = uVar.f(i10);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 29 || !f10.isAlias()) {
                    String name = f10.getName();
                    if (h(f10, name, Y, str2)) {
                        int i12 = i10;
                        String d = d(f10, name, str2);
                        if (d != null) {
                            try {
                                capabilitiesForType = f10.getCapabilitiesForType(d);
                                t6 = uVar.t("tunneled-playback", d, capabilitiesForType);
                                I = uVar.I("tunneled-playback", capabilitiesForType);
                                z10 = sVar2.c;
                            } catch (Exception e10) {
                                e = e10;
                                z9 = Y;
                                str = name;
                            }
                            if (z10 || !I) {
                                if (!z10 || t6) {
                                    boolean t10 = uVar.t("secure-playback", d, capabilitiesForType);
                                    boolean I2 = uVar.I("secure-playback", capabilitiesForType);
                                    if (z12 || !I2) {
                                        if (!z12 || t10) {
                                            boolean i13 = i(f10, str2);
                                            z9 = Y;
                                            try {
                                                j3 = j(f10, str2);
                                                if (i11 >= 29) {
                                                    z11 = f10.isVendor();
                                                } else {
                                                    String c10 = ga.c(f10.getName());
                                                    z11 = (c10.startsWith("omx.google.") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str = name;
                                                i7 = i12;
                                                if (Build.VERSION.SDK_INT != 23) {
                                                }
                                                h2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                throw e;
                                            }
                                            if (!(z9 && z12 == t10) && (z9 || z12)) {
                                                boolean z13 = z11;
                                                i7 = i12;
                                                if (!z9 && t10) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, d, capabilitiesForType, i13, j3, z13, true));
                                                        break;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        if (Build.VERSION.SDK_INT != 23) {
                                                        }
                                                        h2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                }
                                                i10 = i7 + 1;
                                                sVar2 = sVar;
                                                Y = z9;
                                            } else {
                                                i7 = i12;
                                                try {
                                                    arrayList.add(o.i(name, str2, d, capabilitiesForType, i13, j3, z11, false));
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        h2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    h2.a.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i10 = i7 + 1;
                                                    sVar2 = sVar;
                                                    Y = z9;
                                                }
                                                i10 = i7 + 1;
                                                sVar2 = sVar;
                                                Y = z9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z9 = Y;
                        i7 = i12;
                        i10 = i7 + 1;
                        sVar2 = sVar;
                        Y = z9;
                    }
                }
                z9 = Y;
                i7 = i10;
                i10 = i7 + 1;
                sVar2 = sVar;
                Y = z9;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new t("Failed to query underlying media codecs", e14);
        }
    }

    public static t1 g(i iVar, e2.u uVar, boolean z9, boolean z10) {
        List a10 = iVar.a(uVar.s, z9, z10);
        String c10 = c(uVar);
        List a11 = c10 == null ? t1.e : iVar.a(c10, z9, z10);
        f0 p10 = i0.p();
        p10.d(a10);
        p10.d(a11);
        return p10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z9, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z9 && str.endsWith(".secure")) {
            return false;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i7 == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (s0.i(str)) {
            return true;
        }
        String c10 = ga.c(mediaCodecInfo.getName());
        if (c10.startsWith("arc.")) {
            return false;
        }
        if (c10.startsWith("omx.google.") || c10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((c10.startsWith("omx.sec.") && c10.contains(".sw.")) || c10.equals("omx.qcom.video.decoder.hevcswvdec") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) {
            return true;
        }
        return (c10.startsWith("omx.") || c10.startsWith("c2.")) ? false : true;
    }
}
