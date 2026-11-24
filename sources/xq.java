// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xq extends wq {
    @Override // wq, yq
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // yq
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
