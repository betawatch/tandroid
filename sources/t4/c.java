package t4;

import java.util.ArrayList;
import k7.y7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements j {
    public static final int[] b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        if (y7.b(i10, 0, 7, b) == -1 || arrayList.contains(Integer.valueOf(i10))) {
            return;
        }
        arrayList.add(Integer.valueOf(i10));
    }
}
