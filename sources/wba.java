// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wba extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ yba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wba(yba ybaVar, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = ybaVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        yba ybaVar = this.c;
        switch (b) {
            case 0:
                return new wba(ybaVar, zw2Var, (byte) 0);
            default:
                return new wba(ybaVar, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((wba) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        yba ybaVar = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    mm4 data = ybaVar.b.getData();
                    final AtomicReference atomicReference = ybaVar.c;
                    nm4 nm4Var = new nm4() { // from class: vba
                        @Override // nm4
                        public final Object c(Object obj2, zw2 zw2Var) {
                            atomicReference.set((l9a) obj2);
                            return g9c.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof nm4) && (obj2 instanceof vba)) {
                                return new ga(atomicReference).equals(new ga(atomicReference));
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r1.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                        }
                    };
                    this.b = true;
                    if (data.k(nm4Var, this) == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (!z) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                return g9c.a;
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
                mm4 data2 = ybaVar.b.getData();
                this.b = true;
                Object a = qme.a(data2, this);
                return a == vx2Var ? vx2Var : a;
        }
    }
}
