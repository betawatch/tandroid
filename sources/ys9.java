// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ys9 implements TextWatcher {
    public final q10 a;
    public final l7 b;
    public String c;
    public boolean d;
    public boolean e;

    public ys9(l7 l7Var, q10 q10Var) {
        this.a = q10Var;
        this.b = l7Var;
    }

    public final void a() {
        this.e = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(this.c);
        boolean isEmpty2 = TextUtils.isEmpty(obj);
        if (isEmpty && !isEmpty2) {
            b(true);
        }
        this.c = obj;
        this.a.l(this.b);
        if (isEmpty || !isEmpty2 || this.e) {
            return;
        }
        b(false);
    }

    public final void b(boolean z) {
        if (this.d != z) {
            q10 q10Var = this.a;
            if (q10Var.c()) {
                if (z) {
                    q10Var.i();
                } else {
                    q10Var.h();
                }
                this.d = z;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
