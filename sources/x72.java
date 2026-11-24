// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x72 extends m59 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ a82 x;

    public x72(a82 a82Var, Context context) {
        this.x = a82Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i = z8c.t0;
        this.s = i;
        this.w = context;
        arrayList.addAll(pz8.f(i).e());
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // m59
    public final int M(int i) {
        if (i == 0 || i == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // m59
    public final Object O(int i, int i2) {
        if (i != 0 && i2 >= 0) {
            ArrayList arrayList = this.r;
            if (i2 < arrayList.size()) {
                return arrayList.get(i2);
            }
        }
        return null;
    }

    @Override // m59
    public final View T(int i, View view) {
        return null;
    }

    @Override // m59
    public final boolean V(int i, int i2, u69 u69Var) {
        return (i == 0 || i == 2 || i2 >= this.r.size()) ? false : true;
    }

    @Override // m59
    public final void W(int i, int i2, u69 u69Var) {
        if (u69Var.f == 0) {
            kz8 kz8Var = (kz8) u69Var.a;
            Object O = O(i, i2);
            boolean z = true;
            if (i == 1 && i2 == M(i) - 1) {
                z = false;
            }
            if (O instanceof oz8) {
                oz8 oz8Var = (oz8) O;
                kz8Var.a(oz8Var, null, z);
                kz8Var.d.a(this.x.x.contains(Integer.valueOf(oz8Var.a)), false);
            }
        }
    }

    @Override // m59, y59
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(pz8.f(this.s).e());
        X(false);
        this.x.P();
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View kz8Var;
        Context context = this.w;
        if (i == 0) {
            kz8Var = new kz8(this.x.a, context, false);
        } else if (i != 1) {
            kz8Var = new View(context);
            kz8Var.setTag(-33024);
        } else {
            kz8Var = new View(context);
            kz8Var.setLayoutParams(new g69(-1, gm.L(56.0f)));
            kz8Var.setTag(-33024);
        }
        return new b59(kz8Var);
    }
}
