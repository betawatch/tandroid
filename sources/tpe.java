// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
