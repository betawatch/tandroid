// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u9a implements oac, pac, qq7 {
    public final /* synthetic */ daa a;

    public /* synthetic */ u9a(daa daaVar) {
        this.a = daaVar;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        iq5 H0 = gm.H0(wzcVar, false);
        int i = H0.d;
        daa daaVar = this.a;
        daaVar.d0 = i;
        int i2 = H0.b;
        if (daaVar.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i2;
            ViewGroup.LayoutParams layoutParams = daaVar.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                daaVar.Q.setLayoutParams(layoutParams);
            }
        }
        eh0.e(daaVar.c, i2, i, gm.L(12.0f), daaVar.e0);
        return wzc.b;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.j0(c6cVar, view));
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.i0((c6c) obj);
    }
}
