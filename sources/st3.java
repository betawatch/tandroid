// default package

import android.text.Editable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class st3 implements pcc {
    public final /* synthetic */ xt3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ st3(xt3 xt3Var, int i, int i2) {
        this.a = xt3Var;
        this.b = i;
        this.c = i2;
    }

    @Override // pcc
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xt3 xt3Var = this.a;
        Editable text = xt3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        xt3Var.setSelection(i, charSequence.length() + i);
    }
}
