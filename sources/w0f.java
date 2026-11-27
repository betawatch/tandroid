// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class w0f {
    public static final w0f c = new w0f();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ri6 a = new ri6((byte) 1);

    public final o1f a(Class cls) {
        o1f l;
        Class cls2;
        Charset charset = xse.a;
        if (cls == null) {
            p3d.h("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        o1f o1fVar = (o1f) concurrentHashMap.get(cls);
        if (o1fVar != null) {
            return o1fVar;
        }
        Class cls3 = w1f.a;
        if (!ese.class.isAssignableFrom(cls) && (cls2 = w1f.a) != null && !cls2.isAssignableFrom(cls)) {
            lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        j1f zzb = ((mxe) this.a.b).zzb(cls);
        if ((zzb.d & 2) == 2) {
            if (ese.class.isAssignableFrom(cls)) {
                l = new pze(w1f.d, wpe.a, zzb.a);
            } else {
                d4f d4fVar = w1f.b;
                npe npeVar = wpe.b;
                if (npeVar == null) {
                    grb.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                l = new pze(d4fVar, npeVar, zzb.a);
            }
        } else if (ese.class.isAssignableFrom(cls)) {
            l = (zzb.d & 1) == 1 ? hze.l(zzb, g0f.b, qve.b, w1f.d, wpe.a, lye.b) : hze.l(zzb, g0f.b, qve.b, w1f.d, null, lye.b);
        } else if ((zzb.d & 1) == 1) {
            k0f k0fVar = g0f.a;
            awe aweVar = qve.a;
            d4f d4fVar2 = w1f.b;
            npe npeVar2 = wpe.b;
            if (npeVar2 == null) {
                grb.i("Protobuf runtime is not correctly loaded.");
                return null;
            }
            l = hze.l(zzb, k0fVar, aweVar, d4fVar2, npeVar2, lye.a);
        } else {
            l = hze.l(zzb, g0f.a, qve.a, w1f.c, null, lye.a);
        }
        o1f o1fVar2 = (o1f) concurrentHashMap.putIfAbsent(cls, l);
        return o1fVar2 != null ? o1fVar2 : l;
    }
}
