// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qtb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vtb b;

    public /* synthetic */ qtb(vtb vtbVar, byte b) {
        this.a = b;
        this.b = vtbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vtb vtbVar = this.b;
        switch (b) {
            case 0:
                new jh8((d) vtbVar, 11, false).show();
                break;
            default:
                vtbVar.e.requestFocus();
                gl.E3(vtbVar.e);
                break;
        }
    }
}
