package za;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;
import v7.t7;
import v7.u8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g0 implements c0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final k9.h a;
    public final qa.d b;
    public final bb.i c;
    public final v8.s d;
    public final id.h e;

    public g0(k9.h hVar, qa.d dVar, bb.i iVar, v8.s sVar, id.h hVar2) {
        this.a = hVar;
        this.b = dVar;
        this.c = iVar;
        this.d = sVar;
        this.e = hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g0 g0Var, kd.c cVar) {
        d0 d0Var;
        int i10;
        try {
            if (cVar instanceof d0) {
                d0Var = (d0) cVar;
                int i11 = d0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    d0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = d0Var.a;
                    jd.a aVar = jd.a.a;
                    i10 = d0Var.c;
                    if (i10 != 0) {
                        t7.b(obj);
                        Task d = ((qa.c) g0Var.b).d();
                        kotlin.jvm.internal.i.d(d, "firebaseInstallations.id");
                        d0Var.c = 1;
                        obj = u8.a(d, d0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t7.b(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e7) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e7);
            return "";
        }
        d0Var = new d0(g0Var, cVar);
        Object obj2 = d0Var.a;
        jd.a aVar2 = jd.a.a;
        i10 = d0Var.c;
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
    public static final Object b(g0 g0Var, kd.c cVar) {
        f0 f0Var;
        int i10;
        boolean z10;
        Boolean a2;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i11 = f0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                f0Var.d = i11 - TLObject.FLAG_31;
                Object obj = f0Var.b;
                jd.a aVar = jd.a.a;
                i10 = f0Var.d;
                z10 = true;
                if (i10 != 0) {
                    t7.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    bb.i iVar = g0Var.c;
                    f0Var.a = g0Var;
                    f0Var.d = 1;
                    if (iVar.b(f0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g0Var = f0Var.a;
                    t7.b(obj);
                }
                bb.i iVar2 = g0Var.c;
                a2 = iVar2.a.a();
                if (a2 == null) {
                    z10 = a2.booleanValue();
                } else {
                    Boolean a10 = iVar2.b.a();
                    if (a10 != null) {
                        z10 = a10.booleanValue();
                    }
                }
                if (z10) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f <= g0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        f0Var = new f0(g0Var, cVar);
        Object obj2 = f0Var.b;
        jd.a aVar2 = jd.a.a;
        i10 = f0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        bb.i iVar22 = g0Var.c;
        a2 = iVar22.a.a();
        if (a2 == null) {
        }
        if (z10) {
        }
    }
}
