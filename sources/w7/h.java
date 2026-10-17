package w7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class h {
    public static kd.f a(kd.f fVar, kd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static kd.h b(kd.f fVar, kd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? kd.i.a : fVar;
    }

    public static kd.h c(kd.f fVar, kd.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == kd.i.a ? fVar : (kd.h) context.fold(fVar, new b1.e(5));
    }
}
