// default package

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wj8 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ is4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj8(is4 is4Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = is4Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        is4 is4Var = this.d;
        switch (b) {
            case 0:
                wj8 wj8Var = new wj8(is4Var, zw2Var, (byte) 0);
                wj8Var.c = obj;
                return wj8Var;
            default:
                wj8 wj8Var2 = new wj8(is4Var, zw2Var, (byte) 1);
                wj8Var2.c = obj;
                return wj8Var2;
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        sj7 sj7Var = (sj7) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((wj8) create(sj7Var, zw2Var)).invokeSuspend(g9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        is4 is4Var = this.d;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    sj7 sj7Var = (sj7) this.c;
                    this.b = true;
                    obj = is4Var.invoke(sj7Var, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (!z) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                sj7 sj7Var2 = (sj7) obj;
                sj7Var2.getClass();
                ((AtomicBoolean) sj7Var2.b.b).set(true);
                return sj7Var2;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    ixe.b(obj);
                    sj7 sj7Var3 = new sj7(new LinkedHashMap(((sj7) this.c).a()), false);
                    this.c = sj7Var3;
                    this.b = true;
                    return is4Var.invoke(sj7Var3, this) == vx2Var ? vx2Var : sj7Var3;
                }
                if (!z2) {
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sj7 sj7Var4 = (sj7) this.c;
                ixe.b(obj);
                return sj7Var4;
        }
    }
}
