// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uua extends qx0 {
    public ArrayList V1;
    public LimitPreviewView W1;

    public final void Z0(long j) {
        ArrayList arrayList = this.V1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.W1.k((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j, (TL_stars.StarGiftUpgradePrice) c00.g(1, arrayList));
    }
}
