package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class r6 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.e3[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public r6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.a = e3VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        nf.f.s(this.b, LocaleController.getString(this.c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
