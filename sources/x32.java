// default package

import android.location.Location;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x32 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;

    public /* synthetic */ x32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                c42Var.T((ty4) obj);
                break;
            default:
                c42Var.a0((Location) obj);
                break;
        }
    }
}
