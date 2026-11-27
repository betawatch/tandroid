// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
