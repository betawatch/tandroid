package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
