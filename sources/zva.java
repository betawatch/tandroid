// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zva implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ jac c;
    public final /* synthetic */ b61 d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ my0[] f;

    public /* synthetic */ zva(boolean[] zArr, jac jacVar, b61 b61Var, EditTextBoldCursor editTextBoldCursor, my0[] my0VarArr) {
        this.b = zArr;
        this.c = jacVar;
        this.d = b61Var;
        this.e = editTextBoldCursor;
        this.f = my0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        my0[] my0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        b61 b61Var = this.d;
        jac jacVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    b61Var.setLoading(true);
                    jacVar.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new bwa(editTextBoldCursor, my0VarArr, (byte) 2));
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    b61Var.setLoading(true);
                    jacVar.a(0L, new hw9(zArr, editTextBoldCursor, my0VarArr, (byte) 25));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zva(boolean[] zArr, jac jacVar, EditTextBoldCursor editTextBoldCursor, b61 b61Var, my0[] my0VarArr) {
        this.b = zArr;
        this.c = jacVar;
        this.e = editTextBoldCursor;
        this.d = b61Var;
        this.f = my0VarArr;
    }
}
