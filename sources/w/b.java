package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);
    public final Bundle a;

    public b(Object obj) {
        ArrayMap arrayMap = g.a;
        String i9 = g.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i9));
        }
        this.a = g.o(obj, i9, new e(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = g.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            String str = (String) g.b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return g.f(bundle, new e(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeBundle(this.a);
    }

    public b(Bundle bundle) {
        this.a = bundle;
    }
}
