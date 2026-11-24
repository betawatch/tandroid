// default package

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z32 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p42 b;

    public /* synthetic */ z32(p42 p42Var, byte b) {
        this.a = b;
        this.b = p42Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        p42 p42Var = this.b;
        i42 i42Var = (i42) obj;
        i42 i42Var2 = (i42) obj2;
        switch (b) {
            case 0:
                File file = i42Var.f;
                if (file != null) {
                    if (i42Var2.f == null) {
                        return 1;
                    }
                    boolean isDirectory = file.isDirectory();
                    if (isDirectory != i42Var2.f.isDirectory()) {
                        if (!isDirectory) {
                            return 1;
                        }
                    } else {
                        if (isDirectory || p42Var.d0) {
                            return i42Var.f.getName().compareToIgnoreCase(i42Var2.f.getName());
                        }
                        long lastModified = i42Var.f.lastModified();
                        long lastModified2 = i42Var2.f.lastModified();
                        if (lastModified == lastModified2) {
                            return 0;
                        }
                        if (lastModified <= lastModified2) {
                            return 1;
                        }
                    }
                }
                return -1;
            default:
                if (p42Var.d0) {
                    return i42Var.f.getName().compareToIgnoreCase(i42Var2.f.getName());
                }
                long lastModified3 = i42Var.f.lastModified();
                long lastModified4 = i42Var2.f.lastModified();
                if (lastModified3 == lastModified4) {
                    return 0;
                }
                return lastModified3 > lastModified4 ? -1 : 1;
        }
    }
}
