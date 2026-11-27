// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class z73 implements nm4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z73(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // nm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, zw2 zw2Var) {
        y73 y73Var;
        int i;
        Object g;
        byte b = this.a;
        g9c g9cVar = g9c.a;
        vx2 vx2Var = vx2.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (zw2Var instanceof y73) {
                    y73Var = (y73) zw2Var;
                    int i2 = y73Var.b;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        y73Var.b = i2 - TLObject.FLAG_31;
                        Object obj3 = y73Var.a;
                        i = y73Var.b;
                        if (i != 0) {
                            ixe.b(obj3);
                            nm4 nm4Var = (nm4) obj2;
                            i0b i0bVar = (i0b) obj;
                            if (i0bVar instanceof a59) {
                                throw ((a59) i0bVar).b;
                            }
                            if (i0bVar instanceof k63) {
                                Object obj4 = ((k63) i0bVar).b;
                                y73Var.b = 1;
                                return nm4Var.c(obj4, y73Var) == vx2Var ? vx2Var : g9cVar;
                            }
                            if (!(i0bVar instanceof sh4 ? true : i0bVar instanceof n8c)) {
                                throw new zp2();
                            }
                            grb.i("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            if (i == 1) {
                                ixe.b(obj3);
                                return g9cVar;
                            }
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                }
                y73Var = new y73(this, zw2Var);
                Object obj32 = y73Var.a;
                i = y73Var.b;
                if (i != 0) {
                }
                return null;
            case 1:
                o83 o83Var = (o83) obj2;
                return ((o83Var.h.r() instanceof sh4) || (g = o83Var.g(true, zw2Var)) != vx2Var) ? g9cVar : g;
            default:
                o9a o9aVar = (o9a) obj;
                yja yjaVar = (yja) obj2;
                o9aVar.getClass();
                yjaVar.h = o9aVar;
                if (yjaVar.j) {
                    yjaVar.j = false;
                    yjaVar.b();
                }
                Object e = yjaVar.e(o9aVar.a.a, vja.a, zw2Var);
                return e == vx2Var ? e : g9cVar;
        }
    }
}
