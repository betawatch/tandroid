// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
