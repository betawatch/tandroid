// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ss8 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ss8());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        l66 l66Var = (l66) view;
        l66Var.setGravity(c6cVar.A);
        Object obj = c6cVar.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = c6cVar.H;
            anb.X(l66Var, intValue, obj2 instanceof ylb ? (ylb) obj2 : null);
        } else {
            zmb zmbVar = anb.a;
            l66Var.setTag(R.id.theme_bind, null);
            l66Var.setTextColor((int) c6cVar.C);
        }
        l66Var.setTextSize(1, c6cVar.B);
        l66Var.setTypeface(c6cVar.r ? gm.o() : null);
        int i = c6cVar.i;
        l66Var.setPadding(i, 0, i, c6cVar.k);
        l66Var.setText(c6cVar.m);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new a31(context, null, (byte) 7);
    }
}
