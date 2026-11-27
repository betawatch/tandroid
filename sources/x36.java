// default package

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class x36 implements fd, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l46 b;

    public /* synthetic */ x36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        l46 l46Var = this.b;
        l46Var.n1.getOnItemClickListener().e(i, view);
        if (l46Var.c2 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                l46Var.F2.presentFragment(new PremiumPreviewFragment(0, null));
                l46Var.dismiss();
                idVar.dismiss();
                break;
            default:
                idVar.dismiss();
                l46Var.a1();
                break;
        }
    }
}
