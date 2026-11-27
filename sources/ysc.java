// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ysc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ atc b;

    public /* synthetic */ ysc(atc atcVar, byte b) {
        this.a = b;
        this.b = atcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        atc atcVar = this.b;
        switch (b) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, atcVar.getResourceProvider(), atcVar.getParentActivity());
                alertDialog$Builder.a.U = ob6.M0(2131742775, null);
                c00.u(null, 2131747558, alertDialog$Builder, null);
                break;
            default:
                atcVar.c0();
                break;
        }
    }
}
