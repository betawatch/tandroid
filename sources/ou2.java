// default package

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ou2 extends ContentObserver {
    public final jc a;
    public final /* synthetic */ qu2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou2(qu2 qu2Var) {
        super(null);
        this.b = qu2Var;
        this.a = new jc((byte) 26);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        synchronized (this.b.f) {
            if (this.b.d) {
                return;
            }
            Utilities.e.a(this.a);
            Utilities.e.d(this.a, 500L);
        }
    }
}
