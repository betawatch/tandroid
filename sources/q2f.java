// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q2f {
    public final qa4 a;
    public final AtomicLong b;

    public q2f(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new qa4(context, qa4.o, new jkb("mlkit:vision"), g05.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new qa4(context, qa4.o, new jkb("mlkit:natural_language"), g05.c);
                break;
        }
    }
}
