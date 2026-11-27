// default package

import android.text.Editable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
