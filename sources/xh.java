// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xh implements TextWatcher {
    public final /* synthetic */ short a;
    public final /* synthetic */ NumberTextView b;

    /* JADX WARN: Multi-variable type inference failed */
    public xh(int i, NumberTextView numberTextView) {
        this.a = i;
        this.b = numberTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int codePointCount = this.a - Character.codePointCount(editable, 0, editable.length());
        NumberTextView numberTextView = this.b;
        if (codePointCount >= 30) {
            hl.R3(numberTextView, false);
        } else {
            numberTextView.a(codePointCount, numberTextView.getVisibility() == 0);
            hl.R3(numberTextView, true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
