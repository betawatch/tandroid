// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class urb extends h2 {
    public static final /* synthetic */ xh4 f;
    public static final /* synthetic */ xh4 h;
    public List e;

    static {
        u84 u84Var = new u84(urb.class, "TimeToSampleBox.java");
        u84Var.e(u84Var.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f = u84Var.e(u84Var.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
    }

    @Override // h2, z1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new trb(zpe.g(byteBuffer), zpe.g(byteBuffer)));
        }
    }

    @Override // h2, z1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (trb trbVar : this.e) {
            byteBuffer.putInt((int) trbVar.a);
            byteBuffer.putInt((int) trbVar.b);
        }
    }

    @Override // z1
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }

    public final String toString() {
        lyc b = u84.b(h, this, this);
        zb9.a().getClass();
        zb9.b(b);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
