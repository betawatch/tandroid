// default package

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qs3 extends a49 {
    public final ps3[] a = new ps3[4];
    public final ArrayList b = new ArrayList();

    @Override // a49
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        ps3 ps3Var = new ps3(recyclerView, i, new os3(this, (byte) 0));
        this.a[i] = ps3Var;
        return ps3Var;
    }

    public final float b(int i) {
        ps3 ps3Var = this.a[i];
        if (Build.VERSION.SDK_INT < 31 || ps3Var == null || ps3Var.isFinished()) {
            return 0.0f;
        }
        return ps3Var.getDistance();
    }
}
