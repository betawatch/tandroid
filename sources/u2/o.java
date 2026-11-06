package u2;

import a8.p0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import c8.oc;
import e2.s0;
import h2.m0;
import h9.f0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z9;
        this.e = z12;
        this.f = z13;
        this.h = z14;
        this.i = s0.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(m0.g(i7, widthAlignment) * widthAlignment, m0.g(i10, heightAlignment) * heightAlignment);
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

    public static o i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z14;
        boolean z15;
        boolean z16;
        String str6;
        boolean z17 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z18 = z12 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z13 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z14 = z9;
                z15 = z10;
                z16 = z11;
                str4 = str2;
                return new o(str6, str4, str5, codecCapabilities2, z14, z15, z16, z17, z18, z13);
            }
        }
        z13 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z14 = z9;
        z15 = z10;
        z16 = z11;
        str6 = str;
        return new o(str6, str4, str5, codecCapabilities2, z14, z15, z16, z17, z18, z13);
    }

    public final l2.e b(e2.u uVar, e2.u uVar2) {
        e2.u uVar3;
        e2.u uVar4;
        int i7;
        String str = uVar.s;
        e2.m mVar = uVar.I;
        String str2 = uVar2.s;
        e2.m mVar2 = uVar2.I;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (uVar.E != uVar2.E) {
                i10 |= 1024;
            }
            boolean z9 = (uVar.z == uVar2.z && uVar.A == uVar2.A) ? false : true;
            if (!this.e && z9) {
                i10 |= 512;
            }
            if ((!e2.m.e(mVar) || !e2.m.e(mVar2)) && !Objects.equals(mVar, mVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !uVar.b(uVar2)) {
                i10 |= 2;
            }
            int i11 = uVar.B;
            if (i11 != -1 && (i7 = uVar.C) != -1 && i11 == uVar2.B && i7 == uVar2.C && z9) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(uVar2.s, "video/dolby-vision")) {
                Pair b10 = h2.g.b(uVar);
                Pair b11 = h2.g.b(uVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i10 |= 2;
                }
            }
            if (i10 == 0) {
                return new l2.e(this.a, uVar, uVar2, uVar.b(uVar2) ? 3 : 2, 0);
            }
            uVar3 = uVar;
            uVar4 = uVar2;
        } else {
            uVar3 = uVar;
            uVar4 = uVar2;
            if (uVar3.K != uVar4.K) {
                i10 |= TLObject.FLAG_12;
            }
            if (uVar3.L != uVar4.L) {
                i10 |= TLObject.FLAG_13;
            }
            if (uVar3.M != uVar4.M) {
                i10 |= TLObject.FLAG_14;
            }
            String str3 = this.b;
            if (i10 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = h2.g.b(uVar3);
                Pair b13 = h2.g.b(uVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new l2.e(this.a, uVar3, uVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new l2.e(this.a, uVar3, uVar4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new l2.e(this.a, uVar3, uVar4, 3, 0);
            }
            if (!uVar3.b(uVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new l2.e(this.a, uVar3, uVar4, 1, 0);
            }
        }
        return new l2.e(this.a, uVar3, uVar4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, e2.u uVar, boolean z9) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String str;
        Pair b10 = h2.g.b(uVar);
        String str2 = uVar.s;
        int i10 = 3;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n10 = s0.n(str3);
            if (n10.equals("video/mv-hevc")) {
                return true;
            }
            if (n10.equals("video/hevc")) {
                HashMap hashMap = w.a;
                List list = uVar.v;
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
                            int c10 = i2.o.c(bArr, i12, bArr.length, zArr);
                            if (c10 != bArr.length) {
                                p10.c(Integer.valueOf(c10));
                            }
                            i12 = c10 + 3;
                        }
                        t1 f10 = p10.f();
                        int i13 = 0;
                        while (i13 < f10.d) {
                            if (((Integer) f10.get(i13)).intValue() + i10 < length) {
                                i2.s sVar = new i2.s(bArr, ((Integer) f10.get(i13)).intValue() + i10, length);
                                b7.d h = i2.o.h(sVar);
                                if (h.a == 33 && h.b == 0) {
                                    sVar.j(4);
                                    int e10 = sVar.e(3);
                                    sVar.i();
                                    pair = null;
                                    i2.h i14 = i2.o.i(sVar, true, e10, null);
                                    str = h2.g.a(i14.a, i14.c, i14.d, i14.f, i14.b, i14.e);
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
                    String str4 = m0.a;
                    b10 = h2.g.c(str, trim.split("\\.", -1), uVar.I);
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
                            i7 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1026, i15)};
                        } else {
                            i7 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(qs.g4, i15), w.b(513, i15), w.b(514, i15), w.b(1026, i15), w.b(1028, i15)};
                        }
                    } else {
                        i7 = 4;
                    }
                    if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str5) && codecProfileLevelArr.length == 0) {
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1, intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? i7 : intValue3 >= 800000 ? 2 : 1)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z9)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    h("codec.profileLevel, " + uVar.k + ", " + str3);
                    return false;
                }
                b10 = pair;
            }
        }
        if (b10 != null) {
        }
    }

    public final boolean d(e2.u uVar) {
        return (Objects.equals(uVar.s, "audio/flac") && uVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, e2.u uVar) {
        int i7;
        String str = uVar.s;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(w.c(uVar))) || !c(context, uVar, true) || !d(uVar)) {
            return false;
        }
        if (this.i) {
            int i10 = uVar.z;
            if (i10 > 0 && (i7 = uVar.A) > 0) {
                return g(i10, i7, uVar.D);
            }
        } else {
            int i11 = uVar.L;
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
            int i12 = uVar.K;
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
                    h2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i13 + "]");
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

    public final boolean f(e2.u uVar) {
        if (this.i) {
            return this.e;
        }
        Pair b10 = h2.g.b(uVar);
        return b10 != null && ((Integer) b10.first).intValue() == 42;
    }

    public final boolean g(int i7, int i10, double d) {
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
            int b10 = (i11 < 29 || ((bool = oc.a) != null && bool.booleanValue())) ? 0 : ab.x.b(videoCapabilities, i7, i10, d);
            if (b10 != 2) {
                if (b10 == 1) {
                    StringBuilder o4 = jg.g.o("sizeAndRate.cover, ", i7, "x", i10, "@");
                    o4.append(d);
                    h(o4.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i7, i10, d)) {
            if (i7 < i10) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i10, i7, d)) {
                    StringBuilder o10 = jg.g.o("sizeAndRate.rotated, ", i7, "x", i10, "@");
                    o10.append(d);
                    StringBuilder n10 = com.google.android.recaptcha.internal.a.n("AssumedSupport [", o10.toString(), "] [", str, ", ");
                    n10.append(this.b);
                    n10.append("] [");
                    n10.append(m0.a);
                    n10.append("]");
                    h2.a.b("MediaCodecInfo", n10.toString());
                    return true;
                }
            }
            StringBuilder o11 = jg.g.o("sizeAndRate.support, ", i7, "x", i10, "@");
            o11.append(d);
            h(o11.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder u10 = p0.u("NoSupport [", str, "] [");
        u10.append(this.a);
        u10.append(", ");
        u10.append(this.b);
        u10.append("] [");
        u10.append(m0.a);
        u10.append("]");
        h2.a.b("MediaCodecInfo", u10.toString());
    }

    public final String toString() {
        return this.a;
    }
}
