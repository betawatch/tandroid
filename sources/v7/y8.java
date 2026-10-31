package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y8 {
    public final p6.b a;
    public final AtomicLong b;

    public y8(Context context, int i10) {
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
