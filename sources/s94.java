// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class s94 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ s94(int i, ArrayList arrayList) {
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
                            fa4.g(e, true);
                        }
                        try {
                            File file3 = new File(a.b.getCacheDir(), file.getName() + ".enc.key");
                            if (!file3.delete()) {
                                file3.deleteOnExit();
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                    } else if (file.exists()) {
                        try {
                            if (!file.delete()) {
                                file.deleteOnExit();
                            }
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                    }
                    try {
                        File file4 = new File(file.getParentFile(), "q_" + file.getName());
                        if (file4.exists() && !file4.delete()) {
                            file4.deleteOnExit();
                        }
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                    }
                }
                if (i == 2) {
                    fl5.z().f();
                    break;
                }
                break;
            default:
                na7.q1(this.b).b4(this.c, true);
                break;
        }
    }

    public /* synthetic */ s94(ArrayList arrayList, int i) {
        this.c = arrayList;
        this.b = i;
    }
}
