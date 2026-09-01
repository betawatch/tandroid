package ph;

import android.content.Context;
import android.view.View;
import oh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.w31;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a extends e81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ or0 b;

    public a(or0 or0Var, Context context) {
        this.b = or0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        l lVar = (l) view;
        or0 or0Var = this.b;
        d6 d6Var = i10 == 0 ? or0Var.e : (d6) or0Var.f.get(i10 - 1);
        d6Var.H(null);
        lVar.setList(d6Var);
        lVar.setVisibleHeight(or0Var.v);
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        return new l(this.b, this.a);
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return this.b.f.size() + 1;
    }

    @Override // org.telegram.ui.Components.e81
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.b.f.get(i10 - 1)).E.hashCode();
    }

    @Override // org.telegram.ui.Components.e81
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = w31.D(((d6) this.b.f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
