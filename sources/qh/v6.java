package qh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class v6 implements TextWatcher {
    public final /* synthetic */ d6 a;
    public final /* synthetic */ b7 b;

    public v6(b7 b7Var, d6 d6Var) {
        this.b = b7Var;
        this.a = d6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        b7 b7Var = this.b;
        org.telegram.ui.Cells.i3 i3Var = b7Var.V;
        if (b7Var.Z) {
            return;
        }
        if (!b7Var.a0 || editable == null) {
            b7.S(b7Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        b7Var.Z = true;
        i3Var.b.setText(substring);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setSelection(0, g3Var.getText().length());
        b7Var.Z = false;
        b7Var.a0 = false;
        b7.S(b7Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        b7 b7Var = this.b;
        if (b7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        b7Var.a0 = z4;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
