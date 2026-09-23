package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] c;

    public /* synthetic */ k6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = f3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new w2(editTextBoldCursor, 3));
                break;
            case 1:
                AndroidUtilities.hideKeyboard(this.b);
                this.c[0].dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard(this.b);
                this.c[0].dismiss();
                break;
        }
    }

    public /* synthetic */ k6(org.telegram.ui.ActionBar.f3[] f3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = f3VarArr;
        this.b = editTextBoldCursor;
    }
}
