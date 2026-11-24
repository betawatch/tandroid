// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t94(ba4 ba4Var, String str, byte b) {
        this.a = b;
        this.b = ba4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 7;
        switch (this.a) {
            case 0:
                ba4 ba4Var = this.b;
                l94 l94Var = (l94) ba4Var.w.remove(this.c);
                if (l94Var != null && ((ArrayList) l94Var.e1.d).remove(l94Var)) {
                    Utilities.d.c(new b94(l94Var, b));
                    break;
                }
                break;
            default:
                ba4 ba4Var2 = this.b;
                l94 l94Var2 = (l94) ba4Var2.w.remove(this.c);
                if (l94Var2 != null && ((ArrayList) l94Var2.e1.d).remove(l94Var2)) {
                    Utilities.d.c(new b94(l94Var2, b));
                    break;
                }
                break;
        }
    }
}
