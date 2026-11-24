// default package

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v37 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j47 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ v37(j47 j47Var, EditText editText, byte b) {
        this.a = b;
        this.b = j47Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                byte b2 = 1;
                if (!j47Var.t0) {
                    try {
                        Window window = j47Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        j47Var.t0 = true;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                gl.d3(new v37(j47Var, editText, b2), 100L);
                break;
            default:
                gl.E3(editText);
                if (j47Var.W != null) {
                    j47Var.b(j47Var.r0);
                    j47Var.X.setScaleX(j47Var.W.getScaleX());
                    j47Var.X.setScaleY(j47Var.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
