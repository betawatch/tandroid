// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w4b implements TextWatcher {
    public final /* synthetic */ NumberTextView a;
    public final /* synthetic */ v4b b;

    public w4b(NumberTextView numberTextView, v4b v4bVar) {
        this.a = numberTextView;
        this.b = v4bVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.b.setErrorText(null);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
