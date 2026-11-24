// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u7a implements n8c, o8c, no7 {
    public final /* synthetic */ d8a a;

    public /* synthetic */ u7a(d8a d8aVar) {
        this.a = d8aVar;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        int i = H0.d;
        d8a d8aVar = this.a;
        d8aVar.d0 = i;
        int i2 = H0.b;
        if (d8aVar.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i2;
            ViewGroup.LayoutParams layoutParams = d8aVar.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                d8aVar.Q.setLayoutParams(layoutParams);
            }
        }
        dg0.e(d8aVar.c, i2, i, gl.L(12.0f), d8aVar.e0);
        return vxc.b;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.i0(c4cVar, view));
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.h0((c4c) obj);
    }
}
