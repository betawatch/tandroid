// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class sb4 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ sb4(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                int i = this.b;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    File file = (File) arrayList.get(i2);
                    File file2 = new File(file.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        try {
                            if (!file2.delete()) {
                                file2.deleteOnExit();
                            }
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        try {
                            File file3 = new File(a.b.getCacheDir(), file.getName() + ".enc.key");
                            if (!file3.delete()) {
                                file3.deleteOnExit();
                            }
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                    } else if (file.exists()) {
                        try {
                            if (!file.delete()) {
                                file.deleteOnExit();
                            }
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                        }
                    }
                    try {
                        File file4 = new File(file.getParentFile(), "q_" + file.getName());
                        if (file4.exists() && !file4.delete()) {
                            file4.deleteOnExit();
                        }
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                }
                if (i == 2) {
                    fn5.z().f();
                    break;
                }
                break;
            default:
                oc7.r1(this.b).d4(this.c, true);
                break;
        }
    }

    public /* synthetic */ sb4(ArrayList arrayList, int i) {
        this.c = arrayList;
        this.b = i;
    }
}
