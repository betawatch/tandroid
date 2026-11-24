// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class wze {
    public static vfc a(View view, xfc xfcVar) {
        vfc vfcVar = xfcVar.b;
        if (vfcVar != null) {
            return vfcVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            u36.j("Cannot add OnPostDrawListener to root view");
            return null;
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        vfc vfcVar2 = (vfc) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (vfcVar2 == null) {
            yc ycVar = new yc(viewGroup.getContext());
            vfc vfcVar3 = new vfc(ycVar);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, vfcVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(ycVar, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(ycVar, new ViewGroup.LayoutParams(1, 1));
            }
            vfcVar2 = vfcVar3;
        }
        xfcVar.b = vfcVar2;
        return vfcVar2;
    }
}
