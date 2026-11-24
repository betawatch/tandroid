// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qwa extends ClickableSpan {
    public final /* synthetic */ my0[] a;
    public final /* synthetic */ long b;

    public qwa(my0[] my0VarArr, long j) {
        this.a = my0VarArr;
        this.b = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(yv1.ga(this.b));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
