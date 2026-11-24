// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zy7 implements TextWatcher {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ jm7 e;

    /* JADX WARN: Multi-variable type inference failed */
    public zy7(x2b x2bVar, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = x2bVar;
        this.c = iArr;
        this.d = textView;
        this.b = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                xz7 xz7Var = (xz7) this.e;
                String str = (String) this.c;
                boolean z = ((HashMap) this.d) == xz7Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                xz7Var.P0(editTextBoldCursor, str, editable, z);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = xz7Var.Z[intValue];
                if (intValue == 6) {
                    xz7Var.R0(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (((int[]) this.c)[0] == 2) {
                    ((x2b) this.e).E0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public zy7(xz7 xz7Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = xz7Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
