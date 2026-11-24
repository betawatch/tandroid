// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj b;
    public final /* synthetic */ hd c;
    public final /* synthetic */ d d;

    public /* synthetic */ qe(hj hjVar, hd hdVar, d dVar, byte b) {
        this.a = b;
        this.b = hjVar;
        this.c = hdVar;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        hd hdVar = this.c;
        hj hjVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new qe(hjVar, hdVar, dVar, (byte) 1));
                break;
            default:
                ij.b0(hjVar, hdVar, dVar);
                break;
        }
    }
}
