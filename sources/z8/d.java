package z8;

import a9.b1;
import a9.c0;
import a9.k0;
import a9.l0;
import a9.v0;
import a9.z0;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.cast.o;
import org.telegram.messenger.WearAuthListenerService;
import u9.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends o {
    public volatile int b;
    public final /* synthetic */ WearAuthListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.c = wearAuthListenerService;
        this.b = -1;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        c0 c0Var;
        c0 c0Var2;
        if (i3 == 13) {
            Object obj = (k0) h8.a.a(parcel, k0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c0Var2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (!(queryLocalInterface instanceof c0)) {
                    c0Var = new c0(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
                    h8.a.b(parcel);
                    M0(new j1(this, obj, c0Var, false, 12), "onRequestReceived", obj);
                    return true;
                }
                c0Var2 = (c0) queryLocalInterface;
            }
            c0Var = c0Var2;
            h8.a.b(parcel);
            M0(new j1(this, obj, c0Var, false, 12), "onRequestReceived", obj);
            return true;
        }
        if (i3 != 14) {
            switch (i3) {
                case 1:
                    DataHolder dataHolder = (DataHolder) h8.a.a(parcel, DataHolder.CREATOR);
                    h8.a.b(parcel);
                    try {
                        if (!M0(new k(9, this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.n)) {
                            break;
                        }
                    } finally {
                        dataHolder.close();
                    }
                    break;
                case 2:
                    Object obj2 = (k0) h8.a.a(parcel, k0.CREATOR);
                    h8.a.b(parcel);
                    M0(new k(10, this, obj2), "onMessageReceived", obj2);
                    break;
                case 3:
                    l0 l0Var = (l0) h8.a.a(parcel, l0.CREATOR);
                    h8.a.b(parcel);
                    M0(new g(this, l0Var, 0), "onPeerConnected", l0Var);
                    break;
                case 4:
                    l0 l0Var2 = (l0) h8.a.a(parcel, l0.CREATOR);
                    h8.a.b(parcel);
                    M0(new g(this, l0Var2, 1), "onPeerDisconnected", l0Var2);
                    break;
                case 5:
                    Object createTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
                    h8.a.b(parcel);
                    M0(new k(11, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                    break;
                case 6:
                    b1 b1Var = (b1) h8.a.a(parcel, b1.CREATOR);
                    h8.a.b(parcel);
                    M0(new g(this, b1Var, 3), "onNotificationReceived", b1Var);
                    break;
                case 7:
                    Object obj3 = (a9.e) h8.a.a(parcel, a9.e.CREATOR);
                    h8.a.b(parcel);
                    M0(new k(12, this, obj3), "onChannelEvent", obj3);
                    break;
                case 8:
                    a9.b bVar = (a9.b) h8.a.a(parcel, a9.b.CREATOR);
                    h8.a.b(parcel);
                    M0(new g(this, bVar, 2), "onConnectedCapabilityChanged", bVar);
                    break;
                case 9:
                    v0 v0Var = (v0) h8.a.a(parcel, v0.CREATOR);
                    h8.a.b(parcel);
                    M0(new g(this, v0Var, 4), "onEntityUpdate", v0Var);
                    break;
                default:
                    return false;
            }
        } else {
            h8.a.b(parcel);
        }
        return true;
    }

    public final boolean M0(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.c.a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (z0.a(this.c).b() && w6.b.g(callingUid, this.c, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else {
                if (!w6.b.e(this.c, callingUid)) {
                    Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                    return false;
                }
                this.b = callingUid;
            }
        }
        synchronized (this.c.f) {
            try {
                WearAuthListenerService wearAuthListenerService = this.c;
                if (wearAuthListenerService.h) {
                    return false;
                }
                wearAuthListenerService.b.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
