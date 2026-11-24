// default package

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v45 extends c20 {
    public final /* synthetic */ LaunchActivity E;
    public final /* synthetic */ h75 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v45(h75 h75Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = h75Var;
        this.E = launchActivity2;
    }

    @Override // c20
    public final TextView a() {
        TextView textView = new TextView(this.E);
        tb4.w(textView, bkb.Xg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new xf3((Object) this, (Object) textView, (byte) 20));
        return textView;
    }
}
