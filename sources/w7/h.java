package w7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
