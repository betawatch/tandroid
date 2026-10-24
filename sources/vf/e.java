package vf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.h3;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class e {
    public static b a(View view, d dVar) {
        b bVar = dVar.b;
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
        b bVar2 = (b) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (bVar2 == null) {
            h3 h3Var = new h3(viewGroup.getContext());
            b bVar3 = new b(h3Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, bVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(h3Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(h3Var, new ViewGroup.LayoutParams(1, 1));
            }
            bVar2 = bVar3;
        }
        dVar.b = bVar2;
        return bVar2;
    }
}
