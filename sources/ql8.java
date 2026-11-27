// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ql8 extends c79 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ rl8 d;

    public ql8(rl8 rl8Var, Context context) {
        this.d = rl8Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return !((tl8) this.d.n.d.get(f89Var.b())).a.current;
    }

    @Override // j79
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        em8 em8Var = (em8) f89Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        em8Var.a((tl8) premiumPreviewFragment.d.get(i), i != b() - 1);
        em8Var.c(premiumPreviewFragment.e == i, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        pl8 pl8Var = new pl8(this, this.c);
        pl8Var.setCirclePaintProvider(new m88((Object) this, (Object) pl8Var, (byte) 8));
        return new n69(pl8Var);
    }
}
