// default package

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class yp2 extends Dialog implements e16, dq9 {
    public g16 a;
    public final qx b;
    public final vo7 c;

    public yp2(Context context, int i) {
        super(context, i);
        this.b = new qx(this);
        this.c = new vo7(new mk2(this, (byte) 5));
    }

    public static final void b(yp2 yp2Var) {
        super.onBackPressed();
    }

    public final void a() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        a();
        super.addContentView(view, layoutParams);
    }

    @Override // dq9
    public final oo g() {
        return (oo) this.b.d;
    }

    @Override // e16
    public final g16 m() {
        g16 g16Var = this.a;
        if (g16Var != null) {
            return g16Var;
        }
        g16 g16Var2 = new g16(this);
        this.a = g16Var2;
        return g16Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            vo7 vo7Var = this.c;
            vo7Var.getClass();
            vo7Var.e = onBackInvokedDispatcher;
            vo7Var.b(vo7Var.g);
        }
        this.b.f(bundle);
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        a();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        a();
        super.setContentView(view, layoutParams);
    }
}
