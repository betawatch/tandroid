package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] c;

    public /* synthetic */ m6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = g3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].setFocusable(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new y2(editTextBoldCursor, 3));
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

    public /* synthetic */ m6(org.telegram.ui.ActionBar.g3[] g3VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = g3VarArr;
        this.b = editTextBoldCursor;
    }
}
