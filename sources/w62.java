// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w62 implements TextWatcher {
    public final /* synthetic */ v62 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t20 c;

    public w62(t20 t20Var, v62 v62Var, int i) {
        this.c = t20Var;
        this.a = v62Var;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a72 a72Var = (a72) this.c.e;
        v62 v62Var = this.a;
        if (v62Var.getTag() != null) {
            return;
        }
        int i = this.b;
        int i2 = i == 11 ? a72Var.o0 : a72Var.n0;
        f89 L = a72Var.s.L(i2);
        if (L != null && a72Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            pv3.l(editable, v62Var.getEditField().getPaint().getFontMetricsInt(), false);
            a72Var.y.setDirection(1);
            a72Var.y.setDelegate(v62Var);
            a72Var.y.setTranslationY(L.a.getY());
            a72Var.y.d();
        }
        if (i == 11) {
            a72Var.P = editable;
        } else {
            a72Var.O = editable;
        }
        if (L != null) {
            a72Var.h0(i2, L.a);
        }
        a72Var.S();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
