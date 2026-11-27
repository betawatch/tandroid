// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x22 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ w22(x22 x22Var, String str, int i, byte b) {
        this.a = b;
        this.b = x22Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x22 x22Var = this.b;
                String str = this.c;
                int i = this.d;
                x22Var.getClass();
                hl.c3(new w22(x22Var, str, i, (byte) 1));
                break;
            default:
                x22 x22Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                x22Var2.getClass();
                int i3 = yac.t0;
                Utilities.g.c(new iz0(x22Var2, str2, new ArrayList(lv2.r(i3).Z.values()), new ArrayList(lv2.r(i3).f0), i3, i2));
                break;
        }
    }
}
