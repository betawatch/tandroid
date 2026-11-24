// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class s70 {
    public static final Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void a(File file, ArrayList arrayList) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2, arrayList);
            } else if (!file2.getName().equals(".nomedia") && !a.contains(file2.getAbsolutePath())) {
                arrayList.add(new r70(file2));
            }
        }
    }

    public static void b(File file) {
        String absolutePath;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            return;
        }
        a.remove(absolutePath);
    }
}
