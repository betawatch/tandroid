// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s83 implements jm4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s83(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // jm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, px2 px2Var) {
        r83 r83Var;
        int i;
        Object g;
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ly2 ly2Var = ly2.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (px2Var instanceof r83) {
                    r83Var = (r83) px2Var;
                    int i2 = r83Var.b;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        r83Var.b = i2 - TLObject.FLAG_31;
                        Object obj3 = r83Var.a;
                        i = r83Var.b;
                        if (i != 0) {
                            tue.b(obj3);
                            jm4 jm4Var = (jm4) obj2;
                            iya iyaVar = (iya) obj;
                            if (iyaVar instanceof o39) {
                                throw ((o39) iyaVar).b;
                            }
                            if (iyaVar instanceof e73) {
                                Object obj4 = ((e73) iyaVar).b;
                                r83Var.b = 1;
                                return jm4Var.c(obj4, r83Var) == ly2Var ? ly2Var : g7cVar;
                            }
                            if (!(iyaVar instanceof vh4 ? true : iyaVar instanceof o6c)) {
                                throw new rq2();
                            }
                            dq9.m("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            if (i == 1) {
                                tue.b(obj3);
                                return g7cVar;
                            }
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                }
                r83Var = new r83(this, px2Var);
                Object obj32 = r83Var.a;
                i = r83Var.b;
                if (i != 0) {
                }
                return null;
            case 1:
                h93 h93Var = (h93) obj2;
                return ((h93Var.h.k() instanceof vh4) || (g = h93Var.g(true, px2Var)) != ly2Var) ? g7cVar : g;
            default:
                y7a y7aVar = (y7a) obj;
                hia hiaVar = (hia) obj2;
                y7aVar.getClass();
                hiaVar.h = y7aVar;
                if (hiaVar.j) {
                    hiaVar.j = false;
                    hiaVar.b();
                }
                Object e = hiaVar.e(y7aVar.a.a, eia.a, px2Var);
                return e == ly2Var ? e : g7cVar;
        }
    }
}
