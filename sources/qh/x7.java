package qh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x7 implements TextWatcher {
    public final /* synthetic */ z7 a;

    public x7(z7 z7Var) {
        this.a = z7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        z7 z7Var = this.a;
        if (z7Var.h || (callback = z7Var.n) == null || editable == null) {
            return;
        }
        callback.run(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
