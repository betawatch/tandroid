package r2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import b2.v0;
import e2.l0;
import e9.k0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import w7.z6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        this.i = v0.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(l0.g(i10, widthAlignment) * widthAlignment, l0.g(i11, heightAlignment) * heightAlignment);
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

    public final i2.e b(b2.x xVar, b2.x xVar2) {
        b2.x xVar3;
        b2.x xVar4;
        int i10;
        String str = xVar.s;
        b2.o oVar = xVar.I;
        String str2 = xVar2.s;
        b2.o oVar2 = xVar2.I;
        int i11 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (xVar.E != xVar2.E) {
                i11 |= 1024;
            }
            boolean z10 = (xVar.z == xVar2.z && xVar.A == xVar2.A) ? false : true;
            if (!this.e && z10) {
                i11 |= 512;
            }
            if ((!b2.o.e(oVar) || !b2.o.e(oVar2)) && !Objects.equals(oVar, oVar2)) {
                i11 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !xVar.b(xVar2)) {
                i11 |= 2;
            }
            int i12 = xVar.B;
            if (i12 != -1 && (i10 = xVar.C) != -1 && i12 == xVar2.B && i10 == xVar2.C && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(xVar2.s, "video/dolby-vision")) {
                Pair b10 = e2.g.b(xVar);
                Pair b11 = e2.g.b(xVar2);
                if (b10 == null || b11 == null || !((Integer) b10.first).equals(b11.first)) {
                    i11 |= 2;
                }
            }
            if (i11 == 0) {
                return new i2.e(this.a, xVar, xVar2, xVar.b(xVar2) ? 3 : 2, 0);
            }
            xVar3 = xVar;
            xVar4 = xVar2;
        } else {
            xVar3 = xVar;
            xVar4 = xVar2;
            if (xVar3.K != xVar4.K) {
                i11 |= TLObject.FLAG_12;
            }
            if (xVar3.L != xVar4.L) {
                i11 |= TLObject.FLAG_13;
            }
            if (xVar3.M != xVar4.M) {
                i11 |= TLObject.FLAG_14;
            }
            String str3 = this.b;
            if (i11 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair b12 = e2.g.b(xVar3);
                Pair b13 = e2.g.b(xVar4);
                if (b12 != null && b13 != null) {
                    int intValue = ((Integer) b12.first).intValue();
                    int intValue2 = ((Integer) b13.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i2.e(this.a, xVar3, xVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b12.equals(b13)) {
                        return new i2.e(this.a, xVar3, xVar4, 3, 0);
                    }
                }
            }
            if (i11 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new i2.e(this.a, xVar3, xVar4, 3, 0);
            }
            if (!xVar3.b(xVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new i2.e(this.a, xVar3, xVar4, 1, 0);
            }
        }
        return new i2.e(this.a, xVar3, xVar4, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, b2.x xVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String str;
        Pair b10 = e2.g.b(xVar);
        String str2 = xVar.s;
        int i11 = 3;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String n10 = v0.n(str3);
            if (n10.equals("video/mv-hevc")) {
                return true;
            }
            if (n10.equals("video/hevc")) {
                HashMap hashMap = w.a;
                List list = xVar.v;
                int i12 = 0;
                loop0: while (true) {
                    if (i12 >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i12);
                    int length = bArr.length;
                    if (length > i11) {
                        boolean[] zArr = new boolean[i11];
                        k0 t10 = n0.t();
                        int i13 = 0;
                        while (i13 < bArr.length) {
                            int c10 = f2.q.c(bArr, i13, bArr.length, zArr);
                            if (c10 != bArr.length) {
                                t10.c(Integer.valueOf(c10));
                            }
                            i13 = c10 + 3;
                        }
                        x1 f7 = t10.f();
                        int i14 = 0;
                        while (i14 < f7.d) {
                            if (((Integer) f7.get(i14)).intValue() + i11 < length) {
                                f2.u uVar = new f2.u(bArr, ((Integer) f7.get(i14)).intValue() + i11, length);
                                a3.l h = f2.q.h(uVar);
                                if (h.a == 33 && h.b == 0) {
                                    uVar.j(4);
                                    int e = uVar.e(3);
                                    uVar.i();
                                    pair = null;
                                    f2.j i15 = f2.q.i(uVar, true, e, null);
                                    str = e2.g.a(i15.a, i15.c, i15.d, i15.f, i15.b, i15.e);
                                    break loop0;
                                }
                            }
                            i14++;
                            i11 = 3;
                        }
                    }
                    i12++;
                    i11 = 3;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = l0.a;
                    b10 = e2.g.c(str, trim.split("\\.", -1), xVar.I);
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
                        int i16 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            i10 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1026, i16)};
                        } else {
                            i10 = 4;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(zs.g4, i16), w.b(513, i16), w.b(514, i16), w.b(1026, i16), w.b(1028, i16)};
                        }
                    } else {
                        i10 = 4;
                    }
                    if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str5) && codecProfileLevelArr.length == 0) {
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{w.b(1, intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? i10 : intValue3 >= 800000 ? 2 : 1)};
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
                    h("codec.profileLevel, " + xVar.k + ", " + str3);
                    return false;
                }
                b10 = pair;
            }
        }
        if (b10 != null) {
        }
    }

    public final boolean d(b2.x xVar) {
        return (Objects.equals(xVar.s, "audio/flac") && xVar.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, b2.x xVar) {
        int i10;
        String str = xVar.s;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(w.c(xVar))) || !c(context, xVar, true) || !d(xVar)) {
            return false;
        }
        if (this.i) {
            int i11 = xVar.z;
            if (i11 > 0 && (i10 = xVar.A) > 0) {
                return g(i11, i10, xVar.D);
            }
        } else {
            int i12 = xVar.L;
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
            int i13 = xVar.K;
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
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    e2.a.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i14 + "]");
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

    public final boolean f(b2.x xVar) {
        if (this.i) {
            return this.e;
        }
        Pair b10 = e2.g.b(xVar);
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
            int c10 = (i12 < 29 || ((bool = z6.a) != null && bool.booleanValue())) ? 0 : b2.d.c(videoCapabilities, i10, i11, d);
            if (c10 != 2) {
                if (c10 == 1) {
                    StringBuilder m10 = i0.a.m("sizeAndRate.cover, ", i10, "x", i11, "@");
                    m10.append(d);
                    h(m10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i10, i11, d)) {
            if (i10 < i11) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d)) {
                    StringBuilder m11 = i0.a.m("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    m11.append(d);
                    StringBuilder v = a1.g.v("AssumedSupport [", m11.toString(), "] [", str, ", ");
                    v.append(this.b);
                    v.append("] [");
                    v.append(l0.a);
                    v.append("]");
                    e2.a.b("MediaCodecInfo", v.toString());
                    return true;
                }
            }
            StringBuilder m12 = i0.a.m("sizeAndRate.support, ", i10, "x", i11, "@");
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
        u10.append(l0.a);
        u10.append("]");
        e2.a.b("MediaCodecInfo", u10.toString());
    }

    public final String toString() {
        return this.a;
    }
}
