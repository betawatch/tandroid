package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
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
        b0Var.S(!z10 ? zf.a.h(editable.toString(), b0Var.m0.a) : zf.a.i(0L, b0Var.m0.a), false, false, true);
        b0Var.c0.c(b0Var.d0.isFocused(), true ^ TextUtils.isEmpty(b0Var.d0.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
