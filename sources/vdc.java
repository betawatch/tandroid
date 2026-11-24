// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class vdc implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        udc a;
        wdc wdcVar = (wdc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (wdcVar == null || (a = uxe.a(view, wdcVar)) == null) {
            return;
        }
        ArrayList arrayList = wdcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e59) a.a.b).add((hw4) obj);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        udc udcVar;
        wdc wdcVar = (wdc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (wdcVar == null || (udcVar = wdcVar.b) == null) {
            return;
        }
        ArrayList arrayList = wdcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e59) udcVar.a.b).remove((hw4) obj);
        }
        wdcVar.b = null;
    }
}
