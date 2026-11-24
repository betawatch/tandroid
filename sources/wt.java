// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ wt(ly9 ly9Var) {
        this.a = (byte) 3;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o.J(windowInsets);
            case 1:
                return sy0.c(view, windowInsets);
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                return rz9.e(view, windowInsets);
        }
    }

    public /* synthetic */ wt(byte b) {
        this.a = b;
    }
}
