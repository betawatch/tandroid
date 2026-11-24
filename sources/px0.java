// default package

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class px0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public o J;
    public or0 K;
    public boolean L;
    public quc a;
    public cv0 b;
    public m c;
    public Object d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public float k = Float.MAX_VALUE;
    public boolean l = true;
    public Bitmap m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public kp w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            cv0 cv0Var = this.b;
            if (cv0Var != null) {
                cv0Var.destroy();
                this.b = null;
            }
            o oVar = this.J;
            if (oVar != null) {
                oVar.p();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? k96.M0(2131742663, null) : this.E;
        }
        quc qucVar = this.a;
        return qucVar == null ? "" : qucVar.g == 6 ? qucVar.e : l7c.q(na7.q1(qucVar.a).V1(Long.valueOf(this.a.c)));
    }
}
