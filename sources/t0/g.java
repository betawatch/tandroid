package t0;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, f fVar) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new d(inputConnection, fVar) : b.a(editorInfo).length == 0 ? inputConnection : new e(inputConnection, fVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
