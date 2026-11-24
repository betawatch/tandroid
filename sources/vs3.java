// default package

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vs3 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ vs3(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                ws3 ws3Var = (ws3) callback;
                ws3Var.n = z;
                if (ws3Var.h) {
                    ws3Var.c();
                    break;
                }
                break;
            case 1:
                it3 it3Var = (it3) callback;
                it3Var.s = z;
                if (it3Var.n) {
                    it3Var.c();
                }
                it3Var.a(z);
                break;
            case 2:
                SearchView searchView = (SearchView) callback;
                View.OnFocusChangeListener onFocusChangeListener = searchView.e0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                    break;
                }
                break;
            default:
                if (z) {
                    yx9 yx9Var = (yx9) callback;
                    yx9Var.d2 = true;
                    t26 t26Var = (t26) yx9Var.n1.getLayoutManager();
                    v26 v26Var = new v26(yx9Var.getContext(), 2);
                    v26Var.a = 1;
                    v26Var.p = (a.getCurrentActionBarHeight() + gl.m) - gl.L(1.0f);
                    t26Var.v0(v26Var);
                    break;
                }
                break;
        }
    }
}
