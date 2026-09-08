package y8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(8);
    public final Uri a;
    public final HashMap b;
    public final byte[] c;

    public m(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        n6.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            n6.l.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.b = hashMap;
        this.c = bArr;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.c;
        sb2.append(",dataSz=".concat((bArr == null ? BuildConfig.BETA_URL : Integer.valueOf(bArr.length)).toString()));
        HashMap hashMap = this.b;
        sb2.append(", numAssets=" + hashMap.size());
        sb2.append(", uri=".concat(String.valueOf(this.a)));
        if (!isLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            sb2.append("\n    " + str + ": " + String.valueOf(hashMap.get(str)));
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        n6.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((x8.f) entry.getValue()));
        }
        w7.e0.b(parcel, 4, bundle);
        w7.e0.c(parcel, 5, this.c);
        w7.e0.r(parcel, q6);
    }
}
