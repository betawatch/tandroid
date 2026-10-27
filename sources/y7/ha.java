package y7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
