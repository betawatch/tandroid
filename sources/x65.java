// default package

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x65 extends d20 {
    public final /* synthetic */ LaunchActivity E;
    public final /* synthetic */ j95 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x65(j95 j95Var, LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity);
        this.F = j95Var;
        this.E = launchActivity2;
    }

    @Override // d20
    public final TextView a() {
        TextView textView = new TextView(this.E);
        qd4.w(textView, aob.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new je3(this, textView, (byte) 23));
        return textView;
    }
}
