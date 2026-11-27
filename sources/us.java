// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class us implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ us(c0a c0aVar) {
        this.a = (byte) 3;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o.J(windowInsets);
            case 1:
                return tx0.c(view, windowInsets);
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                return j1a.e(view, windowInsets);
        }
    }

    public /* synthetic */ us(byte b) {
        this.a = b;
    }
}
