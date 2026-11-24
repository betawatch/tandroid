// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sua extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new sua());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        tua tuaVar = (tua) view;
        ImageView imageView = tuaVar.b;
        hn hnVar = tuaVar.a;
        int i = tuaVar.c;
        int i2 = c4cVar.d;
        boolean z2 = i == i2;
        tuaVar.c = i2;
        hnVar.c(c4cVar.m, z2, true);
        bkb.u0(c4cVar.r ? bkb.n6 : bkb.F6);
        zkb.U(hnVar, c4cVar.r ? bkb.n6 : bkb.F6, null);
        zkb.s(imageView, c4cVar.r ? bkb.n6 : bkb.F6, null, PorterDuff.Mode.SRC_IN);
        if (z2) {
            imageView.animate().rotation(c4cVar.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(s33.h);
        } else {
            imageView.setRotation(c4cVar.f ? 0.0f : 180.0f);
        }
        tuaVar.d = z;
        tuaVar.setWillNotDraw(!z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new tua(context);
    }
}
