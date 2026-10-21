package zh;

import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.rp0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
