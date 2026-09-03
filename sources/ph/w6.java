package ph;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w6 implements TextWatcher {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ c7 b;

    public w6(c7 c7Var, e6 e6Var) {
        this.b = c7Var;
        this.a = e6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        c7 c7Var = this.b;
        org.telegram.ui.Cells.h3 h3Var = c7Var.V;
        if (c7Var.Z) {
            return;
        }
        if (!c7Var.a0 || editable == null) {
            c7.S(c7Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        c7Var.Z = true;
        h3Var.b.setText(substring);
        org.telegram.ui.Cells.f3 f3Var = h3Var.b;
        f3Var.setSelection(0, f3Var.getText().length());
        c7Var.Z = false;
        c7Var.a0 = false;
        c7.S(c7Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        c7 c7Var = this.b;
        if (c7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        c7Var.a0 = z4;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
