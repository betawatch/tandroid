// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class yu5 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ av5 c;
    public final /* synthetic */ zj8 d;
    public final /* synthetic */ Long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu5(av5 av5Var, zj8 zj8Var, Long l, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = av5Var;
        this.d = zj8Var;
        this.e = l;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        switch (this.a) {
            case 0:
                return new yu5(this.c, this.d, this.e, zw2Var, (byte) 0);
            default:
                return new yu5(this.c, this.d, this.e, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((yu5) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Long l = this.e;
        zj8 zj8Var = this.d;
        av5 av5Var = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    mm4 data = av5Var.c.a.getData();
                    this.b = true;
                    obj = qme.b(data, this);
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
                rj7 rj7Var = (rj7) obj;
                if (rj7Var == null) {
                    return l;
                }
                zj8Var.getClass();
                Object obj2 = rj7Var.a.get(zj8Var);
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    obj2 = Arrays.copyOf(bArr, bArr.length);
                }
                return obj2 != null ? obj2 : l;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                xj8 xj8Var = av5Var.c;
                zu5 zu5Var = new zu5(zj8Var, l, null);
                this.b = true;
                Object a = xj8Var.a(new wj8(zu5Var, null, (byte) 1), this);
                return a == vx2Var ? vx2Var : a;
        }
    }
}
