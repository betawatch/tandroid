// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ui9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new ui9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((wi9) view).d((lk0) c4cVar.H, (ti9) c4cVar.I, c4cVar.s);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        wi9 wi9Var = new wi9(context, wjbVar);
        wi9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return wi9Var;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
