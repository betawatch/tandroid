// default package

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uc3 implements b36 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public uc3(Object obj) {
        this.a = (byte) 2;
        this.b = obj;
        fj2 fj2Var = fj2.c;
        Class<?> cls = obj.getClass();
        dj2 dj2Var = (dj2) fj2Var.a.get(cls);
        this.c = dj2Var == null ? fj2Var.a(cls, null) : dj2Var;
    }

    @Override // b36
    public final void b(e36 e36Var, u26 u26Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xx3 xx3Var = (xx3) obj;
                int i = tc3.a[u26Var.ordinal()];
                if (i == 3) {
                    (Build.VERSION.SDK_INT >= 28 ? es2.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new sw((byte) 7), 500L);
                    xx3Var.a.b(xx3Var);
                } else if (i == 7) {
                    u36.j("ON_ANY must not been send by anybody");
                    break;
                }
                b36 b36Var = (b36) obj2;
                if (b36Var != null) {
                    b36Var.b(e36Var, u26Var);
                    break;
                }
                break;
            case 1:
                if (u26Var == u26.ON_START) {
                    ((w26) obj).b(this);
                    ((op) obj2).g();
                    break;
                }
                break;
            default:
                HashMap hashMap = ((dj2) obj2).a;
                dj2.a((List) hashMap.get(u26Var), e36Var, u26Var, obj);
                dj2.a((List) hashMap.get(u26.ON_ANY), e36Var, u26Var, obj);
                break;
        }
    }

    public /* synthetic */ uc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
