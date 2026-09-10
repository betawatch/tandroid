package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.r0;
import bi.q3;
import c5.b0;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import v7.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new q3(new i(), 3));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static String b(b2.s sVar) {
        Pair b10;
        String str = sVar.r;
        String str2 = sVar.r;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (b10 = e2.e.b(sVar)) != null) {
            int intValue = ((Integer) b10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return MediaController.VIDEO_MIME_TYPE;
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
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

    public static synchronized List d(String str, boolean z10, boolean z11) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z10, z11);
                HashMap hashMap = a;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                ArrayList e = e(sVar, new b0(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && e.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                    e = e(sVar, new qb.b(20));
                    if (!e.isEmpty()) {
                        e2.a.n("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) e.get(0)).a);
                    }
                }
                a(str, e);
                i0 v = i0.v(e);
                hashMap.put(sVar, v);
                return v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0109 A[Catch: Exception -> 0x0153, TRY_ENTER, TryCatch #4 {Exception -> 0x0153, blocks: (B:3:0x000c, B:5:0x0020, B:7:0x002a, B:11:0x0128, B:12:0x0036, B:15:0x0041, B:47:0x0101, B:50:0x0109, B:52:0x010f, B:55:0x0130, B:56:0x0151), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(s sVar, u uVar) {
        boolean z10;
        String str;
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean w10;
        boolean T;
        boolean z11;
        boolean i11;
        boolean z12;
        s sVar2 = sVar;
        boolean z13 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int V = uVar.V();
            boolean g02 = uVar.g0();
            int i12 = 0;
            while (i12 < V) {
                MediaCodecInfo d = uVar.d(i12);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 < 29 || !d.isAlias()) {
                    String name = d.getName();
                    if (g(d, name, g02, str2)) {
                        int i14 = i12;
                        String c10 = c(d, name, str2);
                        if (c10 != null) {
                            try {
                                capabilitiesForType = d.getCapabilitiesForType(c10);
                                w10 = uVar.w("tunneled-playback", c10, capabilitiesForType);
                                T = uVar.T("tunneled-playback", capabilitiesForType);
                                z11 = sVar2.c;
                            } catch (Exception e) {
                                e = e;
                                z10 = g02;
                                str = name;
                            }
                            if (z11 || !T) {
                                if (!z11 || w10) {
                                    boolean w11 = uVar.w("secure-playback", c10, capabilitiesForType);
                                    boolean T2 = uVar.T("secure-playback", capabilitiesForType);
                                    if (z13 || !T2) {
                                        if (!z13 || w11) {
                                            boolean h = h(d, str2);
                                            z10 = g02;
                                            try {
                                                i11 = i(d, str2);
                                                if (i13 >= 29) {
                                                    z12 = d.isVendor();
                                                } else {
                                                    String b10 = r6.b(d.getName());
                                                    z12 = (b10.startsWith("omx.google.") || b10.startsWith("c2.android.") || b10.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                str = name;
                                                i10 = i14;
                                                if (Build.VERSION.SDK_INT > 23) {
                                                }
                                                e2.a.e("MediaCodecUtil", "Failed to query codec " + str + " (" + c10 + ")");
                                                throw e;
                                            }
                                            if (!(z10 && z13 == w11) && (z10 || z13)) {
                                                boolean z14 = z12;
                                                i10 = i14;
                                                if (!z10 && w11) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, c10, capabilitiesForType, h, i11, z14, true));
                                                        break;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        if (Build.VERSION.SDK_INT > 23) {
                                                        }
                                                        e2.a.e("MediaCodecUtil", "Failed to query codec " + str + " (" + c10 + ")");
                                                        throw e;
                                                    }
                                                }
                                                i12 = i10 + 1;
                                                sVar2 = sVar;
                                                g02 = z10;
                                            } else {
                                                i10 = i14;
                                                try {
                                                    arrayList.add(o.i(name, str2, c10, capabilitiesForType, h, i11, z12, false));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT > 23 || arrayList.isEmpty()) {
                                                        e2.a.e("MediaCodecUtil", "Failed to query codec " + str + " (" + c10 + ")");
                                                        throw e;
                                                    }
                                                    e2.a.e("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i12 = i10 + 1;
                                                    sVar2 = sVar;
                                                    g02 = z10;
                                                }
                                                i12 = i10 + 1;
                                                sVar2 = sVar;
                                                g02 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = g02;
                        i10 = i14;
                        i12 = i10 + 1;
                        sVar2 = sVar;
                        g02 = z10;
                    }
                }
                z10 = g02;
                i10 = i12;
                i12 = i10 + 1;
                sVar2 = sVar;
                g02 = z10;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new t("Failed to query underlying media codecs", e12);
        }
    }

    public static a1 f(i iVar, b2.s sVar, boolean z10, boolean z11) {
        List b10 = iVar.b(sVar.r, z10, z11);
        String b11 = b(sVar);
        List b12 = b11 == null ? a1.e : iVar.b(b11, z10, z11);
        f0 u10 = i0.u();
        u10.d(b10);
        u10.d(b12);
        return u10.i();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
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
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (r0.i(str)) {
            return true;
        }
        String b10 = r6.b(mediaCodecInfo.getName());
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
}
