package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(13);
    public final k0 a;
    public final u0 b;
    public final h c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.a = k0Var;
        this.b = u0Var;
        this.c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e6) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e6);
                }
            }
            k0 k0Var = this.a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.e());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.e());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return b6.m.l(this.a, gVar.a) && b6.m.l(this.b, gVar.b) && b6.m.l(this.c, gVar.c) && b6.m.l(this.d, gVar.d) && b6.m.l(this.e, gVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return android.support.v4.media.a.o("AuthenticationExtensionsClientOutputs{", e().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.k(parcel, 2, this.b, i10);
        g5.k(parcel, 3, this.c, i10);
        g5.k(parcel, 4, this.d, i10);
        g5.l(parcel, 5, this.e);
        g5.r(parcel, q10);
    }
}
