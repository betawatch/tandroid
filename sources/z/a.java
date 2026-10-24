package z;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class a {
    public static int a() {
        ClassLoader classLoader = a.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException("Car API level file car-app-api.level not found");
        }
        try {
            String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int parseInt = Integer.parseInt(readLine);
            if (parseInt >= 1 && parseInt <= 7) {
                return parseInt;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + readLine);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
