package t2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import d2.u0;
import g2.n0;
import g9.f0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        this.i = u0.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i10, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(n0.g(i3, widthAlignment) * widthAlignment, n0.g(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i11, i12);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i11, i12, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z15;
        boolean z16;
        boolean z17;
        String str6;
        boolean z18 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z19 = z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z14 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z15 = z10;
                z16 = z11;
                z17 = z12;
                str4 = str2;
                return new o(str6, str4, str5, codecCapabilities2, z15, z16, z17, z18, z19, z14);
            }
        }
        z14 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z15 = z10;
        z16 = z11;
        z17 = z12;
        str6 = str;
        return new o(str6, str4, str5, codecCapabilities2, z15, z16, z17, z18, z19, z14);
    }

    public final k2.e b(d2.v vVar, d2.v vVar2) {
        d2.v vVar3;
        d2.v vVar4;
        int i3;
        String str = vVar.s;
        d2.n nVar = vVar.I;
        String str2 = vVar2.s;
        d2.n nVar2 = vVar2.I;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (vVar.E != vVar2.E) {
                i10 |= 1024;
            }
            boolean z10 = (vVar.z == vVar2.z && vVar.A == vVar2.A) ? false : true;
            if (!this.e && z10) {
                i10 |= 512;
            }
            if ((!d2.n.e(nVar) || !d2.n.e(nVar2)) && !Objects.equals(nVar, nVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !vVar.b(vVar2)) {
                i10 |= 2;
            }
            int i11 = vVar.B;
            if (i11 != -1 && (i3 = vVar.C) != -1 && i11 == vVar2.B && i3 == vVar2.C && z10) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(vVar2.s, "video/dolby-vision")) {
                Pair b10 = g2.h.b(vVar);
                Pair b11 = g2.h.b(vVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i10 |= 2;
                }
            }
            if (i10 == 0) {
                return new k2.e(this.a, vVar, vVar2, vVar.b(vVar2) ? 3 : 2, 0);
            }
            vVar3 = vVar;
            vVar4 = vVar2;
        } else {
            vVar3 = vVar;
            vVar4 = vVar2;
            if (vVar3.K != vVar4.K) {
                i10 |= TLObject.FLAG_12;
            }
            if (vVar3.L != vVar4.L) {
                i10 |= TLObject.FLAG_13;
            }
            if (vVar3.M != vVar4.M) {
                i10 |= TLObject.FLAG_14;
            }
            String str3 = this.b;
            if (i10 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = g2.h.b(vVar3);
                Pair b13 = g2.h.b(vVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new k2.e(this.a, vVar3, vVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new k2.e(this.a, vVar3, vVar4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new k2.e(this.a, vVar3, vVar4, 3, 0);
            }
            if (!vVar3.b(vVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new k2.e(this.a, vVar3, vVar4, 1, 0);
            }
        }
        return new k2.e(this.a, vVar3, vVar4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, d2.v vVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String str;
        Pair b10 = g2.h.b(vVar);
        String str2 = vVar.s;
        int i10 = 3;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n4 = u0.n(str3);
            if (n4.equals("video/mv-hevc")) {
                return true;
            }
            if (n4.equals("video/hevc")) {
                HashMap hashMap = w.a;
                List list = vVar.v;
                int i11 = 0;
                loop0: while (true) {
                    if (i11 >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i11);
                    int length = bArr.length;
                    if (length > i10) {
                        boolean[] zArr = new boolean[i10];
                        f0 p10 = i0.p();
                        int i12 = 0;
                        while (i12 < bArr.length) {
                            int c2 = h2.o.c(bArr, i12, bArr.length, zArr);
                            if (c2 != bArr.length) {
                                p10.c(Integer.valueOf(c2));
                            }
                            i12 = c2 + 3;
                        }
                        s1 f10 = p10.f();
                        int i13 = 0;
                        while (i13 < f10.d) {
                            if (((Integer) f10.get(i13)).intValue() + i10 < length) {
                                h2.s sVar = new h2.s(bArr, ((Integer) f10.get(i13)).intValue() + i10, length);
                                a7.d h = h2.o.h(sVar);
                                if (h.a == 33 && h.b == 0) {
                                    sVar.j(4);
                                    int e10 = sVar.e(3);
                                    sVar.i();
                                    pair = null;
                                    h2.h i14 = h2.o.i(sVar, true, e10, null);
                                    str = g2.h.a(i14.a, i14.c, i14.d, i14.f, i14.b, i14.e);
                                    break loop0;
                                }
                            }
                            i13++;
                            i10 = 3;
                        }
                    }
                    i11++;
                    i10 = 3;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = n0.a;
                    b10 = g2.h.c(str, trim.split("\\.", -1), vVar.I);
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
                                intValue = 2;
                                intValue2 = 0;
                                break;
                            case "video/avc":
                                intValue2 = 0;
                                intValue = 8;
                                break;
                        }
                    }
                    if (!this.i && !str5.equals("audio/ac4") && intValue != 42) {
                        return true;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        int i15 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            i3 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1026, i15)};
                        } else {
                            i3 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(hs.g4, i15), w.b(513, i15), w.b(514, i15), w.b(1026, i15), w.b(1028, i15)};
                        }
                    } else {
                        i3 = 4;
                    }
                    if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str5) && codecProfileLevelArr.length == 0) {
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1, intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? i3 : intValue3 >= 800000 ? 2 : 1)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z10)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    h("codec.profileLevel, " + vVar.k + ", " + str3);
                    return false;
                }
                b10 = pair;
            }
        }
        if (b10 != null) {
        }
    }

    public final boolean d(d2.v vVar) {
        return (Objects.equals(vVar.s, "audio/flac") && vVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, d2.v vVar) {
        int i3;
        String str = vVar.s;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(w.c(vVar))) || !c(context, vVar, true) || !d(vVar)) {
            return false;
        }
        if (this.i) {
            int i10 = vVar.z;
            if (i10 > 0 && (i3 = vVar.A) > 0) {
                return g(i10, i3, vVar.D);
            }
        } else {
            int i11 = vVar.L;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i11 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i11)) {
                    h("sampleRate.support, " + i11);
                    return false;
                }
            }
            int i12 = vVar.K;
            if (i12 != -1) {
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
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    g2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i13 + "]");
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    h("channelCount.support, " + i12);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(d2.v vVar) {
        if (this.i) {
            return this.e;
        }
        Pair b10 = g2.h.b(vVar);
        return b10 != null && ((Integer) b10.first).intValue() == 42;
    }

    public final boolean g(int i3, int i10, double d) {
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
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            int b10 = (i11 < 29 || ((bool = x7.w.a) != null && bool.booleanValue())) ? 0 : d2.d.b(videoCapabilities, i3, i10, d);
            if (b10 != 2) {
                if (b10 == 1) {
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m("sizeAndRate.cover, ", i3, "x", i10, "@");
                    m10.append(d);
                    h(m10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i3, i10, d)) {
            if (i3 < i10) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i10, i3, d)) {
                    StringBuilder m11 = com.google.android.recaptcha.internal.a.m("sizeAndRate.rotated, ", i3, "x", i10, "@");
                    m11.append(d);
                    StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AssumedSupport [", m11.toString(), "] [", str, ", ");
                    n4.append(this.b);
                    n4.append("] [");
                    n4.append(n0.a);
                    n4.append("]");
                    g2.a.b("MediaCodecInfo", n4.toString());
                    return true;
                }
            }
            StringBuilder m12 = com.google.android.recaptcha.internal.a.m("sizeAndRate.support, ", i3, "x", i10, "@");
            m12.append(d);
            h(m12.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder u10 = a1.g.u("NoSupport [", str, "] [");
        u10.append(this.a);
        u10.append(", ");
        u10.append(this.b);
        u10.append("] [");
        u10.append(n0.a);
        u10.append("]");
        g2.a.b("MediaCodecInfo", u10.toString());
    }

    public final String toString() {
        return this.a;
    }
}
