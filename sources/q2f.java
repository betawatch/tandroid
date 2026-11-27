// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
