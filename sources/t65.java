// default package

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t65 extends c30 {
    public final /* synthetic */ LaunchActivity E;
    public final /* synthetic */ g95 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t65(g95 g95Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = g95Var;
        this.E = launchActivity2;
    }

    @Override // c30
    public final TextView a() {
        TextView textView = new TextView(this.E);
        td4.x(textView, cmb.Xg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new tf3(this, textView, (byte) 21));
        return textView;
    }
}
