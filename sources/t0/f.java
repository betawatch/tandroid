package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, e eVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new c(inputConnection, eVar) : b.a(editorInfo).length == 0 ? inputConnection : new d(inputConnection, eVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
