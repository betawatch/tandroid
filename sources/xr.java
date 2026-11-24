// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xr extends wr {
    @Override // wr, yr
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // yr
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
