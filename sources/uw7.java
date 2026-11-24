// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uw7 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ vx7 d;

    public uw7(vx7 vx7Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = vx7Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        boolean z = true;
        this.a = true;
        int i = 0;
        while (true) {
            if (i >= editable.length()) {
                z = false;
                break;
            }
            char charAt = editable.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                break;
            } else {
                i++;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z) {
            editTextBoldCursor.setErrorText(k96.M0(2131747256, null));
        } else {
            this.d.O0(editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
