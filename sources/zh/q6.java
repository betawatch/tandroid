package zh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class q6 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public q6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.a = f3VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        of.f.s(this.b, LocaleController.getString(this.c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
