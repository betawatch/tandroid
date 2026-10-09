package za;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i0 implements e0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final k9.h a;
    public final qa.d b;
    public final bb.h c;
    public final m2.t d;
    public final jd.h e;

    public i0(k9.h hVar, qa.d dVar, bb.h hVar2, m2.t tVar, jd.h hVar3) {
        this.a = hVar;
        this.b = dVar;
        this.c = hVar2;
        this.d = tVar;
        this.e = hVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i0 i0Var, ld.c cVar) {
        f0 f0Var;
        int i10;
        try {
            if (cVar instanceof f0) {
                f0Var = (f0) cVar;
                int i11 = f0Var.c;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    f0Var.c = i11 - TLObject.FLAG_31;
                    Object obj = f0Var.a;
                    kd.a aVar = kd.a.a;
                    i10 = f0Var.c;
                    if (i10 != 0) {
                        a8.b(obj);
                        Task d = ((qa.c) i0Var.b).d();
                        kotlin.jvm.internal.i.d(d, "firebaseInstallations.id");
                        f0Var.c = 1;
                        obj = w7.i.a(d, f0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a8.b(obj);
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
        f0Var = new f0(i0Var, cVar);
        Object obj2 = f0Var.a;
        kd.a aVar2 = kd.a.a;
        i10 = f0Var.c;
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
    public static final Object b(i0 i0Var, ld.c cVar) {
        h0 h0Var;
        int i10;
        boolean z10;
        Boolean Y;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i11 = h0Var.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                h0Var.d = i11 - TLObject.FLAG_31;
                Object obj = h0Var.b;
                kd.a aVar = kd.a.a;
                i10 = h0Var.d;
                z10 = true;
                if (i10 != 0) {
                    a8.b(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    bb.h hVar = i0Var.c;
                    h0Var.a = i0Var;
                    h0Var.d = 1;
                    if (hVar.b(h0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var = h0Var.a;
                    a8.b(obj);
                }
                bb.h hVar2 = i0Var.c;
                Y = hVar2.a.Y();
                if (Y == null) {
                    z10 = Y.booleanValue();
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
                if (f <= i0Var.c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        h0Var = new h0(i0Var, cVar);
        Object obj2 = h0Var.b;
        kd.a aVar2 = kd.a.a;
        i10 = h0Var.d;
        z10 = true;
        if (i10 != 0) {
        }
        bb.h hVar22 = i0Var.c;
        Y = hVar22.a.Y();
        if (Y == null) {
        }
        if (z10) {
        }
    }
}
