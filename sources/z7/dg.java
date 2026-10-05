package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class dg extends a9.a {
    public final ig W0(x6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel Q0 = Q0(obtain, 3);
        ig createFromParcel = Q0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(Q0);
        Q0.recycle();
        return createFromParcel;
    }
}
