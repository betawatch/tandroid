// default package

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w5d extends h6d {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5d(x5d x5dVar, g6d g6dVar, ws2 ws2Var) {
        super(g6dVar);
        this.c = ws2Var;
        this.d = x5dVar;
    }

    @Override // h6d
    public final void a() {
        wi5 ajfVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((x5d) obj).c.g((ws2) obj2);
                break;
            default:
                a6d a6dVar = (a6d) obj2;
                t7d t7dVar = (t7d) obj;
                if (a6dVar.i(0)) {
                    ws2 ws2Var = t7dVar.b;
                    if (!ws2Var.c()) {
                        if (a6dVar.x && !ws2Var.b()) {
                            a6dVar.f();
                            a6dVar.b();
                            break;
                        } else {
                            a6dVar.g(ws2Var);
                            break;
                        }
                    } else {
                        c8d c8dVar = t7dVar.c;
                        xve.h(c8dVar);
                        ws2 ws2Var2 = c8dVar.c;
                        if (!ws2Var2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ws2Var2)), new Exception());
                            a6dVar.g(ws2Var2);
                            break;
                        } else {
                            a6dVar.E = true;
                            IBinder iBinder = c8dVar.b;
                            if (iBinder == null) {
                                ajfVar = null;
                            } else {
                                int i = f5.b;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                ajfVar = queryLocalInterface instanceof wi5 ? (wi5) queryLocalInterface : new ajf(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                            xve.h(ajfVar);
                            a6dVar.F = ajfVar;
                            a6dVar.G = c8dVar.d;
                            a6dVar.H = c8dVar.e;
                            a6dVar.b();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5d(y5d y5dVar, a6d a6dVar, a6d a6dVar2, t7d t7dVar) {
        super(a6dVar);
        this.c = a6dVar2;
        this.d = t7dVar;
    }
}
