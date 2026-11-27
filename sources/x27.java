// default package

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class x27 extends s76 implements i27 {
    public static final Method U;
    public zm9 T;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // i27
    public final void C(f27 f27Var, j27 j27Var) {
        zm9 zm9Var = this.T;
        if (zm9Var != null) {
            zm9Var.C(f27Var, j27Var);
        }
    }

    @Override // i27
    public final void k0(f27 f27Var, j27 j27Var) {
        zm9 zm9Var = this.T;
        if (zm9Var != null) {
            zm9Var.k0(f27Var, j27Var);
        }
    }

    @Override // s76
    public final vr3 o(Context context, boolean z) {
        w27 w27Var = new w27(context, z);
        w27Var.setHoverListener(this);
        return w27Var;
    }
}
