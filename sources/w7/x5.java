package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.k40;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class x5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (k40 k40Var : k40.values()) {
            edit.remove(k40Var.a);
        }
        edit.apply();
    }
}
