package vh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v vVar = this.a;
        TL_iv.RichMessage richMessage = vVar.f0;
        if (richMessage != null && richMessage != null) {
            vVar.f0 = null;
            vVar.c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            w51 w51Var = vVar.W;
            if (w51Var != null) {
                w51Var.N(true);
            }
        }
        vVar.P();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
