// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wze extends b4 {
    public static final Parcelable.Creator<wze> CREATOR = new c0f((byte) 6);
    public final int a;
    public final Bundle b;

    public wze(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wze)) {
            return false;
        }
        wze wzeVar = (wze) obj;
        Bundle bundle = wzeVar.b;
        if (this.a != wzeVar.a) {
            return false;
        }
        Bundle bundle2 = this.b;
        if (bundle2 == null) {
            return bundle == null;
        }
        if (bundle == null || bundle2.size() != bundle.size()) {
            return false;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str) || !cqe.a(bundle2.getString(str), bundle.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.b(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
