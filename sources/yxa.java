// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yxa implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ icc c;
    public final /* synthetic */ c51 d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ nx0[] f;

    public /* synthetic */ yxa(boolean[] zArr, icc iccVar, c51 c51Var, EditTextBoldCursor editTextBoldCursor, nx0[] nx0VarArr) {
        this.b = zArr;
        this.c = iccVar;
        this.d = c51Var;
        this.e = editTextBoldCursor;
        this.f = nx0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        nx0[] nx0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        c51 c51Var = this.d;
        icc iccVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    c51Var.setLoading(true);
                    iccVar.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new aya(editTextBoldCursor, nx0VarArr, (byte) 2));
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    c51Var.setLoading(true);
                    iccVar.a(0L, new pwa(zArr, editTextBoldCursor, nx0VarArr, (byte) 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yxa(boolean[] zArr, icc iccVar, EditTextBoldCursor editTextBoldCursor, c51 c51Var, nx0[] nx0VarArr) {
        this.b = zArr;
        this.c = iccVar;
        this.e = editTextBoldCursor;
        this.d = c51Var;
        this.f = nx0VarArr;
    }
}
