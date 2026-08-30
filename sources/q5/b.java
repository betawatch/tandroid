package q5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z4, String[] strArr, boolean z10, boolean z11) {
        this.a = j10;
        this.b = str;
        this.c = j11;
        this.d = z4;
        this.e = strArr;
        this.f = z10;
        this.h = z11;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            long j10 = this.a;
            Pattern pattern = u5.a.a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put("duration", this.c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return u5.a.d(this.b, bVar.b) && this.a == bVar.a && this.c == bVar.c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f == bVar.f && this.h == bVar.h;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.m(parcel, 6, this.e);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f5.r(parcel, q10);
    }
}
