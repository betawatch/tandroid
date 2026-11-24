// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wfc implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        vfc a;
        xfc xfcVar = (xfc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (xfcVar == null || (a = wze.a(view, xfcVar)) == null) {
            return;
        }
        ArrayList arrayList = xfcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g79) a.a.b).add((jy4) obj);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vfc vfcVar;
        xfc xfcVar = (xfc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (xfcVar == null || (vfcVar = xfcVar.b) == null) {
            return;
        }
        ArrayList arrayList = xfcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g79) vfcVar.a.b).remove((jy4) obj);
        }
        xfcVar.b = null;
    }
}
