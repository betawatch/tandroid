// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class z45 {
    public final long a;
    public final List b;
    public final long c;

    public z45(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("valid_until", 0L);
        this.a = optLong;
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (i < jSONArray.length()) {
            y45 y45Var = new y45(jSONArray.getJSONObject(i));
            long j2 = y45Var.e;
            long j3 = j + j2;
            if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(y45Var);
            i++;
            j = j3;
        }
        this.c = j;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String[] a() {
        List list = this.b;
        String[] strArr = new String[list.size() * 5];
        for (int i = 0; i < list.size(); i++) {
            y45 y45Var = (y45) list.get(i);
            int i2 = i * 5;
            strArr[i2] = y45Var.a;
            strArr[i2 + 1] = Long.toString(y45Var.e);
            strArr[i2 + 2] = y45Var.b;
            strArr[i2 + 3] = y45Var.c;
            strArr[i2 + 4] = y45Var.f ? "1" : "0";
        }
        return strArr;
    }
}
