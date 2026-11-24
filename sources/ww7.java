// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ww7 implements TextWatcher {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ gk7 e;

    /* JADX WARN: Multi-variable type inference failed */
    public ww7(u0b u0bVar, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = u0bVar;
        this.c = iArr;
        this.d = textView;
        this.b = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                vx7 vx7Var = (vx7) this.e;
                String str = (String) this.c;
                boolean z = ((HashMap) this.d) == vx7Var.u1;
                EditTextBoldCursor editTextBoldCursor = this.b;
                vx7Var.O0(editTextBoldCursor, str, editable, z);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = vx7Var.Z[intValue];
                if (intValue == 6) {
                    vx7Var.Q0(true);
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
                    ((u0b) this.e).E0((TextView) this.d, this.b.getText().toString(), false);
                    break;
                }
                break;
        }
    }

    public ww7(vx7 vx7Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = vx7Var;
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
