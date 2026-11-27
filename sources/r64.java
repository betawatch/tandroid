// default package

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r64 {
    public final WeakReference a;
    public final q64 b;
    public final /* synthetic */ s64 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, q64] */
    public r64(s64 s64Var, Context context) {
        this.c = s64Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: q64
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                s64 s64Var2 = r64.this.c;
                if (s64Var2.i0) {
                    return;
                }
                s64Var2.m1(1, 19, Integer.valueOf(i));
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new pe2(s64Var.v.a(s64Var.t, null), (byte) 1), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
