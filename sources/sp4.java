// default package

import android.text.TextUtils;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sp4 implements nf3 {
    public final a6 a;
    public final s95 b;

    public sp4(a6 a6Var, GroupCallMessage groupCallMessage) {
        s95 s95Var = new s95(a6Var.getContext());
        this.b = s95Var;
        s95Var.setBackgroundColor(on2.p(-16777216, 34));
        xna xnaVar = s95Var.w;
        xnaVar.setMaxLines(1);
        xnaVar.setSingleLine(true);
        xnaVar.setEllipsize(TextUtils.TruncateAt.END);
        s95Var.set(groupCallMessage);
        s95Var.setAlpha(0.0f);
        this.a = a6Var;
        a6Var.addView(s95Var);
    }

    @Override // nf3
    public final void a() {
        this.a.removeView(this.b);
    }
}
