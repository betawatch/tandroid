// default package

import android.view.View;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a b;

    public /* synthetic */ r5(a aVar, byte b) {
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
                    c6 c6Var = aVar.v0;
                    if (c6Var != null) {
                        c6Var.b(-1);
                        break;
                    }
                }
                break;
        }
    }
}
