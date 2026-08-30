package q8;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements ServiceConnection {
    public p8.c a;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    public static boolean a(b bVar) {
        return bVar.a != null;
    }

    public final boolean b(Intent intent, Bundle bundle) {
        p8.c cVar = this.a;
        if (cVar != null) {
            p8.a aVar = (p8.a) cVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
            int i10 = u2.a.a;
            if (intent == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel E0 = aVar.E0(obtain, 1);
            boolean z4 = E0.readInt() != 0;
            E0.recycle();
            if (z4) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z4;
        p8.c aVar;
        z4 = this.b.dbg;
        if (z4) {
            Log.d("SAVerificationClientS", "onServiceConnected");
        }
        int i10 = p8.b.a;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            aVar = queryLocalInterface instanceof p8.c ? (p8.c) queryLocalInterface : new p8.a(iBinder);
        }
        this.a = aVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z4;
        this.a = null;
        z4 = this.b.dbg;
        if (z4) {
            Log.d("SAVerificationClientS", "onServiceDisconnected");
        }
    }
}
