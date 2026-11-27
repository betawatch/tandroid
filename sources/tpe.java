// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class tpe {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, gq5 gq5Var) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new eq5(inputConnection, gq5Var) : tu3.a(editorInfo).length == 0 ? inputConnection : new fq5(inputConnection, gq5Var);
        }
        p3d.h("editorInfo must be non-null");
        return null;
    }
}
