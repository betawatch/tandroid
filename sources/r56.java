// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class r56 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v56 b;

    public /* synthetic */ r56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 0:
                if (!v56Var.O) {
                    if (editable.toString().equals("0")) {
                        v56Var.G.setText("");
                        break;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(editable.toString());
                            if (parseInt <= 100000) {
                                v56Var.a0(parseInt);
                                break;
                            } else {
                                v56Var.b0();
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            v56Var.b0();
                            return;
                        }
                    }
                }
                break;
            default:
                pv3.l(editable, v56Var.L.getPaint().getFontMetricsInt(), false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
