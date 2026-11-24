// default package

import android.database.ContentObserver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zv2 extends ContentObserver {
    public final jd a;
    public final /* synthetic */ bw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv2(bw2 bw2Var) {
        super(null);
        this.b = bw2Var;
        this.a = new jd((byte) 26);
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
