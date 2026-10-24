package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class f {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, e eVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new c(inputConnection, eVar) : b.a(editorInfo).length == 0 ? inputConnection : new d(inputConnection, eVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
