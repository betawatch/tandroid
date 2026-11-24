// default package

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zb2 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ ac2 b;

    public zb2(ac2 ac2Var, TLRPC.User user) {
        this.b = ac2Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        rc2 rc2Var = this.b.a;
        mc2 mc2Var = rc2Var.eb;
        if (mc2Var != null) {
            mc2Var.W(rc2Var, this.a, 0.0f, 0.0f);
        }
    }
}
