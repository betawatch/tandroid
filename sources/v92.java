// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w92 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v92(w92 w92Var, String str, byte b) {
        this.a = b;
        this.b = w92Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w92 w92Var = this.b;
                String str = this.c;
                w92Var.getClass();
                gl.c3(new v92(w92Var, str, (byte) 1));
                break;
            default:
                w92 w92Var2 = this.b;
                String str2 = this.c;
                w92Var2.f = null;
                Utilities.g.c(new jn1(w92Var2, str2, new ArrayList(w92Var2.h.w), (byte) 14));
                break;
        }
    }
}
