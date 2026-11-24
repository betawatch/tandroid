// default package

import android.view.View;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    aVar.n(true);
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
