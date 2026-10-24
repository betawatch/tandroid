package w7;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class z {
    public static n0.c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new n0.c(new n0.f(androidx.emoji2.text.w.f(configuration))) : n0.c.a(configuration.locale);
    }
}
