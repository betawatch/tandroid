// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new l(editTextBoldCursor, (byte) 9));
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
