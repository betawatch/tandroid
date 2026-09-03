package sh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ i0 a;

    public u(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        i0 i0Var = this.a;
        boolean isEmpty = TextUtils.isEmpty(i0Var.O);
        i0Var.O = obj;
        i0Var.C.h(0L, i0Var.e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
