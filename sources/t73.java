// default package

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t73 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ o83 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t73(o83 o83Var, byte b) {
        super(0);
        this.b = b;
        this.c = o83Var;
    }

    @Override // sr4
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ed4) this.c.j.getValue()).c;
            default:
                bd4 bd4Var = this.c.a;
                File canonicalFile = ((File) bd4Var.c.invoke()).getCanonicalFile();
                synchronized (bd4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = bd4.d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new ed4(canonicalFile, bd4Var.a, (nr5) bd4Var.b.invoke(canonicalFile), new ad4(canonicalFile, (byte) 0));
        }
    }
}
