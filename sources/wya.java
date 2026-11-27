// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wya extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new wya());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        xya xyaVar = (xya) view;
        ImageView imageView = xyaVar.b;
        in inVar = xyaVar.a;
        int i = xyaVar.c;
        int i2 = b8cVar.d;
        boolean z2 = i == i2;
        xyaVar.c = i2;
        inVar.c(b8cVar.m, z2, true);
        aob.u0(b8cVar.r ? aob.o6 : aob.G6);
        yob.U(inVar, b8cVar.r ? aob.o6 : aob.G6, null);
        yob.s(imageView, b8cVar.r ? aob.o6 : aob.G6, null, PorterDuff.Mode.SRC_IN);
        if (z2) {
            imageView.animate().rotation(b8cVar.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(k43.h);
        } else {
            imageView.setRotation(b8cVar.f ? 0.0f : 180.0f);
        }
        xyaVar.d = z;
        xyaVar.setWillNotDraw(!z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new xya(context);
    }
}
