package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class s {
    public static r a;

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static synchronized q c(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (a == null) {
                    a = new r(0);
                }
                qVar = (q) a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
