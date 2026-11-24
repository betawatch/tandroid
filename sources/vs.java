// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vs implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ vs(jw9 jw9Var) {
        this.a = (byte) 3;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o.J(windowInsets);
            case 1:
                return lx0.c(view, windowInsets);
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                return px9.e(view, windowInsets);
        }
    }

    public /* synthetic */ vs(byte b) {
        this.a = b;
    }
}
