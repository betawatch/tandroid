// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r03 implements TextWatcher {
    public final /* synthetic */ bv2 a;
    public final /* synthetic */ p03 b;

    public r03(bv2 bv2Var, p03 p03Var) {
        this.a = bv2Var;
        this.b = p03Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        this.b.run();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
