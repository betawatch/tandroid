// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wwa extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new wwa());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        xwa xwaVar = (xwa) view;
        ImageView imageView = xwaVar.b;
        io ioVar = xwaVar.a;
        int i = xwaVar.c;
        int i2 = c6cVar.d;
        boolean z2 = i == i2;
        xwaVar.c = i2;
        ioVar.c(c6cVar.m, z2, true);
        cmb.u0(c6cVar.r ? cmb.n6 : cmb.F6);
        anb.U(ioVar, c6cVar.r ? cmb.n6 : cmb.F6, null);
        anb.s(imageView, c6cVar.r ? cmb.n6 : cmb.F6, null, PorterDuff.Mode.SRC_IN);
        if (z2) {
            imageView.animate().rotation(c6cVar.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(d53.h);
        } else {
            imageView.setRotation(c6cVar.f ? 0.0f : 180.0f);
        }
        xwaVar.d = z;
        xwaVar.setWillNotDraw(!z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new xwa(context);
    }
}
