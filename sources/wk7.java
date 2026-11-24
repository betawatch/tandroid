// default package

import android.media.AudioAttributes;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class wk7 {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
