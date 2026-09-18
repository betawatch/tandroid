package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class f0 {
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
