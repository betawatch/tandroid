// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zxe {
    public final u84 a;
    public final AtomicLong b;

    public zxe(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new u84(context, u84.o, new ngb("mlkit:vision"), ay4.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new u84(context, u84.o, new ngb("mlkit:natural_language"), ay4.c);
                break;
        }
    }
}
