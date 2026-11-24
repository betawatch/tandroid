// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
