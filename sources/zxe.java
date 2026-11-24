// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
