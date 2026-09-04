package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class g {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, f fVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new d(inputConnection, fVar) : c.a(editorInfo).length == 0 ? inputConnection : new e(inputConnection, fVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
