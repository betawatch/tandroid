// default package

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t43 extends ContentObserver {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t43(gfb gfbVar) {
        super(new Handler());
        this.b = gfbVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                gfb gfbVar = (gfb) this.b;
                if (!gfbVar.b || (cursor = gfbVar.c) == null || cursor.isClosed()) {
                    return;
                }
                gfbVar.a = gfbVar.c.requery();
                return;
            default:
                iad iadVar = (iad) this.b;
                synchronized (iadVar.d) {
                    iadVar.e = null;
                }
                ((iad) this.b).b();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t43(iad iadVar) {
        super(null);
        this.b = iadVar;
    }
}
