package v7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class n8 {
    public static id.f a(id.f fVar, id.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static id.h b(id.f fVar, id.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? id.i.a : fVar;
    }

    public static id.h c(id.f fVar, id.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == id.i.a ? fVar : (id.h) context.fold(fVar, new b1.e(5));
    }
}
