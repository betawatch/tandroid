package rh;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] c;

    public /* synthetic */ w6(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
        this.c = z2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c[0].A0(true);
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.g3(new ph.x1(editTextBoldCursor, 24));
                break;
            case 1:
                org.telegram.messenger.i0.v1(this.b);
                this.c[0].dismiss();
                break;
            default:
                org.telegram.messenger.i0.v1(this.b);
                this.c[0].dismiss();
                break;
        }
    }

    public /* synthetic */ w6(org.telegram.ui.ActionBar.z2[] z2VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = 0;
        this.c = z2VarArr;
        this.b = editTextBoldCursor;
    }
}
