// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vjb {
    public String a = "";
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public float k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public akb p;
    public zjb q;
    public float r;
    public ArrayList s;
    public TLRPC.WallPaper t;

    public final void a() {
        a.b.getSharedPreferences("themeconfig", 0).edit().remove(b()).commit();
        sqc.e(this.a).delete();
        sqc.e(this.b).delete();
    }

    public final String b() {
        zjb zjbVar = this.q;
        akb akbVar = this.p;
        if (zjbVar == null) {
            return b00.j(new StringBuilder(), akbVar.a, "_owp");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(akbVar.a);
        sb.append("_");
        return de9.l(sb, this.q.a, "_owp");
    }

    public final void c() {
        try {
            String b = b();
            SharedPreferences.Editor edit = a.b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.a);
            jSONObject.put("owall", this.b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f);
            jSONObject.put("pGrColor3", this.g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.i);
            jSONObject.put("wMotion", this.j);
            jSONObject.put("pIntensity", this.k);
            edit.putString(b, jSONObject.toString());
            edit.commit();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }
}
