// default package

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
