// default package

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qv0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ow0) obj).r(view, windowInsets);
            case 1:
                return ((fx0) obj).V(windowInsets);
            default:
                return ((SecretMediaViewer) obj).f(windowInsets);
        }
    }
}
