// default package

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rm3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public rm3(Context context, uec uecVar) {
        this.d = context.getApplicationContext();
        this.e = uecVar;
        this.c = 15000L;
        this.h = new vec();
        this.g = vgb.a;
    }

    public static rm3 c(pm3 pm3Var, t86 t86Var) {
        long nativeSessionNew;
        nm3 nm3Var = (nm3) pm3Var.b;
        long h = DictationAsr.h(nm3Var);
        if (h == 0) {
            return null;
        }
        rm3 rm3Var = new rm3(pm3Var, t86Var);
        String a = nm3Var.a((String) pm3Var.c);
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, a.split(",")[0], xea.o() == 0 ? 2 : 4);
        rm3Var.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return rm3Var;
        }
        DictationAsr.U(nm3Var);
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
        DictationAsr.U((nm3) this.e);
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
        t86 t86Var = (t86) this.f;
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
                            this.a = DictationAsr.w(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                            DictationAsr.m(sb2, jSONObject.optJSONArray("open"), null);
                            DictationAsr.m(sb2, jSONObject.optJSONArray("tail"), null);
                            this.h = sb2.toString();
                            z2 = true;
                        }
                    } else if (optString.equals("commit")) {
                        DictationAsr.m(sb, jSONObject.optJSONArray("words"), null);
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
            t86Var.w++;
            if (t86Var.g > sb3.length()) {
                t86Var.g = 0;
            }
            t86Var.h = sb3.length();
            t86Var.i = str2.isEmpty();
            String trim = sb3.substring(t86Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                hl.c3(new j61((Object) t86Var, t86Var.f, (Object) trim, z, (byte) 2));
                u86 u86Var = t86Var.x;
                long j = u86Var.f;
                u86Var.f = 1 + j;
                t86Var.f = j;
                t86Var.g = sb3.length();
                t86Var.q.reset();
                trim = "";
            }
            String p = DictationAsr.p(trim, str2, z5);
            if (!p.equals(t86Var.j)) {
                t86Var.j = p;
                boolean z6 = 0;
                hl.c3(new j61((Object) t86Var, t86Var.f, (Object) p, z6, (byte) 2));
                i = z6;
                this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
                if (z3 && ((String) this.h).isEmpty() && sb.length() > 0) {
                    sb.setLength(i);
                    t86Var.b();
                    t86Var.h = i;
                    t86Var.g = i;
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

    public rm3(pm3 pm3Var, t86 t86Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = pm3Var;
        this.e = (nm3) pm3Var.b;
        this.f = t86Var;
    }
}
