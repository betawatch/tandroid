// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ fx0[] c;

    public /* synthetic */ xta(fx0[] fx0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = fx0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fx0[] fx0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].v0(true);
                editTextBoldCursor.requestFocus();
                gl.c3(new l(editTextBoldCursor, (byte) 9));
                break;
            case 1:
                gl.t1(editTextBoldCursor);
                fx0VarArr[0].dismiss();
                break;
            default:
                gl.t1(editTextBoldCursor);
                fx0VarArr[0].dismiss();
                break;
        }
    }

    public /* synthetic */ xta(EditTextBoldCursor editTextBoldCursor, fx0[] fx0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = fx0VarArr;
    }
}
