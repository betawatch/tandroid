// default package

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yl3 {
    public final am3 a;
    public final vl3 b;
    public final String c;
    public final zf d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public cn3 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public yl3(am3 am3Var, xl3 xl3Var, zf zfVar) {
        this.a = am3Var;
        this.b = (vl3) xl3Var.b;
        this.c = (String) xl3Var.c;
        this.d = zfVar;
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
                                this.j = DictationAsr.v(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                                DictationAsr.l(sb, jSONObject.optJSONArray("open"), null);
                                this.i = sb.length();
                                DictationAsr.l(sb, jSONObject.optJSONArray("tail"), null);
                                this.h = sb.toString();
                                i = 1;
                            }
                        } else if (optString.equals("commit")) {
                            DictationAsr.l(this.e, jSONObject.optJSONArray("words"), this.f);
                            i = 1;
                        }
                    } else if (optString.equals("language")) {
                        String optString2 = jSONObject.optString("lang");
                        Log.d("Dictation", "tinyasr: language → " + optString2);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.n = DictationAsr.m(optString2);
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
        gl.d3(new ft(this, iArr, sb, str, z, i, runnable));
    }
}
