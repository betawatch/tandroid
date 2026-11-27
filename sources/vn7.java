// default package

import android.media.AudioAttributes;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class vn7 {
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
