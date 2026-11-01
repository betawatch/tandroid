package w7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static nf.b a(View view, nf.d dVar) {
        nf.b bVar = dVar.b;
        if (bVar != null) {
            return bVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        nf.b bVar2 = (nf.b) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (bVar2 == null) {
            ih.c cVar = new ih.c(viewGroup.getContext(), 1);
            nf.b bVar3 = new nf.b(cVar);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, bVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(cVar, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(cVar, new ViewGroup.LayoutParams(1, 1));
            }
            bVar2 = bVar3;
        }
        dVar.b = bVar2;
        return bVar2;
    }
}
