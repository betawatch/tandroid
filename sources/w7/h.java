package w7;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
