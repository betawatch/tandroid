// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z14 extends q7c {
    public z14(Context context, int i, jac jacVar, oac oacVar, ylb ylbVar) {
        super(context, i, -1, false, jacVar, oacVar, null, ylbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        if (view != null) {
            float L = gm.L(92.0f);
            float width = getWidth() - L;
            float x = view.getX();
            float width2 = view.getWidth() + x;
            int i = x < L ? (int) (x - L) : width2 > width ? (int) (width2 - width) : 0;
            if (i != 0) {
                gm.J(this, new wc7((Object) this, (Object) view, i, (byte) 28));
            }
        }
    }
}
