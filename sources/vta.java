// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vta implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ i8c c;
    public final /* synthetic */ u41 d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ fx0[] f;

    public /* synthetic */ vta(boolean[] zArr, i8c i8cVar, u41 u41Var, EditTextBoldCursor editTextBoldCursor, fx0[] fx0VarArr) {
        this.b = zArr;
        this.c = i8cVar;
        this.d = u41Var;
        this.e = editTextBoldCursor;
        this.f = fx0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fx0[] fx0VarArr = this.f;
        EditTextBoldCursor editTextBoldCursor = this.e;
        u41 u41Var = this.d;
        i8c i8cVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    u41Var.setLoading(true);
                    i8cVar.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new xta(editTextBoldCursor, fx0VarArr, (byte) 2));
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    u41Var.setLoading(true);
                    i8cVar.a(0L, new q3a(zArr, editTextBoldCursor, fx0VarArr, (byte) 22));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vta(boolean[] zArr, i8c i8cVar, EditTextBoldCursor editTextBoldCursor, u41 u41Var, fx0[] fx0VarArr) {
        this.b = zArr;
        this.c = i8cVar;
        this.e = editTextBoldCursor;
        this.d = u41Var;
        this.f = fx0VarArr;
    }
}
