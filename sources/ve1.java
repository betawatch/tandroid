// default package

import j$.util.function.Function$-CC;
import java.util.List;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ve1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        byte b = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nf1 nf1Var = (nf1) obj2;
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    return l7c.l(nf1Var.getMessagesController().V1(l));
                }
                TLRPC.Chat K0 = nf1Var.getMessagesController().K0(Long.valueOf(-l.longValue()));
                if (K0 != null) {
                    return K0.title;
                }
                return null;
            default:
                r80 r80Var = (r80) obj2;
                my2 my2Var = (my2) obj;
                q80 a = r80Var.a();
                t80 t80Var = r80Var.c;
                s80 a2 = t80Var.a();
                u80 u80Var = t80Var.a;
                List list = u80Var.a;
                w80 w80Var = u80Var.b;
                hy2 hy2Var = u80Var.c;
                x80 x80Var = u80Var.e;
                List list2 = u80Var.f;
                if (list2 != null) {
                    a2.a = new u80(list, w80Var, hy2Var, my2Var, x80Var, list2);
                    a.c = a2.a();
                    return a.a();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                sc8.j(ir2.o("Missing required properties:", sb));
                return null;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        byte b = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
