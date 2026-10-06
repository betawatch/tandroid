package s6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = f0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = f0.l(parcel, readInt, k6.c.CREATOR);
            } else if (c10 == 2) {
                z11 = f0.n(parcel, readInt);
            } else if (c10 == 3) {
                str = f0.h(parcel, readInt);
            } else if (c10 != 4) {
                f0.y(parcel, readInt);
            } else {
                str2 = f0.h(parcel, readInt);
            }
        }
        f0.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
