// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t09 implements TextView.OnEditorActionListener {
    public final /* synthetic */ f42 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a19 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ ku0 e;
    public final /* synthetic */ pcc f;
    public final /* synthetic */ id[] g;
    public final /* synthetic */ View h;

    public t09(f42 f42Var, int i, a19 a19Var, TextView textView, ku0 ku0Var, pcc pccVar, id[] idVarArr, View view) {
        this.a = f42Var;
        this.b = i;
        this.c = a19Var;
        this.d = textView;
        this.e = ku0Var;
        this.f = pccVar;
        this.g = idVarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        f42 f42Var = this.a;
        String obj = f42Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            hl.z3(f42Var);
            return true;
        }
        b19 f = b19.f(this.b);
        a19 a19Var = this.c;
        int i2 = a19Var == null ? -1 : a19Var.a;
        a19 d = f.d(obj);
        if (d != null && d.a != i2) {
            hl.z3(f42Var);
            this.d.setText(ob6.M0(2131752643, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        id[] idVarArr = this.g;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
        }
        if (idVarArr[0] == w09.f) {
            w09.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
