// default package

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
