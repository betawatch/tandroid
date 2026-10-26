package y8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import z8.a1;
import z8.c1;
import z8.f0;
import z8.l0;
import z8.m0;
import z8.w0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m extends c8.b {
    public volatile int b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.c = kVar;
        this.b = -1;
    }

    public static final void L0(f0 f0Var, boolean z10, byte[] bArr) {
        try {
            f0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(f0Var.c);
            int i10 = g8.a.a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            try {
                f0Var.b.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        f0 f0Var;
        f0 f0Var2;
        if (i10 == 13) {
            Object obj = (l0) g8.a.a(parcel, l0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                f0Var2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (!(queryLocalInterface instanceof f0)) {
                    f0Var = new f0(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
                    g8.a.b(parcel);
                    K0(new q1(this, obj, f0Var, false, 12), "onRequestReceived", obj);
                    return true;
                }
                f0Var2 = (f0) queryLocalInterface;
            }
            f0Var = f0Var2;
            g8.a.b(parcel);
            K0(new q1(this, obj, f0Var, false, 12), "onRequestReceived", obj);
            return true;
        }
        if (i10 != 14) {
            switch (i10) {
                case 1:
                    DataHolder dataHolder = (DataHolder) g8.a.a(parcel, DataHolder.CREATOR);
                    g8.a.b(parcel);
                    try {
                        if (!K0(new t9.i(7, this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.n)) {
                            break;
                        }
                    } finally {
                        dataHolder.close();
                    }
                    break;
                case 2:
                    Object obj2 = (l0) g8.a.a(parcel, l0.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(8, this, obj2), "onMessageReceived", obj2);
                    break;
                case 3:
                    m0 m0Var = (m0) g8.a.a(parcel, m0.CREATOR);
                    g8.a.b(parcel);
                    K0(new r(this, m0Var, 0), "onPeerConnected", m0Var);
                    break;
                case 4:
                    m0 m0Var2 = (m0) g8.a.a(parcel, m0.CREATOR);
                    g8.a.b(parcel);
                    K0(new r(this, m0Var2, 1), "onPeerDisconnected", m0Var2);
                    break;
                case 5:
                    Object createTypedArrayList = parcel.createTypedArrayList(m0.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(9, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                    break;
                case 6:
                    Object obj3 = (c1) g8.a.a(parcel, c1.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(11, this, obj3), "onNotificationReceived", obj3);
                    break;
                case 7:
                    Object obj4 = (z8.f) g8.a.a(parcel, z8.f.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(13, this, obj4), "onChannelEvent", obj4);
                    break;
                case 8:
                    Object obj5 = (z8.c) g8.a.a(parcel, z8.c.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(10, this, obj5), "onConnectedCapabilityChanged", obj5);
                    break;
                case 9:
                    Object obj6 = (w0) g8.a.a(parcel, w0.CREATOR);
                    g8.a.b(parcel);
                    K0(new t9.i(12, this, obj6), "onEntityUpdate", obj6);
                    break;
                default:
                    return false;
            }
        } else {
            g8.a.b(parcel);
        }
        return true;
    }

    public final boolean K0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        q qVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (a1.a(this.c).b() && v6.b.g(this.c, "com.google.android.wearable.app.cn", callingUid)) {
                this.b = callingUid;
            } else {
                if (!v6.b.e(this.c, callingUid)) {
                    Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                    return false;
                }
                this.b = callingUid;
            }
        }
        obj2 = this.c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.c;
                z10 = kVar.zzg;
                if (z10) {
                    return false;
                }
                qVar = kVar.zzb;
                qVar.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
