// default package

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
