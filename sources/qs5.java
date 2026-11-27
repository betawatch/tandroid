// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qs5 extends ClickableSpan {
    public final /* synthetic */ nx0[] a;
    public final /* synthetic */ TLRPC.TL_chatInviteImporter b;

    public qs5(nx0[] nx0VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.a = nx0VarArr;
        this.b = tL_chatInviteImporter;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(ProfileActivity.Q2(this.b.user_id));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
