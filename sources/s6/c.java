package s6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z10 = e0.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = e0.l(parcel, readInt, k6.c.CREATOR);
            } else if (c10 == 2) {
                z11 = e0.n(parcel, readInt);
            } else if (c10 == 3) {
                str = e0.h(parcel, readInt);
            } else if (c10 != 4) {
                e0.y(parcel, readInt);
            } else {
                str2 = e0.h(parcel, readInt);
            }
        }
        e0.m(parcel, z10);
        return new a(arrayList, z11, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
