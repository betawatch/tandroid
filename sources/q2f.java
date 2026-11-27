// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
