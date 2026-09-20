package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class a6 {
    public static boolean a() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        return globalMainSettings.contains("round_video_composition") ? globalMainSettings.getBoolean("round_video_composition", true) : globalMainSettings.getBoolean("round_video_outside_effect", true) && globalMainSettings.getBoolean("round_video_watermark", true);
    }

    public static void b(String str, Enum r22) {
        MessagesController.getGlobalMainSettings().edit().putString(str, r22.name()).apply();
    }

    public static Enum c(String str, Enum r32, Class cls) {
        try {
            return Enum.valueOf(cls, MessagesController.getGlobalMainSettings().getString(str, r32.name()));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return r32;
        }
    }
}
