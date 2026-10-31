package v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g5 {
    public static cd.f a(cd.f fVar, cd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static cd.h b(cd.f fVar, cd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? cd.i.a : fVar;
    }

    public static cd.h c(cd.f fVar, cd.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == cd.i.a ? fVar : (cd.h) context.fold(fVar, new b1.e(3));
    }
}
