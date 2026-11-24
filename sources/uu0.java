// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uu0 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gt7 d;

    public uu0(EditTextBoldCursor editTextBoldCursor, int i, gt7 gt7Var) {
        this.b = editTextBoldCursor;
        this.c = i;
        this.d = gt7Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.a) {
            int length = text.length();
            int i = this.c;
            if (length > i) {
                this.a = true;
                text = text.subSequence(0, i);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
