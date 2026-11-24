// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t74 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r74 c;
    public final /* synthetic */ TextView[] d;
    public final /* synthetic */ TLRPC.TL_factCheck e;

    public t74(int i, r74 r74Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = r74Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        int length = editable.length();
        boolean z = true;
        int i = this.b;
        if (length > i) {
            this.a = true;
            editable.delete(i, editable.length());
            r74 r74Var = this.c;
            gl.z3(r74Var);
            try {
                r74Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.a = false;
        }
        TextView[] textViewArr = this.d;
        if (textViewArr[0] != null) {
            if (editable.length() <= 0 && this.e != null) {
                z = false;
            }
            textViewArr[0].setText(k96.M0(z ? 2131751342 : 2131746128, null));
            textViewArr[0].setTextColor(bkb.w0(null, z ? bkb.G5 : bkb.p7, false));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
