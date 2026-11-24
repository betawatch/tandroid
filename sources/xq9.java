// default package

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
