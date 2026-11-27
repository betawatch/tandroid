// default package

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qm3 {
    public final sm3 a;
    public final nm3 b;
    public final String c;
    public final bf d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public tn3 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public qm3(sm3 sm3Var, pm3 pm3Var, bf bfVar) {
        this.a = sm3Var;
        this.b = (nm3) pm3Var.b;
        this.c = (String) pm3Var.c;
        this.d = bfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int i;
        if (str == null || str.length() <= 2) {
            return;
        }
        int i2 = 0;
        try {
            JSONArray jSONArray = new JSONArray(str);
            i = 0;
            while (i2 < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
                    int hashCode = optString.hashCode();
                    if (hashCode != -1613589672) {
                        if (hashCode != -1354815177) {
                            if (hashCode == -792934015 && optString.equals("partial")) {
                                StringBuilder sb = new StringBuilder();
                                this.j = DictationAsr.w(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                                DictationAsr.m(sb, jSONObject.optJSONArray("open"), null);
                                this.i = sb.length();
                                DictationAsr.m(sb, jSONObject.optJSONArray("tail"), null);
                                this.h = sb.toString();
                                i = 1;
                            }
                        } else if (optString.equals("commit")) {
                            DictationAsr.m(this.e, jSONObject.optJSONArray("words"), this.f);
                            i = 1;
                        }
                    } else if (optString.equals("language")) {
                        String optString2 = jSONObject.optString("lang");
                        Log.d("Dictation", "tinyasr: language → " + optString2);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.n = DictationAsr.n(optString2);
                        }
                    }
                    i2++;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    Log.e("Dictation", "tinyasr: unreadable events (" + str.length() + " chars)", e);
                    i = i2;
                    if (i == 0) {
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (i == 0) {
            b(null);
        }
    }

    public final void b(Runnable runnable) {
        String sb = this.e.toString();
        String str = this.h;
        boolean z = this.j;
        int i = this.i;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        hl.c3(new et(this, iArr, sb, str, z, i, runnable));
    }
}
