package ph;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x6 implements TextWatcher {
    public final /* synthetic */ f6 a;
    public final /* synthetic */ d7 b;

    public x6(d7 d7Var, f6 f6Var) {
        this.b = d7Var;
        this.a = f6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        d7 d7Var = this.b;
        org.telegram.ui.Cells.i3 i3Var = d7Var.V;
        if (d7Var.Z) {
            return;
        }
        if (!d7Var.a0 || editable == null) {
            d7.S(d7Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        d7Var.Z = true;
        i3Var.b.setText(substring);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setSelection(0, g3Var.getText().length());
        d7Var.Z = false;
        d7Var.a0 = false;
        d7.S(d7Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        d7 d7Var = this.b;
        if (d7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        d7Var.a0 = z4;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
