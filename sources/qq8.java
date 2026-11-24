// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qq8 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new qq8());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        l46 l46Var = (l46) view;
        l46Var.setGravity(c4cVar.A);
        Object obj = c4cVar.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = c4cVar.H;
            zkb.X(l46Var, intValue, obj2 instanceof wjb ? (wjb) obj2 : null);
        } else {
            ykb ykbVar = zkb.a;
            l46Var.setTag(R.id.theme_bind, null);
            l46Var.setTextColor((int) c4cVar.C);
        }
        l46Var.setTextSize(1, c4cVar.B);
        l46Var.setTypeface(c4cVar.r ? gl.o() : null);
        int i = c4cVar.i;
        l46Var.setPadding(i, 0, i, c4cVar.k);
        l46Var.setText(c4cVar.m);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new s11(context, null, (byte) 7);
    }
}
