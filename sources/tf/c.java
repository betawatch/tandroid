package tf;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        b a2;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar == null || (a2 = e.a(view, dVar)) == null) {
            return;
        }
        ArrayList arrayList = dVar.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((pe.b) a2.a.b).add((li.c) obj);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b bVar;
        d dVar = (d) view.getTag(R.id.tag_view_on_post_draw_state);
        if (dVar == null || (bVar = dVar.b) == null) {
            return;
        }
        ArrayList arrayList = dVar.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((pe.b) bVar.a.b).remove((li.c) obj);
        }
        dVar.b = null;
    }
}
