// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
