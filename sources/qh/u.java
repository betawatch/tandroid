package qh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        v vVar = this.a;
        TL_iv.RichMessage richMessage = vVar.e0;
        if (richMessage != null && richMessage != null) {
            vVar.e0 = null;
            vVar.b0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            z41 z41Var = vVar.V;
            if (z41Var != null) {
                z41Var.N(true);
            }
        }
        vVar.O();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
