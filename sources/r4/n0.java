package r4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final void a(int i3) {
        int i10 = this.d;
        this.d = i10 + 1;
        b(5, i10, i3, null, null);
    }

    public final boolean b(int i3, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i3;
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
            if (i3 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new m0(this, 1));
    }

    public final void c(int i3, int i10) {
        Bundle k10 = f1.k(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i3, null, k10);
    }

    public final void d(int i3, int i10) {
        Bundle k10 = f1.k(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i3, null, k10);
    }
}
