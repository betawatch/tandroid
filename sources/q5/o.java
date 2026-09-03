package q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import j7.f5;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] h;
    public String n;
    public JSONObject r;

    public o(MediaInfo mediaInfo, int i10, boolean z4, double d, double d10, double d11, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i10;
        this.c = z4;
        this.d = d;
        this.e = d10;
        this.f = d11;
        this.h = jArr;
        this.n = str;
        if (str == null) {
            this.r = null;
            return;
        }
        try {
            this.r = new JSONObject(this.n);
        } catch (JSONException unused) {
            this.r = null;
            this.n = null;
        }
    }

    public final boolean e(JSONObject jSONObject) {
        boolean z4;
        long[] jArr;
        boolean z10;
        int i10;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z4 = true;
        } else {
            z4 = false;
        }
        if (jSONObject.has("itemId") && this.b != (i10 = jSONObject.getInt("itemId"))) {
            this.b = i10;
            z4 = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.c = z10;
            z4 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z4 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z4 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f) > 1.0E-7d) {
                this.f = d10;
                z4 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = jSONArray.getLong(i11);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.h[i12] == jArr[i12]) {
                    }
                }
            }
            z11 = true;
            break;
        } else {
            jArr = null;
        }
        if (z11) {
            this.h = jArr;
            z4 = true;
        }
        if (!jSONObject.has("customData")) {
            return z4;
        }
        this.r = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.r;
        boolean z4 = jSONObject == null;
        JSONObject jSONObject2 = oVar.r;
        if (z4 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || i6.c.a(jSONObject, jSONObject2)) && u5.a.d(this.a, oVar.a) && this.b == oVar.b && this.c == oVar.c && ((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f == oVar.f && Arrays.equals(this.h, oVar.h);
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.e());
            }
            int i10 = this.b;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.r;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.a, i10);
        int i11 = this.b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z4 = this.c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        double d = this.d;
        f5.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.e;
        f5.s(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f;
        f5.s(parcel, 7, 8);
        parcel.writeDouble(d11);
        f5.j(parcel, 8, this.h);
        f5.l(parcel, 9, this.n);
        f5.r(parcel, q10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        e(jSONObject);
    }
}
