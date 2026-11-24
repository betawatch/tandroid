// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p55 implements TextWatcher {
    public final /* synthetic */ h75 a;

    public p55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        h75 h75Var = this.a;
        hn hnVar = h75Var.F1;
        h75Var.p5.a(TextUtils.isEmpty(editable), true);
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        int i = h75Var.W1;
        String valueOf = codePointCount + 25 > i ? String.valueOf(i - codePointCount) : null;
        hnVar.a();
        hnVar.setText(valueOf);
        hnVar.setTextColor(codePointCount >= i ? -1280137 : -1);
        if (codePointCount > i) {
            pw0.E.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
