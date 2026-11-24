// default package

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class x84 {
    public static x84 e;
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;
    public Object d;

    public x84(Context context) {
        this.d = context;
    }

    public static x84 c() {
        x84 x84Var = e;
        if (x84Var != null) {
            return x84Var;
        }
        x84 x84Var2 = new x84();
        e = x84Var2;
        return x84Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y84 a() {
        boolean z;
        v0e v0eVar = new v0e();
        boolean z2 = this.c;
        v0eVar.a = z2 ? 1 : 0;
        boolean z3 = this.a;
        v0eVar.b = z3 ? 1 : 0;
        boolean z4 = false;
        v0eVar.c = 0;
        v0eVar.d = false;
        v0eVar.e = this.b;
        v0eVar.f = -1.0f;
        if (z2 == 2 || z3 != 2) {
            z = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (v0eVar.b == 2 && v0eVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z4 = z;
        }
        if (z4) {
            return new y84(new ldd((Context) this.d, v0eVar));
        }
        u36.j("Invalid build options");
        return null;
    }

    public final ivc b(String str) {
        d();
        ivc ivcVar = (ivc) ((HashMap) this.d).get(str);
        if (ivcVar == null) {
            return null;
        }
        ivcVar.a = Math.max(ivcVar.a, System.currentTimeMillis());
        e();
        return ivcVar;
    }

    public final void d() {
        if (this.a || this.b) {
            return;
        }
        this.b = true;
        if (((HashMap) this.d) == null) {
            this.d = new HashMap();
        }
        Utilities.e.c(new fvc(this, (byte) 1));
    }

    public final void e() {
        byte b = 0;
        gm.r(new fvc(this, b));
        if (this.c) {
            return;
        }
        fvc fvcVar = new fvc(this, b);
        boolean z = e21.a;
        gm.d3(fvcVar, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
