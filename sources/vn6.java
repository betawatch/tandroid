// default package

import java.io.File;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vn6 extends File {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (f11.a) {
                    cc4.d("delete voice file (trimmed)");
                }
                break;
            default:
                if (f11.a) {
                    cc4.d("delete voice file (from resume)");
                }
                break;
        }
        return super.delete();
    }
}
