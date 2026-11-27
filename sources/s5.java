// default package

import android.view.View;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
