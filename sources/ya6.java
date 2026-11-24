// default package

import android.location.Location;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ya6 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;

    public /* synthetic */ ya6(eb6 eb6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                eb6Var.m((Location) obj);
                break;
            default:
                Integer num = (Integer) obj;
                eb6Var.getClass();
                int intValue = num.intValue();
                boolean z = true;
                if (intValue == 0) {
                    Utilities.d.c(new x6c((byte) 25, eb6Var, z));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new za6(eb6Var, num, (byte) 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new va6(eb6Var, (byte) 4));
                    break;
                }
                break;
        }
    }
}
