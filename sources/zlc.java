// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zlc extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new zlc());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((amc) view).a(c4cVar.k, c4cVar.m, c4cVar.n);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new amc(context, wjbVar);
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }

    @Override // b4c
    public final boolean g() {
        return true;
    }
}
