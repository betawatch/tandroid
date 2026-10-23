package w7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
