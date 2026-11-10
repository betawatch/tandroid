package s4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final g.c b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ r0 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.i = r0Var;
        this.a = messenger;
        g.c cVar = new g.c(this);
        this.b = cVar;
        this.c = new Messenger(cVar);
    }

    public final void a(int i7) {
        int i10 = this.d;
        this.d = i10 + 1;
        b(5, i10, i7, null, null);
    }

    public final boolean b(int i7, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i7;
        obtain.arg1 = i10;
        obtain.arg2 = i11;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i7 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new l0(this, 1));
    }

    public final void c(int i7, int i10) {
        Bundle f10 = rf.b.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i7, null, f10);
    }

    public final void d(int i7, int i10) {
        Bundle f10 = rf.b.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i7, null, f10);
    }
}
