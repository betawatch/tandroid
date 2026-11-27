// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
