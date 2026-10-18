package r2;

import ai.t5;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.v0;
import c5.b0;
import e9.k0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import v7.s6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new t5(new i(), 4));
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

    public static String c(b2.w wVar) {
        Pair b10;
        String str = wVar.s;
        String str2 = wVar.s;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = e2.g.b(wVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return MediaController.VIDEO_MIME_TYPE;
            }
            if (intValue == 1024) {
                b2.n nVar = wVar.I;
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
                ArrayList f7 = f(sVar, new b0(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f7.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f7 = f(sVar, new rb.b(20));
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[Catch: Exception -> 0x0155, TRY_ENTER, TryCatch #4 {Exception -> 0x0155, blocks: (B:3:0x000c, B:5:0x0021, B:7:0x002b, B:11:0x012a, B:12:0x0037, B:15:0x0042, B:47:0x0103, B:50:0x010b, B:52:0x0111, B:55:0x0132, B:56:0x0153), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(s sVar, u uVar) {
        boolean z10;
        String str;
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean f7;
        boolean h;
        boolean z11;
        boolean j10;
        boolean z12;
        s sVar2 = sVar;
        boolean z13 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int k10 = uVar.k();
            boolean u10 = uVar.u();
            int i11 = 0;
            while (i11 < k10) {
                MediaCodecInfo a2 = uVar.a(i11);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 29 || !a2.isAlias()) {
                    String name = a2.getName();
                    if (h(a2, name, u10, str2)) {
                        int i13 = i11;
                        String d = d(a2, name, str2);
                        if (d != null) {
                            try {
                                capabilitiesForType = a2.getCapabilitiesForType(d);
                                f7 = uVar.f("tunneled-playback", d, capabilitiesForType);
                                h = uVar.h("tunneled-playback", capabilitiesForType);
                                z11 = sVar2.c;
                            } catch (Exception e) {
                                e = e;
                                z10 = u10;
                                str = name;
                            }
                            if (z11 || !h) {
                                if (!z11 || f7) {
                                    boolean f10 = uVar.f("secure-playback", d, capabilitiesForType);
                                    boolean h10 = uVar.h("secure-playback", capabilitiesForType);
                                    if (z13 || !h10) {
                                        if (!z13 || f10) {
                                            boolean i14 = i(a2, str2);
                                            z10 = u10;
                                            try {
                                                j10 = j(a2, str2);
                                                if (i12 >= 29) {
                                                    z12 = a2.isVendor();
                                                } else {
                                                    String c10 = s6.c(a2.getName());
                                                    z12 = (c10.startsWith("omx.google.") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                str = name;
                                                i10 = i13;
                                                if (Build.VERSION.SDK_INT != 23) {
                                                }
                                                e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                throw e;
                                            }
                                            if (!(z10 && z13 == f10) && (z10 || z13)) {
                                                boolean z14 = z12;
                                                i10 = i13;
                                                if (!z10 && f10) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, d, capabilitiesForType, i14, j10, z14, true));
                                                        break;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        if (Build.VERSION.SDK_INT != 23) {
                                                        }
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                u10 = z10;
                                            } else {
                                                i10 = i13;
                                                try {
                                                    arrayList.add(o.i(name, str2, d, capabilitiesForType, i14, j10, z12, false));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    e2.a.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i11 = i10 + 1;
                                                    sVar2 = sVar;
                                                    u10 = z10;
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                u10 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = u10;
                        i10 = i13;
                        i11 = i10 + 1;
                        sVar2 = sVar;
                        u10 = z10;
                    }
                }
                z10 = u10;
                i10 = i11;
                i11 = i10 + 1;
                sVar2 = sVar;
                u10 = z10;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new t("Failed to query underlying media codecs", e12);
        }
    }

    public static x1 g(i iVar, b2.w wVar, boolean z10, boolean z11) {
        List a2 = iVar.a(wVar.s, z10, z11);
        String c10 = c(wVar);
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
        String c10 = s6.c(mediaCodecInfo.getName());
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
