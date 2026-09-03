package vh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            w51 w51Var = wVar.W;
            if (w51Var != null) {
                w51Var.N(true);
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
