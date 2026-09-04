package r2;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b2.r0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.a1;
import e9.f0;
import e9.i0;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import w7.z6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z10;
        this.e = z13;
        this.f = z14;
        this.h = z15;
        this.i = r0.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(d0.f(i10, widthAlignment) * widthAlignment, d0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i12, i13, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r11) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        String str4;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (Build.VERSION.SDK_INT <= 22) {
                String str5 = Build.MODEL;
                if (!"ODROID-XU3".equals(str5)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z14 = true;
            if (codecCapabilities != null) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            boolean z16 = !z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
            if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
                str4 = Build.MANUFACTURER;
                if (!str4.equals("Xiaomi") && !str4.equals("OPPO") && !str4.equals("realme") && !str4.equals("motorola") && !str4.equals("LENOVO")) {
                    z15 = true;
                    return new o(str, str2, str3, codecCapabilities, z10, z11, z12, z14, z16, z15);
                }
            }
            z15 = false;
            return new o(str, str2, str3, codecCapabilities, z10, z11, z12, z14, z16, z15);
        }
        z14 = false;
        if (codecCapabilities != null) {
        }
        if (z13) {
        }
        if (Build.VERSION.SDK_INT >= 35) {
            str4 = Build.MANUFACTURER;
            if (!str4.equals("Xiaomi")) {
                z15 = true;
                return new o(str, str2, str3, codecCapabilities, z10, z11, z12, z14, z16, z15);
            }
        }
        z15 = false;
        return new o(str, str2, str3, codecCapabilities, z10, z11, z12, z14, z16, z15);
    }

    public final i2.i b(b2.s sVar, b2.s sVar2) {
        b2.s sVar3;
        b2.s sVar4;
        int i10;
        String str = sVar.r;
        b2.j jVar = sVar.H;
        String str2 = sVar2.r;
        b2.j jVar2 = sVar2.H;
        int i11 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (sVar.D != sVar2.D) {
                i11 |= 1024;
            }
            boolean z10 = (sVar.y == sVar2.y && sVar.z == sVar2.z) ? false : true;
            if (!this.e && z10) {
                i11 |= 512;
            }
            if ((!b2.j.e(jVar) || !b2.j.e(jVar2)) && !Objects.equals(jVar, jVar2)) {
                i11 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !sVar.b(sVar2)) {
                i11 |= 2;
            }
            int i12 = sVar.A;
            if (i12 != -1 && (i10 = sVar.B) != -1 && i12 == sVar2.A && i10 == sVar2.B && z10) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new i2.i(this.a, sVar, sVar2, sVar.b(sVar2) ? 3 : 2, 0);
            }
            sVar3 = sVar;
            sVar4 = sVar2;
        } else {
            sVar3 = sVar;
            sVar4 = sVar2;
            if (sVar3.J != sVar4.J) {
                i11 |= 4096;
            }
            if (sVar3.K != sVar4.K) {
                i11 |= 8192;
            }
            if (sVar3.L != sVar4.L) {
                i11 |= 16384;
            }
            String str3 = this.b;
            if (i11 == 0 && MediaController.AUDIO_MIME_TYPE.equals(str3)) {
                HashMap hashMap = w.a;
                Pair b10 = e2.e.b(sVar3);
                Pair b11 = e2.e.b(sVar4);
                if (b10 != null && b11 != null) {
                    int intValue = ((Integer) b10.first).intValue();
                    int intValue2 = ((Integer) b11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i2.i(this.a, sVar3, sVar4, 3, 0);
                    }
                }
            }
            if (!sVar3.b(sVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new i2.i(this.a, sVar3, sVar4, 1, 0);
            }
        }
        return new i2.i(this.a, sVar3, sVar4, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(b2.s sVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String str;
        HashMap hashMap = w.a;
        Pair b10 = e2.e.b(sVar);
        String str2 = sVar.r;
        int i10 = 4;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n10 = r0.n(str3);
            if (n10.equals("video/mv-hevc")) {
                return true;
            }
            if (n10.equals("video/hevc")) {
                List list = sVar.u;
                int i11 = 0;
                loop0: while (true) {
                    if (i11 >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i11);
                    int length = bArr.length;
                    int i12 = 3;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        f0 u10 = i0.u();
                        int i13 = 0;
                        while (i13 < bArr.length) {
                            int b11 = f2.p.b(bArr, i13, bArr.length, zArr);
                            if (b11 != bArr.length) {
                                u10.b(Integer.valueOf(b11));
                            }
                            i13 = b11 + 3;
                        }
                        a1 i14 = u10.i();
                        int i15 = 0;
                        while (i15 < i14.d) {
                            if (((Integer) i14.get(i15)).intValue() + i12 < length) {
                                a4.h hVar = new a4.h(bArr, ((Integer) i14.get(i15)).intValue() + i12, length);
                                a3.k e7 = f2.p.e(hVar);
                                if (e7.a == 33 && e7.b == 0) {
                                    hVar.t(4);
                                    int i16 = hVar.i(3);
                                    hVar.s();
                                    pair = null;
                                    f2.i f7 = f2.p.f(hVar, true, i16, null);
                                    str = e2.e.a(f7.a, f7.c, f7.d, f7.f, f7.b, f7.e);
                                    break loop0;
                                }
                            }
                            i15++;
                            i12 = 3;
                        }
                    }
                    i11++;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = d0.a;
                    b10 = e2.e.c(str, trim.split("\\.", -1), sVar.H);
                    if (b10 != null) {
                        return true;
                    }
                    int intValue = ((Integer) b10.first).intValue();
                    int intValue2 = ((Integer) b10.second).intValue();
                    boolean equals = "video/dolby-vision".equals(str2);
                    String str5 = this.b;
                    if (equals) {
                        str5.getClass();
                        switch (str5) {
                            case "video/av01":
                            case "video/hevc":
                                intValue2 = 0;
                                intValue = 2;
                                break;
                            case "video/avc":
                                intValue2 = 0;
                                intValue = 8;
                                break;
                        }
                    }
                    if (!this.i && intValue != 42) {
                        return true;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (Build.VERSION.SDK_INT <= 23 && "video/x-vnd.on2.vp9".equals(str5) && codecProfileLevelArr.length == 0) {
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        if (intValue3 >= 180000000) {
                            i10 = 1024;
                        } else if (intValue3 >= 120000000) {
                            i10 = 512;
                        } else if (intValue3 >= 60000000) {
                            i10 = 256;
                        } else if (intValue3 >= 30000000) {
                            i10 = 128;
                        } else if (intValue3 >= 18000000) {
                            i10 = 64;
                        } else if (intValue3 >= 12000000) {
                            i10 = 32;
                        } else if (intValue3 >= 7200000) {
                            i10 = 16;
                        } else if (intValue3 >= 3600000) {
                            i10 = 8;
                        } else if (intValue3 < 1800000) {
                            i10 = intValue3 >= 800000 ? 2 : 1;
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i10;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    h("codec.profileLevel, " + sVar.k + ", " + str3);
                    return false;
                }
                b10 = pair;
            }
        }
        if (b10 != null) {
        }
    }

    public final boolean d(b2.s sVar) {
        return (Objects.equals(sVar.r, "audio/flac") && sVar.L == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(b2.s sVar) {
        int i10;
        String str = sVar.r;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(w.b(sVar))) || !c(sVar, true) || !d(sVar)) {
            return false;
        }
        if (this.i) {
            int i11 = sVar.y;
            if (i11 > 0 && (i10 = sVar.z) > 0) {
                return g(i11, i10, sVar.C);
            }
        } else {
            int i12 = sVar.K;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i12)) {
                    h("sampleRate.support, " + i12);
                    return false;
                }
            }
            int i13 = sVar.J;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !MediaController.AUDIO_MIME_TYPE.equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    e2.a.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i14 + "]");
                    maxInputChannelCount = i14;
                }
                if (maxInputChannelCount < i13) {
                    h("channelCount.support, " + i13);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(b2.s sVar) {
        if (this.i) {
            return this.e;
        }
        HashMap hashMap = w.a;
        Pair b10 = e2.e.b(sVar);
        return b10 != null && ((Integer) b10.first).intValue() == 42;
    }

    public final boolean g(int i10, int i11, double d) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            int b10 = (i12 < 29 || ((bool = z6.a) != null && bool.booleanValue())) ? 0 : b2.c.b(videoCapabilities, i10, i11, d);
            if (b10 != 2) {
                if (b10 == 1) {
                    StringBuilder k10 = e2.k("sizeAndRate.cover, ", i10, "x", i11, "@");
                    k10.append(d);
                    h(k10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder k11 = e2.k("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    k11.append(d);
                    StringBuilder w10 = a4.a.w("AssumedSupport [", k11.toString(), "] [", str, ", ");
                    w10.append(this.b);
                    w10.append("] [");
                    w10.append(d0.a);
                    w10.append("]");
                    e2.a.d("MediaCodecInfo", w10.toString());
                    return true;
                }
            }
            StringBuilder k12 = e2.k("sizeAndRate.support, ", i10, "x", i11, "@");
            k12.append(d);
            h(k12.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder v = a4.a.v("NoSupport [", str, "] [");
        v.append(this.a);
        v.append(", ");
        v.append(this.b);
        v.append("] [");
        v.append(d0.a);
        v.append("]");
        e2.a.d("MediaCodecInfo", v.toString());
    }

    public final String toString() {
        return this.a;
    }
}
