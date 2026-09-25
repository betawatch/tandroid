package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.e5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g0 implements TextWatcher {
    public final e5 a;
    public final EditText b;
    public String c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, e5 e5Var) {
        this.a = e5Var;
        this.b = h2Var;
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
        this.a.q(this.b);
        if (isEmpty || !isEmpty2 || this.e) {
            return;
        }
        b(false);
    }

    public final void b(boolean z10) {
        if (this.d == z10) {
            return;
        }
        e5 e5Var = this.a;
        if (e5Var.c()) {
            if (z10) {
                e5Var.n();
            } else {
                e5Var.m();
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
