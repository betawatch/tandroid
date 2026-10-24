package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class y implements up0 {
    public final /* synthetic */ Utilities.CallbackReturn a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ Utilities.Callback c;

    public y(Utilities.CallbackReturn callbackReturn, o2 o2Var, Utilities.Callback callback) {
        this.a = callbackReturn;
        this.b = o2Var;
        this.c = callback;
    }

    @Override // org.telegram.ui.up0
    public final void a(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path : null;
        if (str == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new si.o(str, this.a, this.b, this.c, 4));
    }

    @Override // org.telegram.ui.up0
    public final void b() {
    }
}
