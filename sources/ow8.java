// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ow8 {
    public static final ow8 c = new ow8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final z8d a = new z8d((byte) 1);

    public final fu9 a(Class cls) {
        w74 w74Var;
        fu9 w;
        Class cls2;
        pr5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        fu9 fu9Var = (fu9) concurrentHashMap.get(cls);
        if (fu9Var != null) {
            return fu9Var;
        }
        Class cls3 = iu9.a;
        if (!ju4.class.isAssignableFrom(cls) && (cls2 = iu9.a) != null && !cls2.isAssignableFrom(cls)) {
            lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        v29 a = ((dk6) this.a.b).a(cls);
        if ((a.d & 2) == 2) {
            if (ju4.class.isAssignableFrom(cls)) {
                w = new r67(iu9.c, x74.a, a.a);
            } else {
                t9c t9cVar = iu9.b;
                w74 w74Var2 = x74.b;
                if (w74Var2 == null) {
                    grb.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new r67(t9cVar, w74Var2, a.a);
            }
        } else if (ju4.class.isAssignableFrom(cls)) {
            w = v57.w(a, tl7.b, i76.b, iu9.c, ik8.F(a.a()) != 1 ? x74.a : null, ik6.b);
        } else {
            sl7 sl7Var = tl7.a;
            h76 h76Var = i76.a;
            t9c t9cVar2 = iu9.b;
            if (ik8.F(a.a()) != 1) {
                w74 w74Var3 = x74.b;
                if (w74Var3 == null) {
                    grb.i("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w74Var = w74Var3;
            } else {
                w74Var = null;
            }
            w = v57.w(a, sl7Var, h76Var, t9cVar2, w74Var, ik6.a);
        }
        fu9 fu9Var2 = (fu9) concurrentHashMap.putIfAbsent(cls, w);
        return fu9Var2 != null ? fu9Var2 : w;
    }
}
