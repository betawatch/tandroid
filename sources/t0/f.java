package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, e eVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new c(inputConnection, eVar) : b.a(editorInfo).length == 0 ? inputConnection : new d(inputConnection, eVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
