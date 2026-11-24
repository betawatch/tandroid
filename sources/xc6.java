// default package

import android.location.Location;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xc6 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;

    public /* synthetic */ xc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                dd6Var.m((Location) obj);
                break;
            default:
                Integer num = (Integer) obj;
                dd6Var.getClass();
                int intValue = num.intValue();
                boolean z = true;
                if (intValue == 0) {
                    Utilities.d.c(new y8c((byte) 25, dd6Var, z));
                    break;
                } else if (intValue == 1) {
                    Utilities.d.c(new yc6(dd6Var, num, (byte) 0));
                    break;
                } else if (intValue == 2) {
                    Utilities.d.c(new uc6(dd6Var, (byte) 4));
                    break;
                }
                break;
        }
    }
}
