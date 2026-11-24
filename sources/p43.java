// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class p43 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s43 b;

    public /* synthetic */ p43(s43 s43Var, byte b) {
        this.a = b;
        this.b = s43Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        byte b = this.a;
        s43 s43Var = this.b;
        switch (b) {
            case 0:
                if (s43Var.b == null && (view = s43Var.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        s43Var.b = (EditText) findFocus;
                    }
                }
                EditText editText = s43Var.b;
                if (editText != null) {
                    if (editText.length() != 0 || s43Var.e) {
                        try {
                            s43Var.performHapticFeedback(3, 2);
                            s43Var.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        s43Var.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        s43Var.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (s43Var.f) {
                            s43Var.postDelayed(s43Var.h, 50L);
                            break;
                        }
                    }
                }
                break;
            default:
                s43Var.n = false;
                s43Var.f = true;
                s43Var.h.run();
                break;
        }
    }
}
