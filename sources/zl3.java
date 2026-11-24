// default package

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zl3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public zl3(Context context, uac uacVar) {
        this.d = context.getApplicationContext();
        this.e = uacVar;
        this.c = 15000L;
        this.h = new vac();
        this.g = adb.a;
    }

    public static zl3 c(xl3 xl3Var, p66 p66Var) {
        long nativeSessionNew;
        vl3 vl3Var = (vl3) xl3Var.b;
        long h = DictationAsr.h(vl3Var);
        if (h == 0) {
            return null;
        }
        zl3 zl3Var = new zl3(xl3Var, p66Var);
        String a = vl3Var.a((String) xl3Var.c);
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, a.split(",")[0], gba.o() == 0 ? 2 : 4);
        zl3Var.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return zl3Var;
        }
        DictationAsr.S(vl3Var);
        return null;
    }

    public final void a() {
        String nativeSessionFinish;
        long j = this.c;
        if (j == 0) {
            return;
        }
        nativeSessionFinish = DictationAsr.nativeSessionFinish(j);
        b(nativeSessionFinish);
        DictationAsr.nativeSessionFree(this.c);
        this.c = 0L;
        DictationAsr.S((vl3) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        p66 p66Var = (p66) this.f;
        StringBuilder sb = (StringBuilder) this.g;
        if (str == null || str.length() <= 2) {
            return;
        }
        boolean z4 = this.b;
        try {
            JSONArray jSONArray = new JSONArray(str);
            z2 = false;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
                    int hashCode = optString.hashCode();
                    z = true;
                    if (hashCode != -1354815177) {
                        if (hashCode != -792934015) {
                            if (hashCode == 100619) {
                                try {
                                    if (optString.equals("eou") && jSONObject.optDouble("p") > 0.5d) {
                                        z4 = true;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("Dictation", "tinyasr: unreadable events (" + str.length() + " chars)", e);
                                    z3 = z4;
                                    if (z2) {
                                    }
                                    i = 0;
                                    this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
                                    if (z3) {
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (optString.equals("partial")) {
                            StringBuilder sb2 = new StringBuilder();
                            this.a = DictationAsr.v(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                            DictationAsr.l(sb2, jSONObject.optJSONArray("open"), null);
                            DictationAsr.l(sb2, jSONObject.optJSONArray("tail"), null);
                            this.h = sb2.toString();
                            z2 = true;
                        }
                    } else if (optString.equals("commit")) {
                        DictationAsr.l(sb, jSONObject.optJSONArray("words"), null);
                        z2 = true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
            }
            z = true;
        } catch (Exception e3) {
            e = e3;
            z = true;
            z2 = false;
        }
        z3 = z4;
        if (z2) {
            String sb3 = sb.toString();
            String str2 = (String) this.h;
            boolean z5 = this.a;
            p66Var.w++;
            if (p66Var.g > sb3.length()) {
                p66Var.g = 0;
            }
            p66Var.h = sb3.length();
            p66Var.i = str2.isEmpty();
            String trim = sb3.substring(p66Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                gl.c3(new b61((Object) p66Var, p66Var.f, (Object) trim, z, (byte) 2));
                q66 q66Var = p66Var.x;
                long j = q66Var.f;
                q66Var.f = 1 + j;
                p66Var.f = j;
                p66Var.g = sb3.length();
                p66Var.q.reset();
                trim = "";
            }
            String o = DictationAsr.o(trim, str2, z5);
            if (!o.equals(p66Var.j)) {
                p66Var.j = o;
                boolean z6 = 0;
                gl.c3(new b61((Object) p66Var, p66Var.f, (Object) o, z6, (byte) 2));
                i = z6;
                this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
                if (z3 && ((String) this.h).isEmpty() && sb.length() > 0) {
                    sb.setLength(i);
                    p66Var.b();
                    p66Var.h = i;
                    p66Var.g = i;
                    return;
                }
                return;
            }
        }
        i = 0;
        this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
        if (z3) {
        }
    }

    public zl3(xl3 xl3Var, p66 p66Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = xl3Var;
        this.e = (vl3) xl3Var.b;
        this.f = p66Var;
    }
}
