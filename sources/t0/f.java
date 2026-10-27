package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, e eVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new c(inputConnection, eVar) : b.a(editorInfo).length == 0 ? inputConnection : new d(inputConnection, eVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
