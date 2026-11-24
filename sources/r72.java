// default package

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r72 implements TextWatcher {
    public final /* synthetic */ q72 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s30 c;

    public r72(s30 s30Var, q72 q72Var, int i) {
        this.c = s30Var;
        this.a = q72Var;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v72 v72Var = (v72) this.c.e;
        q72 q72Var = this.a;
        if (q72Var.getTag() != null) {
            return;
        }
        int i = this.b;
        int i2 = i == 11 ? v72Var.o0 : v72Var.n0;
        u69 K = v72Var.s.K(i2);
        if (K != null && v72Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            gw3.l(editable, q72Var.getEditField().getPaint().getFontMetricsInt(), false);
            v72Var.y.setDirection(1);
            v72Var.y.setDelegate(q72Var);
            v72Var.y.setTranslationY(K.a.getY());
            v72Var.y.d();
        }
        if (i == 11) {
            v72Var.P = editable;
        } else {
            v72Var.O = editable;
        }
        if (K != null) {
            v72Var.i0(i2, K.a);
        }
        v72Var.S();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
