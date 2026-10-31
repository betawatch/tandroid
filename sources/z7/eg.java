package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class eg extends a9.a {
    public final jg X0(x6.b bVar, bg bgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        jg createFromParcel = R0.readInt() == 0 ? null : jg.CREATOR.createFromParcel(R0);
        R0.recycle();
        return createFromParcel;
    }
}
