// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
