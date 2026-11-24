// default package

import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pl6 extends File {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (w01.a) {
                    fa4.d("delete voice file (trimmed)");
                }
                break;
            default:
                if (w01.a) {
                    fa4.d("delete voice file (from resume)");
                }
                break;
        }
        return super.delete();
    }
}
