// default package

import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rn6 extends File {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn6(File file, String str, byte b) {
        super(file, str);
        this.a = b;
    }

    @Override // java.io.File
    public final boolean delete() {
        switch (this.a) {
            case 0:
                if (e21.a) {
                    fc4.d("delete voice file (trimmed)");
                }
                break;
            default:
                if (e21.a) {
                    fc4.d("delete voice file (from resume)");
                }
                break;
        }
        return super.delete();
    }
}
