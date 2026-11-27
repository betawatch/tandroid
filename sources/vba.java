// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vba extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vba(xba xbaVar, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = xbaVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        xba xbaVar = this.c;
        switch (b) {
            case 0:
                return new vba(xbaVar, zw2Var, (byte) 0);
            default:
                return new vba(xbaVar, zw2Var, (byte) 1);
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
        return ((vba) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        xba xbaVar = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    ixe.b(obj);
                    mm4 data = xbaVar.b.getData();
                    final AtomicReference atomicReference = xbaVar.c;
                    nm4 nm4Var = new nm4() { // from class: uba
                        @Override // nm4
                        public final Object c(Object obj2, zw2 zw2Var) {
                            atomicReference.set((l9a) obj2);
                            return f9c.a;
                        }

                        public final boolean equals(Object obj2) {
                            if ((obj2 instanceof nm4) && (obj2 instanceof uba)) {
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
                return f9c.a;
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
                mm4 data2 = xbaVar.b.getData();
                this.b = true;
                Object a = qme.a(data2, this);
                return a == vx2Var ? vx2Var : a;
        }
    }
}
