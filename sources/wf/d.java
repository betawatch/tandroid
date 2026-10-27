package wf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.h3;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class d {
    public static a a(View view, c cVar) {
        a aVar = cVar.b;
        if (aVar != null) {
            return aVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        a aVar2 = (a) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (aVar2 == null) {
            h3 h3Var = new h3(viewGroup.getContext());
            a aVar3 = new a(h3Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, aVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(h3Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(h3Var, new ViewGroup.LayoutParams(1, 1));
            }
            aVar2 = aVar3;
        }
        cVar.b = aVar2;
        return aVar2;
    }
}
