// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y72 extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ a82 f;

    public y72(a82 a82Var, Context context) {
        this.f = a82Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // y59
    public final void f() {
        super.f();
        this.f.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        Object obj;
        if (u69Var.f != 0) {
            return;
        }
        kz8 kz8Var = (kz8) u69Var.a;
        boolean z = i != b() + (-2);
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                obj = arrayList.get(i2);
                if (obj instanceof oz8) {
                    return;
                }
                oz8 oz8Var = (oz8) obj;
                kz8Var.a(oz8Var, this.e, z);
                kz8Var.d.a(this.f.x.contains(Integer.valueOf(oz8Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof oz8) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View kz8Var;
        Context context = this.c;
        if (i == 0) {
            kz8Var = new kz8(this.f.a, context, false);
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
