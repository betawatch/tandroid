// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q9d extends f1d {
    public final had Z(le1 le1Var, xk5 xk5Var, t7d t7dVar) {
        had w9dVar;
        Parcel R = R();
        kid.c(R, le1Var);
        kid.d(R, xk5Var);
        kid.d(R, t7dVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = bad.b;
        if (readStrongBinder == null) {
            w9dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            w9dVar = queryLocalInterface instanceof had ? (had) queryLocalInterface : new w9d(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
        }
        T.recycle();
        return w9dVar;
    }

    public final pbd a0(eq7 eq7Var, xk5 xk5Var, xk5 xk5Var2) {
        pbd ebdVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, xk5Var);
        kid.d(R, xk5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = gbd.b;
        if (readStrongBinder == null) {
            ebdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            ebdVar = queryLocalInterface instanceof pbd ? (pbd) queryLocalInterface : new ebd(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
        }
        T.recycle();
        return ebdVar;
    }

    public final icd b0(String str, String str2, t7d t7dVar) {
        icd vbdVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        kid.d(R, t7dVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = ecd.b;
        if (readStrongBinder == null) {
            vbdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vbdVar = queryLocalInterface instanceof icd ? (icd) queryLocalInterface : new vbd(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
        }
        T.recycle();
        return vbdVar;
    }

    public final yje c0(eq7 eq7Var, t7d t7dVar, int i, int i2) {
        yje e8eVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, t7dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(nm7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = kee.b;
        if (readStrongBinder == null) {
            e8eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            e8eVar = queryLocalInterface instanceof yje ? (yje) queryLocalInterface : new e8e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return e8eVar;
    }

    public final yje d0(eq7 eq7Var, eq7 eq7Var2, t7d t7dVar, int i, int i2) {
        yje e8eVar;
        Parcel R = R();
        kid.d(R, eq7Var);
        kid.d(R, eq7Var2);
        kid.d(R, t7dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(nm7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = kee.b;
        if (readStrongBinder == null) {
            e8eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            e8eVar = queryLocalInterface instanceof yje ? (yje) queryLocalInterface : new e8e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return e8eVar;
    }
}
