package v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class v8 {
    public static jd.f a(jd.f fVar, jd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static jd.h b(jd.f fVar, jd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? jd.i.a : fVar;
    }

    public static jd.h c(jd.f fVar, jd.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == jd.i.a ? fVar : (jd.h) context.fold(fVar, new b1.e(5));
    }
}
