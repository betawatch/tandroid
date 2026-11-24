// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class uce {
    public static int a(int i) {
        if (i >= 100 || i < 0) {
            return i;
        }
        if (ize.G == null) {
            ize.G = new ize((byte) 15);
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", ir2.n(2, 0, String.valueOf(Calendar.getInstance().get(1))), Integer.valueOf(i)));
    }
}
