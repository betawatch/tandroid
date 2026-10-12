package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class h0 {
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
