package z;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
