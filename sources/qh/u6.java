package qh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u6 implements TextWatcher {
    public final /* synthetic */ l6 a;
    public final /* synthetic */ a7 b;

    public u6(a7 a7Var, l6 l6Var) {
        this.b = a7Var;
        this.a = l6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        a7 a7Var = this.b;
        org.telegram.ui.Cells.i3 i3Var = a7Var.V;
        if (a7Var.Z) {
            return;
        }
        if (!a7Var.a0 || editable == null) {
            a7.S(a7Var, editable == null ? null : editable.toString());
            return;
        }
        String substring = editable.toString().substring(8);
        a7Var.Z = true;
        i3Var.b.setText(substring);
        org.telegram.ui.Cells.g3 g3Var = i3Var.b;
        g3Var.setSelection(0, g3Var.getText().length());
        a7Var.Z = false;
        a7Var.a0 = false;
        a7.S(a7Var, substring);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        a7 a7Var = this.b;
        if (a7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        a7Var.a0 = z4;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
