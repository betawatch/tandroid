package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static o6.b a(byte[] bArr, Parcelable.Creator creator) {
        n6.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        o6.b bVar = (o6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
