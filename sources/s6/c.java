package s6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = g0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z11 = false;
        String str2 = null;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = g0.l(parcel, readInt, k6.c.CREATOR);
            } else if (c10 == 2) {
                z11 = g0.n(parcel, readInt);
            } else if (c10 == 3) {
                str2 = g0.h(parcel, readInt);
            } else if (c10 != 4) {
                g0.y(parcel, readInt);
            } else {
                str = g0.h(parcel, readInt);
            }
        }
        g0.m(parcel, z10);
        return new a(arrayList, z11, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
