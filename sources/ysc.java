// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
