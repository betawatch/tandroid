package s0;

import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements c9.e, rg.c {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // c9.e
    public Object e0(c5.j jVar) {
        v2.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(jVar);
        return lambda$getComponents$0;
    }

    @Override // rg.c
    public int g(g6 g6Var, boolean z4) {
        switch (this.a) {
            case 18:
                return sg.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.d6, g6Var), k6.v0(k6.Sd, g6Var));
            case 19:
                if (!LiteMode.isEnabled(256)) {
                    return k6.w0(null, k6.G8, false);
                }
                return k6.l1(z4 ? 0.85f : 0.825f, k6.w0(null, k6.G8, false));
            case 20:
                return sg.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.d6, g6Var), k6.v0(k6.Zk, g6Var));
            case 21:
                return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.Fi, g6Var));
            case 22:
                return 855638016;
            case 23:
                return TLObject.FLAG_30;
            case 24:
                return k6.l1(0.075f, -16777216);
            case 25:
                return k6.l1(0.88f, k6.v0(k6.d6, g6Var));
            case 26:
                return k6.l1(z4 ? 0.85f : 0.825f, k6.w0(null, k6.G8, false));
            case 27:
                return sg.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.d6, g6Var), k6.v0(k6.Yk, g6Var));
            case 28:
                return k6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.v0(k6.d6, g6Var));
            default:
                return k6.l1(0.78f, k6.v0(k6.h5, g6Var));
        }
    }
}
