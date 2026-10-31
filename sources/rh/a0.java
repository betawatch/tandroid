package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a0 implements TextWatcher {
    public final /* synthetic */ b0 a;

    public a0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        b0 b0Var = this.a;
        b0Var.f1(!z10 ? sf.a.h(editable.toString(), b0Var.f2.a) : sf.a.i(0L, b0Var.f2.a), false, false, true);
        b0Var.V1.c(b0Var.W1.isFocused(), true ^ TextUtils.isEmpty(b0Var.W1.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
