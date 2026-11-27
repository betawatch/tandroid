// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rp7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rp7(sp7 sp7Var, String str, byte b) {
        this.a = b;
        this.b = sp7Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sp7 sp7Var = this.b;
                String str = this.c;
                sp7Var.getClass();
                hl.c3(new rp7(sp7Var, str, r1));
                break;
            default:
                sp7 sp7Var2 = this.b;
                String str2 = this.c;
                sv9 sv9Var = sp7Var2.h;
                int i = sp7Var2.n.s;
                sv9Var.g(str2, true, (i == 1 || i == 3) ? (byte) 0 : (byte) 1, true, false, 0L, false, 0, 0);
                Utilities.g.c(new fd7((Object) sp7Var2, (Object) str2, new ArrayList(sp7Var2.n.x), (byte) 12));
                break;
        }
    }
}
