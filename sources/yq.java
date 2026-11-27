// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yq extends xq {
    @Override // xq, zq
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // zq
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
