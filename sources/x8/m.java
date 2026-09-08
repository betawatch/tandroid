package x8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c5.v;
import com.google.android.gms.common.data.DataHolder;
import y8.b1;
import y8.e0;
import y8.k0;
import y8.l0;
import y8.v0;
import y8.z0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends b8.b {
    public volatile int b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.c = kVar;
        this.b = -1;
    }

    public static final void M0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.c);
            int i10 = f8.a.a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            try {
                e0Var.b.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e7) {
            Log.e("WearableLS", "Failed to send a response back", e7);
        }
    }

    @Override // b8.b
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        e0 e0Var;
        if (i10 == 13) {
            Object obj = (k0) f8.a.a(parcel, k0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                e0Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                e0Var = queryLocalInterface instanceof e0 ? (e0) queryLocalInterface : new e0(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 4);
            }
            f8.a.b(parcel);
            L0(new v(this, obj, e0Var, 13), "onRequestReceived", obj);
            return true;
        }
        if (i10 == 14) {
            f8.a.b(parcel);
            return true;
        }
        switch (i10) {
            case 1:
                DataHolder dataHolder = (DataHolder) f8.a.a(parcel, DataHolder.CREATOR);
                f8.a.b(parcel);
                Runnable eVar = new u4.e(7, this, dataHolder);
                try {
                    String valueOf = String.valueOf(dataHolder);
                    int i11 = dataHolder.n;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(valueOf);
                    sb2.append(", rows=");
                    sb2.append(i11);
                    return !L0(eVar, "onDataItemChanged", sb2.toString()) ? true : true;
                } finally {
                    dataHolder.close();
                }
            case 2:
                Object obj2 = (k0) f8.a.a(parcel, k0.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(8, this, obj2), "onMessageReceived", obj2);
                return true;
            case 3:
                l0 l0Var = (l0) f8.a.a(parcel, l0.CREATOR);
                f8.a.b(parcel);
                L0(new q(this, l0Var, 0), "onPeerConnected", l0Var);
                return true;
            case 4:
                l0 l0Var2 = (l0) f8.a.a(parcel, l0.CREATOR);
                f8.a.b(parcel);
                L0(new q(this, l0Var2, 1), "onPeerDisconnected", l0Var2);
                return true;
            case 5:
                Object createTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(9, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                return true;
            case 6:
                Object obj3 = (b1) f8.a.a(parcel, b1.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(11, this, obj3), "onNotificationReceived", obj3);
                return true;
            case 7:
                Object obj4 = (y8.e) f8.a.a(parcel, y8.e.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(13, this, obj4), "onChannelEvent", obj4);
                return true;
            case 8:
                Object obj5 = (y8.b) f8.a.a(parcel, y8.b.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(10, this, obj5), "onConnectedCapabilityChanged", obj5);
                return true;
            case 9:
                Object obj6 = (v0) f8.a.a(parcel, v0.CREATOR);
                f8.a.b(parcel);
                L0(new u4.e(12, this, obj6), "onEntityUpdate", obj6);
                return true;
            default:
                return false;
        }
    }

    public final boolean L0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (z0.a(this.c).b() && u6.b.g(this.c, "com.google.android.wearable.app.cn", callingUid)) {
                this.b = callingUid;
            } else {
                if (!u6.b.e(this.c, callingUid)) {
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
                pVar = kVar.zzb;
                pVar.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
