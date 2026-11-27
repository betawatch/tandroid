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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class rq2 extends Dialog implements i36, vt9 {
    public k36 a;
    public final rx b;
    public final vr7 c;

    public rq2(Context context, int i) {
        super(context, i);
        this.b = new rx(this);
        this.c = new vr7(new vd2(this, (byte) 11));
    }

    public static final void b(rq2 rq2Var) {
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

    @Override // vt9
    public final po g() {
        return (po) this.b.d;
    }

    @Override // i36
    public final k36 m() {
        k36 k36Var = this.a;
        if (k36Var != null) {
            return k36Var;
        }
        k36 k36Var2 = new k36(this);
        this.a = k36Var2;
        return k36Var2;
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
            vr7 vr7Var = this.c;
            vr7Var.getClass();
            vr7Var.e = onBackInvokedDispatcher;
            vr7Var.b(vr7Var.g);
        }
        this.b.g(bundle);
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.h(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_DESTROY);
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
