// default package

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class zq {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) ar.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
