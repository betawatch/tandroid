// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class us3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ws3 d;

    public us3(ws3 ws3Var, int i, gt3 gt3Var, boolean z) {
        this.d = ws3Var;
        this.a = i;
        this.b = gt3Var;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ws3 ws3Var = this.d;
        boolean z = ws3Var.a;
        int i = this.a;
        if (!z) {
            if (i > 0 && editable != null && editable.length() > i) {
                ws3Var.a = true;
                CharSequence subSequence = editable.subSequence(0, i);
                gt3 gt3Var = this.b;
                gt3Var.setText(subSequence);
                gt3Var.setSelection(gt3Var.length());
                ws3Var.a = false;
            }
            ws3Var.b(editable);
        }
        if (this.c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                } else {
                    editable.delete(indexOf, indexOf + 1);
                }
            }
        }
        gn gnVar = ws3Var.y;
        if (gnVar == null || i <= 0) {
            return;
        }
        gnVar.a();
        ws3Var.c();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
