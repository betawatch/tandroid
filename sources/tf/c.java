package tf;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
            ((pe.b) a2.a.b).add((ki.a) obj);
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
            ((pe.b) bVar.a.b).remove((ki.a) obj);
        }
        dVar.b = null;
    }
}
