package y3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d5.f0;
import h3.t0;
import j3.r0;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z10;
        this.e = z11;
        this.f = z12;
        this.h = d5.q.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(f0.f(i9, widthAlignment) * widthAlignment, f0.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        boolean z12;
        int i9;
        if (codecCapabilities != null && (i9 = f0.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i9 <= 22) {
                String str4 = f0.d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z12 = true;
            if (codecCapabilities != null && f0.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new n(str, str2, str3, codecCapabilities, z10, z12, !z11 || (codecCapabilities != null && f0.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z12 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new n(str, str2, str3, codecCapabilities, z10, z12, !z11 || (codecCapabilities != null && f0.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final k3.l b(t0 t0Var, t0 t0Var2) {
        t0 t0Var3;
        t0 t0Var4;
        int i9 = !f0.a(t0Var.B, t0Var2.B) ? 8 : 0;
        if (this.h) {
            if (t0Var.J != t0Var2.J) {
                i9 |= 1024;
            }
            if (!this.e && (t0Var.G != t0Var2.G || t0Var.H != t0Var2.H)) {
                i9 |= 512;
            }
            if (!f0.a(t0Var.N, t0Var2.N)) {
                i9 |= 2048;
            }
            if (f0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !t0Var.b(t0Var2)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new k3.l(this.a, t0Var, t0Var2, t0Var.b(t0Var2) ? 3 : 2, 0);
            }
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
        } else {
            t0Var3 = t0Var;
            t0Var4 = t0Var2;
            if (t0Var3.O != t0Var4.O) {
                i9 |= 4096;
            }
            if (t0Var3.P != t0Var4.P) {
                i9 |= 8192;
            }
            if (t0Var3.Q != t0Var4.Q) {
                i9 |= 16384;
            }
            String str = this.b;
            if (i9 == 0 && MediaController.AUDIO_MIME_TYPE.equals(str)) {
                Pair d = w.d(t0Var3);
                Pair d9 = w.d(t0Var4);
                if (d != null && d9 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d9.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new k3.l(this.a, t0Var3, t0Var4, 3, 0);
                    }
                }
            }
            if (!t0Var3.b(t0Var4)) {
                i9 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new k3.l(this.a, t0Var3, t0Var4, 1, 0);
            }
        }
        return new k3.l(this.a, t0Var3, t0Var4, 0, i9);
    }

    public final boolean c(t0 t0Var, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = w.d(t0Var);
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(t0Var.B);
            int i9 = 8;
            String str = this.b;
            if (equals) {
                if (MediaController.VIDEO_MIME_TYPE.equals(str)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (f0.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i9 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i9 = 512;
                    } else if (intValue3 >= 60000000) {
                        i9 = 256;
                    } else if (intValue3 >= 30000000) {
                        i9 = 128;
                    } else if (intValue3 >= 18000000) {
                        i9 = 64;
                    } else if (intValue3 >= 12000000) {
                        i9 = 32;
                    } else if (intValue3 >= 7200000) {
                        i9 = 16;
                    } else if (intValue3 < 3600000) {
                        i9 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i9;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == intValue) {
                            String str2 = f0.b;
                            if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + t0Var.r + ", " + this.c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(t0 t0Var) {
        String str = t0Var.B;
        String str2 = this.b;
        boolean z10 = str2.equals(str) || str2.equals(w.b(t0Var));
        int i9 = t0Var.H;
        int i10 = t0Var.G;
        if (!z10 || !c(t0Var, true)) {
            return false;
        }
        if (!this.h) {
            int i11 = f0.a;
            if (i11 >= 21) {
                int i12 = t0Var.P;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i12 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i12)) {
                        g("sampleRate.support, " + i12);
                        return false;
                    }
                }
                int i13 = t0Var.O;
                if (i13 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i11 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !MediaController.AUDIO_MIME_TYPE.equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        d5.a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i14 + "]");
                        maxInputChannelCount = i14;
                    }
                    if (maxInputChannelCount < i13) {
                        g("channelCount.support, " + i13);
                        return false;
                    }
                }
            }
        } else if (i10 > 0 && i9 > 0) {
            if (f0.a >= 21) {
                return f(i10, i9, t0Var.I);
            }
            boolean z11 = i10 * i9 <= w.j();
            if (!z11) {
                g("legacyFrameSize, " + i10 + "x" + i9);
            }
            return z11;
        }
        return true;
    }

    public final boolean e(t0 t0Var) {
        if (this.h) {
            return this.e;
        }
        Pair d = w.d(t0Var);
        return d != null && ((Integer) d.first).intValue() == 42;
    }

    public final boolean f(int i9, int i10, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (f0.a >= 29) {
            int a2 = m.a(videoCapabilities, i9, i10, d);
            if (a2 == 2) {
                return true;
            }
            if (a2 == 1) {
                StringBuilder o6 = e2.c.o("sizeAndRate.cover, ", i9, "x", i10, "@");
                o6.append(d);
                g(o6.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i9, i10, d)) {
            if (i9 < i10) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(f0.b)) && a(videoCapabilities, i10, i9, d)) {
                    StringBuilder o9 = e2.c.o("sizeAndRate.rotated, ", i9, "x", i10, "@");
                    o9.append(d);
                    StringBuilder q10 = r0.q("AssumedSupport [", o9.toString(), "] [", str, ", ");
                    q10.append(this.b);
                    q10.append("] [");
                    q10.append(f0.e);
                    q10.append("]");
                    d5.a.n("MediaCodecInfo", q10.toString());
                }
            }
            StringBuilder o10 = e2.c.o("sizeAndRate.support, ", i9, "x", i10, "@");
            o10.append(d);
            g(o10.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder t10 = aa.d.t("NoSupport [", str, "] [");
        t10.append(this.a);
        t10.append(", ");
        t10.append(this.b);
        t10.append("] [");
        t10.append(f0.e);
        t10.append("]");
        d5.a.n("MediaCodecInfo", t10.toString());
    }

    public final String toString() {
        return this.a;
    }
}
