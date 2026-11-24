// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vpb extends g2 {
    public static final /* synthetic */ ai4 f;
    public static final /* synthetic */ ai4 h;
    public List e;

    static {
        i94 i94Var = new i94(vpb.class, "TimeToSampleBox.java");
        i94Var.e(i94Var.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f = i94Var.e(i94Var.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new upb(jne.g(byteBuffer), jne.g(byteBuffer)));
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (upb upbVar : this.e) {
            byteBuffer.putInt((int) upbVar.a);
            byteBuffer.putInt((int) upbVar.b);
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }

    public final String toString() {
        xvc b = i94.b(h, this, this);
        pa9.a().getClass();
        pa9.b(b);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
