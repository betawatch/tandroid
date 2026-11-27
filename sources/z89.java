// default package

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z89 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final rc b;
    public final Messenger c;
    public int f;
    public int h;
    public final /* synthetic */ f99 r;
    public int d = 1;
    public int e = 1;
    public final SparseArray n = new SparseArray();

    public z89(f99 f99Var, Messenger messenger) {
        this.r = f99Var;
        this.a = messenger;
        rc rcVar = new rc(this);
        this.b = rcVar;
        this.c = new Messenger(rcVar);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.r.s.post(new y89(this, (byte) 1));
    }

    public final void c(int i, int i2) {
        Bundle j = qu6.j(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, j);
    }

    public final void d(int i, int i2) {
        Bundle j = qu6.j(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, j);
    }
}
