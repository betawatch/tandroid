package v7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
