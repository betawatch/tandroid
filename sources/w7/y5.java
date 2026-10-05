package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.n40;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class y5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (n40 n40Var : n40.values()) {
            edit.remove(n40Var.a);
        }
        edit.apply();
    }
}
