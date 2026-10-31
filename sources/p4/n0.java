package p4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final g.c b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ s0 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public n0(s0 s0Var, Messenger messenger) {
        this.i = s0Var;
        this.a = messenger;
        g.c cVar = new g.c(this);
        this.b = cVar;
        this.c = new Messenger(cVar);
    }

    public final void a(int i10) {
        int i11 = this.d;
        this.d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.arg1 = i11;
        obtain.arg2 = i12;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i10 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new m0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle i12 = f1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(7, i13, i10, null, i12);
    }

    public final void d(int i10, int i11) {
        Bundle i12 = f1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(8, i13, i10, null, i12);
    }
}
