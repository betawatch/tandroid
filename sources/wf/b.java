package wf;

import android.view.View;
import java.util.ArrayList;
import oi.h;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a a2;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar == null || (a2 = d.a(view, cVar)) == null) {
            return;
        }
        ArrayList arrayList = cVar.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((se.b) a2.a.b).add((h) obj);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a aVar;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar == null || (aVar = cVar.b) == null) {
            return;
        }
        ArrayList arrayList = cVar.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((se.b) aVar.a.b).remove((h) obj);
        }
        cVar.b = null;
    }
}
