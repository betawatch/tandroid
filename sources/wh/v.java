package wh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        w wVar = this.a;
        TL_iv.RichMessage richMessage = wVar.f0;
        if (richMessage != null && richMessage != null) {
            wVar.f0 = null;
            wVar.c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            x51 x51Var = wVar.W;
            if (x51Var != null) {
                x51Var.N(true);
            }
        }
        wVar.P();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
