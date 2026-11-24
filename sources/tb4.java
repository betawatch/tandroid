// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ tb4(bc4 bc4Var, String str, byte b) {
        this.a = b;
        this.b = bc4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 7;
        switch (this.a) {
            case 0:
                bc4 bc4Var = this.b;
                lb4 lb4Var = (lb4) bc4Var.w.remove(this.c);
                if (lb4Var != null && ((ArrayList) lb4Var.e1.d).remove(lb4Var)) {
                    Utilities.d.c(new bb4(lb4Var, b));
                    break;
                }
                break;
            default:
                bc4 bc4Var2 = this.b;
                lb4 lb4Var2 = (lb4) bc4Var2.w.remove(this.c);
                if (lb4Var2 != null && ((ArrayList) lb4Var2.e1.d).remove(lb4Var2)) {
                    Utilities.d.c(new bb4(lb4Var2, b));
                    break;
                }
                break;
        }
    }
}
