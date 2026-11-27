// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qya extends ClickableSpan {
    public final /* synthetic */ nx0[] a;
    public final /* synthetic */ long b;

    public qya(nx0[] nx0VarArr, long j) {
        this.a = nx0VarArr;
        this.b = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(zu1.ha(this.b));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
