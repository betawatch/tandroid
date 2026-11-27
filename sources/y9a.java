// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y9a {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final ji4 a;
    public final ri4 b;
    public final bba c;
    public final x44 d;
    public final mx2 e;

    public y9a(ji4 ji4Var, ri4 ri4Var, bba bbaVar, x44 x44Var, mx2 mx2Var) {
        ji4Var.getClass();
        ri4Var.getClass();
        bbaVar.getClass();
        x44Var.getClass();
        mx2Var.getClass();
        this.a = ji4Var;
        this.b = ri4Var;
        this.c = bbaVar;
        this.d = x44Var;
        this.e = mx2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r6.b(r0) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        if (r7 != r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ax2 ax2Var) {
        x9a x9aVar;
        int i;
        Collection values;
        Iterator it;
        if (ax2Var instanceof x9a) {
            x9aVar = (x9a) ax2Var;
            int i2 = x9aVar.c;
            if ((i2 & TLObject.FLAG_31) != 0) {
                x9aVar.c = i2 - TLObject.FLAG_31;
                Object obj = x9aVar.a;
                i = x9aVar.c;
                bba bbaVar = this.c;
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    nj4 nj4Var = nj4.a;
                    x9aVar.c = 1;
                    obj = nj4Var.b(x9aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                        Boolean b = bbaVar.a.b();
                        if (!((b == null && (b = bbaVar.b.b()) == null) ? true : b.booleanValue())) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                        if (f <= bbaVar.a()) {
                            return Boolean.TRUE;
                        }
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                    ixe.b(obj);
                }
                values = ((Map) obj).values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    it = values.iterator();
                    while (it.hasNext()) {
                        if (((ty2) it.next()).a.a()) {
                            x9aVar.c = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        x9aVar = new x9a(this, ax2Var);
        Object obj2 = x9aVar.a;
        i = x9aVar.c;
        bba bbaVar2 = this.c;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
        values = ((Map) obj2).values();
        if (values instanceof Collection) {
        }
        it = values.iterator();
        while (it.hasNext()) {
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boolean.FALSE;
    }
}
