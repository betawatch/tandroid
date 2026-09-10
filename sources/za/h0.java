package za;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import m.g3;
import org.telegram.tgnet.TLObject;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h0 implements d0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final k9.h a;
    public final qa.d b;
    public final bb.h c;
    public final g3 d;
    public final id.h e;

    public h0(k9.h hVar, qa.d dVar, bb.h hVar2, g3 g3Var, id.h hVar3) {
        this.a = hVar;
        this.b = dVar;
        this.c = hVar2;
        this.d = g3Var;
        this.e = hVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h0 h0Var, kd.c cVar) {
        e0 e0Var;
        int i10;
        try {
            if (cVar instanceof e0) {
                e0Var = (e0) cVar;
                int i11 = e0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    e0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = e0Var.a;
                    jd.a aVar = jd.a.a;
                    i10 = e0Var.c;
                    if (i10 != 0) {
                        u7.b(obj);
                        Task d = ((qa.c) h0Var.b).d();
                        kotlin.jvm.internal.i.d(d, "firebaseInstallations.id");
                        e0Var.c = 1;
                        obj = w7.h.a(d, e0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u7.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e);
            return "";
        }
        e0Var = new e0(h0Var, cVar);
        Object obj2 = e0Var.a;
        jd.a aVar2 = jd.a.a;
        i10 = e0Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h0 h0Var, kd.c cVar) {
        g0 g0Var;
        int i10;
        boolean z10;
        Boolean y02;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i11 = g0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                g0Var.d = i11 - TLObject.FLAG_31;
                Object obj = g0Var.b;
                jd.a aVar = jd.a.a;
                i10 = g0Var.d;
                z10 = true;
                if (i10 != 0) {
                    u7.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    bb.h hVar = h0Var.c;
                    g0Var.a = h0Var;
                    g0Var.d = 1;
                    if (hVar.b(g0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = g0Var.a;
                    u7.b(obj);
                }
                bb.h hVar2 = h0Var.c;
                y02 = hVar2.a.y0();
                if (y02 == null) {
                    z10 = y02.booleanValue();
                } else {
                    Boolean a2 = hVar2.b.a();
                    if (a2 != null) {
                        z10 = a2.booleanValue();
                    }
                }
                if (z10) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f <= h0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        g0Var = new g0(h0Var, cVar);
        Object obj2 = g0Var.b;
        jd.a aVar2 = jd.a.a;
        i10 = g0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        bb.h hVar22 = h0Var.c;
        y02 = hVar22.a.y0();
        if (y02 == null) {
        }
        if (z10) {
        }
    }
}
