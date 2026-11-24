// default package

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q07 extends o56 implements b07 {
    public static final Method U;
    public lj9 T;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // b07
    public final void i(yz6 yz6Var, c07 c07Var) {
        lj9 lj9Var = this.T;
        if (lj9Var != null) {
            lj9Var.i(yz6Var, c07Var);
        }
    }

    @Override // o56
    public final er3 p(Context context, boolean z) {
        p07 p07Var = new p07(context, z);
        p07Var.setHoverListener(this);
        return p07Var;
    }

    @Override // b07
    public final void q(yz6 yz6Var, c07 c07Var) {
        lj9 lj9Var = this.T;
        if (lj9Var != null) {
            lj9Var.q(yz6Var, c07Var);
        }
    }
}
