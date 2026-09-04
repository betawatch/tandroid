package s6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = d0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = d0.l(parcel, readInt, k6.c.CREATOR);
            } else if (c10 == 2) {
                z11 = d0.n(parcel, readInt);
            } else if (c10 == 3) {
                str = d0.h(parcel, readInt);
            } else if (c10 != 4) {
                d0.y(parcel, readInt);
            } else {
                str2 = d0.h(parcel, readInt);
            }
        }
        d0.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
