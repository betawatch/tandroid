// default package

import android.view.View;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class s5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ s5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                if (!aVar.o0 && (runnable = aVar.k0) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (!aVar.K && aVar.o0) {
                    aVar.o(true);
                    break;
                } else {
                    d6 d6Var = aVar.v0;
                    if (d6Var != null) {
                        d6Var.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
