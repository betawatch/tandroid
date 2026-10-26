package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class ha extends a8.a implements ja {
    public final ga V0(y6.b bVar, la laVar) {
        ga gaVar;
        Parcel N0 = N0();
        int i10 = x.a;
        N0.writeStrongBinder(bVar);
        N0.writeInt(1);
        laVar.writeToParcel(N0, 0);
        Parcel P0 = P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            gaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            gaVar = queryLocalInterface instanceof ga ? (ga) queryLocalInterface : new ga(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 11);
        }
        P0.recycle();
        return gaVar;
    }
}
