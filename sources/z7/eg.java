package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
