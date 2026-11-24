// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sm7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rm7(sm7 sm7Var, String str, byte b) {
        this.a = b;
        this.b = sm7Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sm7 sm7Var = this.b;
                String str = this.c;
                sm7Var.getClass();
                gl.c3(new rm7(sm7Var, str, r1));
                break;
            default:
                sm7 sm7Var2 = this.b;
                String str2 = this.c;
                zr9 zr9Var = sm7Var2.h;
                int i = sm7Var2.n.s;
                zr9Var.g(str2, true, (i == 1 || i == 3) ? (byte) 0 : (byte) 1, true, false, 0L, false, 0, 0);
                Utilities.g.c(new pc7(sm7Var2, str2, new ArrayList(sm7Var2.n.x)));
                break;
        }
    }
}
