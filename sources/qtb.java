// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.F3(vtbVar.e);
                break;
        }
    }
}
