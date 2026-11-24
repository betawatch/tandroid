// default package

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xwc extends efc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zwc b;

    public /* synthetic */ xwc(zwc zwcVar, byte b) {
        this.a = b;
        this.b = zwcVar;
    }

    @Override // dfc
    public final void c() {
        View view;
        byte b = this.a;
        zwc zwcVar = this.b;
        switch (b) {
            case 0:
                if (zwcVar.o && (view = zwcVar.g) != null) {
                    view.setTranslationY(0.0f);
                    zwcVar.d.setTranslationY(0.0f);
                }
                zwcVar.d.setVisibility(8);
                zwcVar.d.setTransitioning(false);
                zwcVar.s = null;
                tg2 tg2Var = zwcVar.k;
                if (tg2Var != null) {
                    tg2Var.O(zwcVar.j);
                    zwcVar.j = null;
                    zwcVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = zwcVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                zwcVar.s = null;
                zwcVar.d.requestLayout();
                break;
        }
    }
}
