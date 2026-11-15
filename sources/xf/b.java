package xf;

import android.view.View;
import c8.ud;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import ri.h;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a a10;
        c cVar = (c) view.getTag(R.id.tag_view_on_post_draw_state);
        if (cVar == null || (a10 = ud.a(view, cVar)) == null) {
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
