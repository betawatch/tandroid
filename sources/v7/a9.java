package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a9 {
    public final p6.b a;
    public final AtomicLong b;

    public a9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new p6.b(context, p6.b.k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new p6.b(context, p6.b.k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
