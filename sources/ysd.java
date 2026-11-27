// default package

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ysd {
    public static final jnd b = new jnd((byte) 1);
    public final ntd a;

    public ysd() {
        fvd fvdVar;
        try {
            fvdVar = (fvd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            fvdVar = b;
        }
        fvd[] fvdVarArr = {jnd.b, fvdVar};
        ntd ntdVar = new ntd();
        ntdVar.a = fvdVarArr;
        Charset charset = vnd.a;
        this.a = ntdVar;
    }
}
