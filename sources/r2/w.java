package r2;

import a8.wb;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import b2.w0;
import bi.p5;
import d5.z;
import f9.f0;
import f9.i0;
import f9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new p5(new i(), 4));
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
                return MediaController.VIDEO_MIME_TYPE;
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
                ArrayList f7 = f(sVar, new z(z10, z11, str.equals("video/mv-hevc")));
                if (z10 && f7.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    f7 = f(sVar, new tb.a(20));
                    if (!f7.isEmpty()) {
                        e2.a.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f7.get(0)).a);
                    }
                }
                a(str, f7);
                i0 u10 = i0.u(f7);
                hashMap.put(sVar, u10);
                return u10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010c A[Catch: Exception -> 0x0156, TRY_ENTER, TryCatch #4 {Exception -> 0x0156, blocks: (B:3:0x000c, B:5:0x0021, B:7:0x002b, B:11:0x012b, B:12:0x0037, B:15:0x0042, B:47:0x0104, B:50:0x010c, B:52:0x0112, B:55:0x0133, B:56:0x0154), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(s sVar, u uVar) {
        boolean z10;
        String str;
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean o10;
        boolean B;
        boolean z11;
        boolean j10;
        boolean z12;
        s sVar2 = sVar;
        boolean z13 = sVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = sVar2.a;
            int G = uVar.G();
            boolean i02 = uVar.i0();
            int i11 = 0;
            while (i11 < G) {
                MediaCodecInfo e = uVar.e(i11);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 29 || !e.isAlias()) {
                    String name = e.getName();
                    if (h(e, name, i02, str2)) {
                        int i13 = i11;
                        String d = d(e, name, str2);
                        if (d != null) {
                            try {
                                capabilitiesForType = e.getCapabilitiesForType(d);
                                o10 = uVar.o("tunneled-playback", d, capabilitiesForType);
                                B = uVar.B("tunneled-playback", capabilitiesForType);
                                z11 = sVar2.c;
                            } catch (Exception e10) {
                                e = e10;
                                z10 = i02;
                                str = name;
                            }
                            if (z11 || !B) {
                                if (!z11 || o10) {
                                    boolean o11 = uVar.o("secure-playback", d, capabilitiesForType);
                                    boolean B2 = uVar.B("secure-playback", capabilitiesForType);
                                    if (z13 || !B2) {
                                        if (!z13 || o11) {
                                            boolean i14 = i(e, str2);
                                            z10 = i02;
                                            try {
                                                j10 = j(e, str2);
                                                if (i12 >= 29) {
                                                    z12 = e.isVendor();
                                                } else {
                                                    String c10 = wb.c(e.getName());
                                                    z12 = (c10.startsWith("omx.google.") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) ? false : true;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str = name;
                                                i10 = i13;
                                                if (Build.VERSION.SDK_INT != 23) {
                                                }
                                                e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                throw e;
                                            }
                                            if (!(z10 && z13 == o11) && (z10 || z13)) {
                                                boolean z14 = z12;
                                                i10 = i13;
                                                if (!z10 && o11) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(o.i(name + ".secure", str2, d, capabilitiesForType, i14, j10, z14, true));
                                                        break;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        if (Build.VERSION.SDK_INT != 23) {
                                                        }
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                i02 = z10;
                                            } else {
                                                i10 = i13;
                                                try {
                                                    arrayList.add(o.i(name, str2, d, capabilitiesForType, i14, j10, z12, false));
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT != 23 || arrayList.isEmpty()) {
                                                        e2.a.c("MediaCodecUtil", "Failed to query codec " + str + " (" + d + ")");
                                                        throw e;
                                                    }
                                                    e2.a.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                    i11 = i10 + 1;
                                                    sVar2 = sVar;
                                                    i02 = z10;
                                                }
                                                i11 = i10 + 1;
                                                sVar2 = sVar;
                                                i02 = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z10 = i02;
                        i10 = i13;
                        i11 = i10 + 1;
                        sVar2 = sVar;
                        i02 = z10;
                    }
                }
                z10 = i02;
                i10 = i11;
                i11 = i10 + 1;
                sVar2 = sVar;
                i02 = z10;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new t("Failed to query underlying media codecs", e14);
        }
    }

    public static s1 g(i iVar, b2.x xVar, boolean z10, boolean z11) {
        List a2 = iVar.a(xVar.s, z10, z11);
        String c10 = c(xVar);
        List a10 = c10 == null ? s1.e : iVar.a(c10, z10, z11);
        f0 t10 = i0.t();
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
        if (w0.i(str)) {
            return true;
        }
        String c10 = wb.c(mediaCodecInfo.getName());
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
