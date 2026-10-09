package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class e0 {
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
