// default package

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xq9 {
    public final wq9 a;

    public xq9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new vq9(nestedScrollView);
        } else {
            this.a = new o5f((byte) 25);
        }
    }
}
