package rf;

import ag.l3;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import org.telegram.ui.ActionBar.n0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 implements TextWatcher {
    public final l3 a;
    public final EditText b;
    public String c;
    public boolean d;
    public boolean e;

    public a0(n0 n0Var, l3 l3Var) {
        this.a = l3Var;
        this.b = n0Var;
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

    public final void b(boolean z10) {
        if (this.d == z10) {
            return;
        }
        l3 l3Var = this.a;
        if (l3Var.c()) {
            if (z10) {
                l3Var.i();
            } else {
                l3Var.h();
            }
            this.d = z10;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
