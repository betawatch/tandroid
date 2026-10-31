package rh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h7 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public h7(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, boolean z10) {
        this.a = z2VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        gf.f.r(this.b, cd.L0(this.c ? 2131744945 : 2131744942, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
