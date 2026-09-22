package yf;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import ci.h2;
import org.telegram.ui.ActionBar.g5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g0 implements TextWatcher {
    public final g5 a;
    public final EditText b;
    public String c;
    public boolean d;
    public boolean e;

    public g0(h2 h2Var, g5 g5Var) {
        this.a = g5Var;
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
        g5 g5Var = this.a;
        if (g5Var.c()) {
            if (z10) {
                g5Var.n();
            } else {
                g5Var.m();
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
