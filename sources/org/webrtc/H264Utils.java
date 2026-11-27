package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class H264Utils {
    public static VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(false));
    public static VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(true));
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        boolean isSameH264Profile(Map<String, String> map, Map<String, String> map2);
    }

    public static Map<String, String> getDefaultH264Params(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        hashMap.put("profile-level-id", z ? "640c1f" : "42e01f");
        return hashMap;
    }

    public static boolean isSameH264Profile(Map<String, String> map, Map<String, String> map2) {
        return H264UtilsJni.get().isSameH264Profile(map, map2);
    }
}
