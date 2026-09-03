package ph;

import android.content.Context;
import android.view.View;
import oh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a extends d81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nr0 b;

    public a(nr0 nr0Var, Context context) {
        this.b = nr0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        l lVar = (l) view;
        nr0 nr0Var = this.b;
        d6 d6Var = i10 == 0 ? nr0Var.e : (d6) nr0Var.f.get(i10 - 1);
        d6Var.H(null);
        lVar.setList(d6Var);
        lVar.setVisibleHeight(nr0Var.v);
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        return new l(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.d81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.d81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = v31.D(((d6) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
