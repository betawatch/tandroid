// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class tf3 extends gp4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final p1 m0 = new p1(this, 20);
    public final qf3 n0 = new qf3(this);
    public final rf3 o0 = new rf3(this, 0);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final ri6 v0 = new ri6(this, 26);
    public boolean A0 = false;

    @Override // gp4
    public final void B() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = true;
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!this.y0) {
                onDismiss(this.w0);
            }
            this.w0 = null;
            this.A0 = false;
        }
    }

    @Override // gp4
    public final void C() {
        this.V = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        this.f0.h(this.v0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:10:0x0017, B:12:0x0023, B:17:0x002c, B:19:0x0032, B:20:0x003a, B:22:0x0042, B:23:0x0049, B:25:0x0037, B:26:0x0061), top: B:9:0x0017 }] */
    @Override // gp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater D(Bundle bundle) {
        Context n;
        LayoutInflater D = super.D(bundle);
        boolean z = this.s0;
        if (z && !this.u0) {
            if (z && !this.A0) {
                try {
                    this.u0 = true;
                    Dialog P = P();
                    this.w0 = P;
                    if (this.s0) {
                        int i = this.p0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = P.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            }
                            n = n();
                            if (n instanceof Activity) {
                                this.w0.setOwnerActivity((Activity) n);
                            }
                            this.w0.setCancelable(this.r0);
                            this.w0.setOnCancelListener(this.n0);
                            this.w0.setOnDismissListener(this.o0);
                            this.A0 = true;
                        }
                        P.requestWindowFeature(1);
                        n = n();
                        if (n instanceof Activity) {
                        }
                        this.w0.setCancelable(this.r0);
                        this.w0.setOnCancelListener(this.n0);
                        this.w0.setOnDismissListener(this.o0);
                        this.A0 = true;
                    } else {
                        this.w0 = null;
                    }
                } finally {
                    this.u0 = false;
                }
            }
            if (kq4.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.w0;
            if (dialog != null) {
                return D.cloneInContext(dialog.getContext());
            }
        } else if (kq4.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.s0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return D;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return D;
    }

    @Override // gp4
    public final void G(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.p0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // gp4
    public final void H() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // gp4
    public void I() {
        this.V = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // gp4
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    public final void O(boolean z) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 < 0) {
            kd0 kd0Var = new kd0(p());
            kd0Var.o = true;
            kd0Var.h(this);
            kd0Var.e(true, true);
            return;
        }
        kq4 p = p();
        int i = this.t0;
        if (i < 0) {
            lq5.j(uh9.k(i, "Bad id: "));
        } else {
            p.y(new iq4(p, i), true);
            this.t0 = -1;
        }
    }

    public Dialog P() {
        if (kq4.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new rq2(K(), this.q0);
    }

    @Override // gp4
    public final ane h() {
        return new sf3(this, new sf3(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.x0) {
            return;
        }
        if (kq4.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        O(true);
    }

    @Override // gp4
    public final void w() {
        this.V = true;
    }

    @Override // gp4
    public final void y(Context context) {
        Object obj;
        super.y(context);
        qj7 qj7Var = this.f0;
        qj7Var.getClass();
        qj7.a("observeForever");
        ri6 ri6Var = this.v0;
        p96 p96Var = new p96(qj7Var, ri6Var);
        os9 os9Var = qj7Var.b;
        ls9 h = os9Var.h(ri6Var);
        if (h != null) {
            obj = h.b;
        } else {
            ls9 ls9Var = new ls9(ri6Var, p96Var);
            os9Var.d++;
            ls9 ls9Var2 = os9Var.b;
            if (ls9Var2 == null) {
                os9Var.a = ls9Var;
                os9Var.b = ls9Var;
            } else {
                ls9Var2.c = ls9Var;
                ls9Var.d = ls9Var2;
                os9Var.b = ls9Var;
            }
            obj = null;
        }
        r96 r96Var = (r96) obj;
        if (r96Var instanceof q96) {
            lq5.j("Cannot add the same observer with different lifecycles");
            return;
        }
        if (r96Var == null) {
            p96Var.a(true);
        }
        if (this.z0) {
            return;
        }
        this.y0 = false;
    }

    @Override // gp4
    public void z(Bundle bundle) {
        super.z(bundle);
        this.l0 = new Handler();
        this.s0 = this.P == 0;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.q0 = bundle.getInt("android:theme", 0);
            this.r0 = bundle.getBoolean("android:cancelable", true);
            this.s0 = bundle.getBoolean("android:showsDialog", this.s0);
            this.t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
