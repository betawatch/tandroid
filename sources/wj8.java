// default package

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        f9c f9cVar = f9c.a;
        rj7 rj7Var = (rj7) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((wj8) create(rj7Var, zw2Var)).invokeSuspend(f9cVar);
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
                    rj7 rj7Var = (rj7) this.c;
                    this.b = true;
                    obj = is4Var.invoke(rj7Var, this);
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
                rj7 rj7Var2 = (rj7) obj;
                rj7Var2.getClass();
                ((AtomicBoolean) rj7Var2.b.b).set(true);
                return rj7Var2;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    ixe.b(obj);
                    rj7 rj7Var3 = new rj7(new LinkedHashMap(((rj7) this.c).a()), false);
                    this.c = rj7Var3;
                    this.b = true;
                    return is4Var.invoke(rj7Var3, this) == vx2Var ? vx2Var : rj7Var3;
                }
                if (!z2) {
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rj7 rj7Var4 = (rj7) this.c;
                ixe.b(obj);
                return rj7Var4;
        }
    }
}
