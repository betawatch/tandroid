// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rxb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wxb b;

    public /* synthetic */ rxb(wxb wxbVar, byte b) {
        this.a = b;
        this.b = wxbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wxb wxbVar = this.b;
        switch (b) {
            case 0:
                new xk8((e) wxbVar, 11, false).show();
                break;
            default:
                wxbVar.e.requestFocus();
                hl.E3(wxbVar.e);
                break;
        }
    }
}
