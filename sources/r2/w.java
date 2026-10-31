package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.v0;
import bi.v6;
import e9.k0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v7.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new v6(new i(), 3));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String c(b2.x xVar) {
        Pair b10;
        String str = xVar.s;
        String str2 = xVar.s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = e2.g.b(xVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                b2.o oVar = xVar.I;
                if (oVar != null && oVar.c == 6 && oVar.b == 1) {
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
                ArrayList f7 = f(sVar, new c5.x(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f7.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f7 = f(sVar, new kb.a(18));
                    if (!f7.isEmpty()) {
                        e2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f7.get(0)).a);
                    }
                }
                a(str, f7);
                n0 u10 = n0.u(f7);
                hashMap.put(sVar, u10);
                return u10;
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
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean V;
        boolean T0;
        boolean z11;
        boolean j10;
        boolean z12;
        s sVar2 = sVar;
        boolean z13 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int V0 = uVar.V0();
            boolean o12 = uVar.o1();
            int i11 = 0;
            while (i11 < V0) {
                MediaCodecInfo d = uVar.d(i11);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 29 || !d.isAlias()) {
                    String name = d.getName();
                    if (h(d, name, o12, str2)) {
                        int i13 = i11;
                        String d10 = d(d, name, str2);
                        if (d10 != null) {
                            try {
                                capabilitiesForType = d.getCapabilitiesForType(d10);
                                V = uVar.V("tunneled-playback", d10, capabilitiesForType);
                                T0 = uVar.T0("tunneled-playback", capabilitiesForType);
                                z11 = sVar2.c;
                            } catch (Exception e) {
                                e = e;
                                z10 = o12;
                                str = name;
                            }
                            if (z11 || !T0) {
                                if (!z11 || V) {
                                    boolean V2 = uVar.V("secure-playback", d10, capabilitiesForType);
                                    boolean T02 = uVar.T0("secure-playback", capabilitiesForType);
                                    if (z13 || !T02) {
                                        if (!z13 || V2) {
                                            boolean i14 = i(d, str2);
                                            z10 = o12;
                                            try {
                                                j10 = j(d, str2);
                                                if (i12 >= 29) {
                                                    z12 = d.isVendor();
                                                } else {
                                                    String c10 = r6.c(d.getName());
                                                    z12 = (c10.startsWith("omx.google.") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                str = name;
                                                i10 = i13;
                                                if (Build.VERSION.SDK_INT != 23) {
                                                }
                                                e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d10 + ")");
                                                throw e;
                                            }
                                            if (!(z10 && z13 == V2) && (z10 || z13)) {
                                                boolean z14 = z12;
                                                i10 = i13;
                                                if (!z10 && V2) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, d10, capabilitiesForType, i14, j10, z14, true));
                                                        break;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        if (Build.VERSION.SDK_INT != 23) {
                                                        }
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d10 + ")");
                                                        throw e;
                                                    }
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                o12 = z10;
                                            } else {
                                                i10 = i13;
                                                try {
                                                    arrayList.add(o.i(name, str2, d10, capabilitiesForType, i14, j10, z12, false));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d10 + ")");
                                                        throw e;
                                                    }
                                                    e2.a.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i11 = i10 + 1;
                                                    sVar2 = sVar;
                                                    o12 = z10;
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                o12 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = o12;
                        i10 = i13;
                        i11 = i10 + 1;
                        sVar2 = sVar;
                        o12 = z10;
                    }
                }
                z10 = o12;
                i10 = i11;
                i11 = i10 + 1;
                sVar2 = sVar;
                o12 = z10;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new t("Failed to query underlying media codecs", e12);
        }
    }

    public static x1 g(i iVar, b2.x xVar, boolean z10, boolean z11) {
        List a2 = iVar.a(xVar.s, z10, z11);
        String c10 = c(xVar);
        List a10 = c10 == null ? x1.e : iVar.a(c10, z10, z11);
        k0 t10 = n0.t();
        t10.d(a2);
        t10.d(a10);
        return t10.f();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !j(mediaCodecInfo, str);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (v0.i(str)) {
            return true;
        }
        String c10 = r6.c(mediaCodecInfo.getName());
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
