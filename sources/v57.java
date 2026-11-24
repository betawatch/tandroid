// default package

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j67 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ v57(j67 j67Var, EditText editText, byte b) {
        this.a = b;
        this.b = j67Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        j67 j67Var = this.b;
        switch (b) {
            case 0:
                byte b2 = 1;
                if (!j67Var.t0) {
                    try {
                        Window window = j67Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        j67Var.t0 = true;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                gm.d3(new v57(j67Var, editText, b2), 100L);
                break;
            default:
                gm.E3(editText);
                if (j67Var.W != null) {
                    j67Var.b(j67Var.r0);
                    j67Var.X.setScaleX(j67Var.W.getScaleX());
                    j67Var.X.setScaleY(j67Var.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
