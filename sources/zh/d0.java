package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d0 implements TextWatcher {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        e0 e0Var = this.a;
        e0Var.q(!z10 ? zf.a.h(editable.toString(), e0Var.H.a) : zf.a.i(0L, e0Var.H.a), false, false, true);
        e0Var.f.c(e0Var.h.isFocused(), true ^ TextUtils.isEmpty(e0Var.h.getText()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
