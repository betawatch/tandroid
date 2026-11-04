package t2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b8.xb;
import ci.y4;
import d2.u0;
import g9.f0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new y4(new i(), 4));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i3, int i10) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i3;
        codecProfileLevel.level = i10;
        return codecProfileLevel;
    }

    public static String c(d2.v vVar) {
        Pair b10;
        String str = vVar.s;
        String str2 = vVar.s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = g2.h.b(vVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                d2.n nVar = vVar.I;
                if (nVar != null && nVar.c == 6 && nVar.b == 1) {
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

    public static synchronized List e(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList f10 = f(sVar, new e5.u(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f10.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f10 = f(sVar, new ra.e(23));
                    if (!f10.isEmpty()) {
                        g2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f10.get(0)).a);
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
        boolean z10;
        String str;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean Y;
        boolean B1;
        boolean z11;
        boolean j10;
        boolean z12;
        s sVar2 = sVar;
        boolean z13 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int D1 = uVar.D1();
            boolean k22 = uVar.k2();
            int i10 = 0;
            while (i10 < D1) {
                MediaCodecInfo h = uVar.h(i10);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 29 || !h.isAlias()) {
                    String name = h.getName();
                    if (h(h, name, k22, str2)) {
                        int i12 = i10;
                        String d = d(h, name, str2);
                        if (d != null) {
                            try {
                                capabilitiesForType = h.getCapabilitiesForType(d);
                                Y = uVar.Y("tunneled-playback", d, capabilitiesForType);
                                B1 = uVar.B1("tunneled-playback", capabilitiesForType);
                                z11 = sVar2.c;
                            } catch (Exception e10) {
                                e = e10;
                                z10 = k22;
                                str = name;
                            }
                            if (z11 || !B1) {
                                if (!z11 || Y) {
                                    boolean Y2 = uVar.Y("secure-playback", d, capabilitiesForType);
                                    boolean B12 = uVar.B1("secure-playback", capabilitiesForType);
                                    if (z13 || !B12) {
                                        if (!z13 || Y2) {
                                            boolean i13 = i(h, str2);
                                            z10 = k22;
                                            try {
                                                j10 = j(h, str2);
                                                if (i11 >= 29) {
                                                    z12 = h.isVendor();
                                                } else {
                                                    String c2 = xb.c(h.getName());
                                                    z12 = (c2.startsWith("omx.google.") || c2.startsWith("c2.android.") || c2.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str = name;
                                                i3 = i12;
                                                if (Build.VERSION.SDK_INT != 23) {
                                                }
                                                g2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                throw e;
                                            }
                                            if (!(z10 && z13 == Y2) && (z10 || z13)) {
                                                boolean z14 = z12;
                                                i3 = i12;
                                                if (!z10 && Y2) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, d, capabilitiesForType, i13, j10, z14, true));
                                                        break;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        if (Build.VERSION.SDK_INT != 23) {
                                                        }
                                                        g2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                }
                                                i10 = i3 + 1;
                                                sVar2 = sVar;
                                                k22 = z10;
                                            } else {
                                                i3 = i12;
                                                try {
                                                    arrayList.add(o.i(name, str2, d, capabilitiesForType, i13, j10, z12, false));
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        g2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    g2.a.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i10 = i3 + 1;
                                                    sVar2 = sVar;
                                                    k22 = z10;
                                                }
                                                i10 = i3 + 1;
                                                sVar2 = sVar;
                                                k22 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = k22;
                        i3 = i12;
                        i10 = i3 + 1;
                        sVar2 = sVar;
                        k22 = z10;
                    }
                }
                z10 = k22;
                i3 = i10;
                i10 = i3 + 1;
                sVar2 = sVar;
                k22 = z10;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new t("Failed to query underlying media codecs", e14);
        }
    }

    public static s1 g(i iVar, d2.v vVar, boolean z10, boolean z11) {
        List b10 = iVar.b(vVar.s, z10, z11);
        String c2 = c(vVar);
        List b11 = c2 == null ? s1.e : iVar.b(c2, z10, z11);
        f0 p10 = i0.p();
        p10.d(b10);
        p10.d(b11);
        return p10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i3 == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (u0.i(str)) {
            return true;
        }
        String c2 = xb.c(mediaCodecInfo.getName());
        if (c2.startsWith("arc.")) {
            return false;
        }
        if (c2.startsWith("omx.google.") || c2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((c2.startsWith("omx.sec.") && c2.contains(".sw.")) || c2.equals("omx.qcom.video.decoder.hevcswvdec") || c2.startsWith("c2.android.") || c2.startsWith("c2.google.")) {
            return true;
        }
        return (c2.startsWith("omx.") || c2.startsWith("c2.")) ? false : true;
    }
}
