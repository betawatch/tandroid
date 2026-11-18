package xf;

import android.view.View;
import c8.xd;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import ri.h;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar == null || (a10 = xd.a(view, cVar)) == null) {
            return;
        }
        ArrayList arrayList = cVar.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xe.b) a10.a.b).add((h) obj);
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xe.b) aVar.a.b).remove((h) obj);
        }
        cVar.b = null;
    }
}
