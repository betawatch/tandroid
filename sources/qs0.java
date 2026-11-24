// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qs0 extends oec {
    public final rs0[] a = new rs0[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ s39 c;
    public final /* synthetic */ ss0 d;

    public qs0(ss0 ss0Var, Context context, s39 s39Var) {
        this.d = ss0Var;
        this.b = context;
        this.c = s39Var;
    }

    @Override // oec
    public final void b(View view, int i, int i2) {
        this.c.L(view);
    }

    @Override // oec
    public final View d(int i) {
        rs0[] rs0VarArr = this.a;
        if (rs0VarArr[i] == null) {
            rs0VarArr[i] = new rs0(this.d, this.b, i);
        }
        return rs0VarArr[i];
    }

    @Override // oec
    public final int e() {
        return this.a.length;
    }

    @Override // oec
    public final CharSequence g(int i) {
        return k96.M0(i == 1 ? 2131744682 : i == 2 ? 2131744681 : 2131744683, null);
    }

    @Override // oec
    public final int h(int i) {
        return i;
    }
}
