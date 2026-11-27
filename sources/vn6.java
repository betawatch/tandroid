// default package

import java.io.File;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
