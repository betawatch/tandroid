// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x62 extends zh8 {
    public final /* synthetic */ t20 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(t20 t20Var, Context context, int i) {
        super(context, i, null, null);
        this.G = t20Var;
    }

    @Override // zh8
    public final void h(qy qyVar, ActionMode actionMode) {
        if (qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                zu1.E6(menu, ((zu1) ((a72) this.G.e).b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override // zh8
    public final void j(boolean z) {
        ((a72) this.G.e).a0(this, z);
    }

    @Override // zh8
    public final void k(zh8 zh8Var) {
        ((a72) this.G.e).b0(zh8Var);
    }

    @Override // zh8
    public final void l(qy qyVar) {
        ((a72) this.G.e).b.d1(qyVar, true);
    }
}
