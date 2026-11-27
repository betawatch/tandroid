// default package

import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xba {
    public final srb a;
    public final o73 b;
    public final AtomicReference c;

    public xba(mx2 mx2Var, srb srbVar, o73 o73Var) {
        mx2Var.getClass();
        srbVar.getClass();
        o73Var.getClass();
        this.a = srbVar;
        this.b = o73Var;
        this.c = new AtomicReference();
        fud.b(xde.a(mx2Var), new vba(this, null, (byte) 0));
    }

    public final l9a a() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object a = ytd.a(new vba(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (l9a) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return srb.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(l9a l9aVar, ax2 ax2Var) {
        wba wbaVar;
        int i;
        if (ax2Var instanceof wba) {
            wbaVar = (wba) ax2Var;
            int i2 = wbaVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                wbaVar.c = i2 - TLObject.FLAG_31;
                Object obj = wbaVar.a;
                i = wbaVar.c;
                if (i != 0) {
                    ixe.b(obj);
                    o73 o73Var = this.b;
                    v73 v73Var = new v73(l9aVar, null);
                    wbaVar.c = 1;
                    Object a = o73Var.a(v73Var, wbaVar);
                    vx2 vx2Var = vx2.a;
                    if (a == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                return f9c.a;
            }
        }
        wbaVar = new wba(this, ax2Var);
        Object obj2 = wbaVar.a;
        i = wbaVar.c;
        if (i != 0) {
        }
        return f9c.a;
    }
}
