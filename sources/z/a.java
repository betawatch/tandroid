package z;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
