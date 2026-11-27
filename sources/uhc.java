// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class uhc implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        thc a;
        vhc vhcVar = (vhc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (vhcVar == null || (a = n2f.a(view, vhcVar)) == null) {
            return;
        }
        ArrayList arrayList = vhcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r89) a.a.b).add((my4) obj);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        thc thcVar;
        vhc vhcVar = (vhc) view.getTag(R.id.tag_view_on_post_draw_state);
        if (vhcVar == null || (thcVar = vhcVar.b) == null) {
            return;
        }
        ArrayList arrayList = vhcVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r89) thcVar.a.b).remove((my4) obj);
        }
        vhcVar.b = null;
    }
}
