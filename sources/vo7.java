// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vo7(wo7 wo7Var, String str, byte b) {
        this.a = b;
        this.b = wo7Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo7 wo7Var = this.b;
                String str = this.c;
                wo7Var.getClass();
                gm.c3(new vo7(wo7Var, str, r1));
                break;
            default:
                wo7 wo7Var2 = this.b;
                String str2 = this.c;
                bu9 bu9Var = wo7Var2.h;
                int i = wo7Var2.n.s;
                bu9Var.g(str2, true, (i == 1 || i == 3) ? (byte) 0 : (byte) 1, true, false, 0L, false, 0, 0);
                Utilities.g.c(new ud7((Object) wo7Var2, (Object) str2, (Object) new ArrayList(wo7Var2.n.x), (byte) 7));
                break;
        }
    }
}
