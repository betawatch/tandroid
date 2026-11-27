// default package

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v84 extends ThreadLocal {
    public final /* synthetic */ byte a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                fj5 fj5Var = new fj5();
                fj5Var.a = new byte[TLObject.FLAG_12];
                return fj5Var;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
