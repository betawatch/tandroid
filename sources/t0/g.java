package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, f fVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new d(inputConnection, fVar) : b.a(editorInfo).length == 0 ? inputConnection : new e(inputConnection, fVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
