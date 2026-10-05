package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class i0 implements TextWatcher {
    public final /* synthetic */ j0 a;

    public i0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        j0 j0Var = this.a;
        j0Var.n(!z10 ? zf.a.h(editable.toString(), j0Var.E.a) : zf.a.i(0L, j0Var.E.a), false, false, true);
        j0Var.b.c(j0Var.c.isFocused(), true ^ TextUtils.isEmpty(j0Var.c.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
