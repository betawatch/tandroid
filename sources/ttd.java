// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ttd {
    public static final ttd c = new ttd();
    public final iod a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ttd() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        iod iodVar = null;
        for (int i = 0; i <= 0; i++) {
            try {
                iodVar = (iod) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                iodVar = null;
            }
            if (iodVar != null) {
                break;
            }
        }
        this.a = iodVar == null ? new iod() : iodVar;
    }

    public final vud a(Class cls) {
        osd osdVar;
        tmd tmdVar;
        jyd jydVar;
        jfd jfdVar;
        ypd ypdVar;
        vud n;
        Class cls2;
        Charset charset = ejd.a;
        if (cls == null) {
            fvc.f("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        vud vudVar = (vud) concurrentHashMap.get(cls);
        if (vudVar != null) {
            return vudVar;
        }
        iod iodVar = this.a;
        iodVar.getClass();
        Class cls3 = gvd.a;
        if (!vid.class.isAssignableFrom(cls) && (cls2 = gvd.a) != null && !cls2.isAssignableFrom(cls)) {
            w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        fud zzb = iodVar.a.zzb(cls);
        if (!((zzb.b.d & 2) == 2)) {
            if (vid.class.isAssignableFrom(cls)) {
                int i = zzb.b.d & 1;
                osdVar = vsd.b;
                if (i == 1) {
                    tmdVar = tmd.b;
                    jydVar = gvd.d;
                    jfdVar = tfd.a;
                } else {
                    tmdVar = tmd.b;
                    jydVar = gvd.d;
                    jfdVar = null;
                }
                ypdVar = eqd.b;
            } else {
                if ((zzb.b.d & 1) == 1) {
                    osdVar = vsd.a;
                    tmdVar = tmd.a;
                    jydVar = gvd.b;
                    jfdVar = tfd.b;
                    if (jfdVar == null) {
                        sc8.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    osdVar = vsd.a;
                    tmdVar = tmd.a;
                    jydVar = gvd.c;
                    jfdVar = null;
                }
                ypdVar = eqd.a;
            }
            n = mrd.n(zzb, osdVar, tmdVar, jydVar, jfdVar, ypdVar);
        } else if (vid.class.isAssignableFrom(cls)) {
            n = new xrd(gvd.d, tfd.a, zzb.a);
        } else {
            jyd jydVar2 = gvd.b;
            jfd jfdVar2 = tfd.b;
            if (jfdVar2 == null) {
                sc8.j("Protobuf runtime is not correctly loaded.");
                return null;
            }
            n = new xrd(jydVar2, jfdVar2, zzb.a);
        }
        vud vudVar2 = (vud) concurrentHashMap.putIfAbsent(cls, n);
        return vudVar2 != null ? vudVar2 : n;
    }
}
