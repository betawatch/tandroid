package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.j40;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class w5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (j40 j40Var : j40.values()) {
            edit.remove(j40Var.a);
        }
        edit.apply();
    }
}
