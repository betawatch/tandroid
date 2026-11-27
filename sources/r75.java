// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r75 implements TextWatcher {
    public final /* synthetic */ j95 a;

    public r75(j95 j95Var) {
        this.a = j95Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        j95 j95Var = this.a;
        in inVar = j95Var.F1;
        j95Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i = j95Var.W1;
        String valueOf = codePointCount + 25 > i ? String.valueOf(i - codePointCount) : null;
        inVar.a();
        inVar.setText(valueOf);
        inVar.setTextColor(codePointCount >= i ? -1280137 : -1);
        if (codePointCount > i) {
            yw0.E.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
