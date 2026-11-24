// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class uxe {
    public static udc a(View view, wdc wdcVar) {
        udc udcVar = wdcVar.b;
        if (udcVar != null) {
            return udcVar;
        }
        View rootView = view.getRootView();
        if (view == rootView) {
            w26.j("Cannot add OnPostDrawListener to root view");
            return null;
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        udc udcVar2 = (udc) viewGroup.getTag(R.id.tag_view_on_post_draw_root_state);
        if (udcVar2 == null) {
            rj4 rj4Var = new rj4(viewGroup.getContext());
            udc udcVar3 = new udc(rj4Var);
            viewGroup.setTag(R.id.tag_view_on_post_draw_root_state, udcVar3);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(rj4Var, new FrameLayout.LayoutParams(1, 1, 17));
            } else {
                viewGroup.addView(rj4Var, new ViewGroup.LayoutParams(1, 1));
            }
            udcVar2 = udcVar3;
        }
        wdcVar.b = udcVar2;
        return udcVar2;
    }
}
