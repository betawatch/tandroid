package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.rp0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class y implements rp0 {
    public final /* synthetic */ Utilities.CallbackReturn a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ Utilities.Callback c;

    public y(Utilities.CallbackReturn callbackReturn, n2 n2Var, Utilities.Callback callback) {
        this.a = callbackReturn;
        this.b = n2Var;
        this.c = callback;
    }

    @Override // org.telegram.ui.rp0
    public final void a(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).path : null;
        if (str == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new si.o(str, this.a, this.b, this.c, 4));
    }

    @Override // org.telegram.ui.rp0
    public final void b() {
    }
}
