// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qgf {
    public static final qgf c = new qgf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i4d a = new i4d((byte) 2);

    public final tgf a(Class cls) {
        tgf j;
        Class cls2;
        Charset charset = eff.a;
        if (cls == null) {
            fvc.f("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        tgf tgfVar = (tgf) concurrentHashMap.get(cls);
        if (tgfVar != null) {
            return tgfVar;
        }
        Class cls3 = ugf.a;
        if (!vef.class.isAssignableFrom(cls) && (cls2 = ugf.a) != null && !cls2.isAssignableFrom(cls)) {
            w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        sgf zzb = ((agf) this.a.a).zzb(cls);
        if ((zzb.d & 2) == 2) {
            if (vef.class.isAssignableFrom(cls)) {
                j = new mgf(ugf.c, pef.a, zzb.a);
            } else {
                dhf dhfVar = ugf.b;
                oef oefVar = pef.b;
                if (oefVar == null) {
                    sc8.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                j = new mgf(dhfVar, oefVar, zzb.a);
            }
        } else if (vef.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i = ogf.a;
                wff wffVar = yff.b;
                dhf dhfVar2 = ugf.c;
                oef oefVar2 = pef.a;
                int i2 = cgf.a;
                j = lgf.j(zzb, wffVar, dhfVar2, oefVar2);
            } else {
                int i3 = ogf.a;
                wff wffVar2 = yff.b;
                dhf dhfVar3 = ugf.c;
                int i4 = cgf.a;
                j = lgf.j(zzb, wffVar2, dhfVar3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i5 = ogf.a;
            uff uffVar = yff.a;
            dhf dhfVar4 = ugf.b;
            oef oefVar3 = pef.b;
            if (oefVar3 == null) {
                sc8.j("Protobuf runtime is not correctly loaded.");
                return null;
            }
            int i6 = cgf.a;
            j = lgf.j(zzb, uffVar, dhfVar4, oefVar3);
        } else {
            int i7 = ogf.a;
            uff uffVar2 = yff.a;
            dhf dhfVar5 = ugf.b;
            int i8 = cgf.a;
            j = lgf.j(zzb, uffVar2, dhfVar5, null);
        }
        tgf tgfVar2 = (tgf) concurrentHashMap.putIfAbsent(cls, j);
        return tgfVar2 == null ? j : tgfVar2;
    }
}
