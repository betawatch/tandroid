package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class g {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, f fVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new d(inputConnection, fVar) : c.a(editorInfo).length == 0 ? inputConnection : new e(inputConnection, fVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
