// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yr2 extends g2 {
    public static final /* synthetic */ ai4 f;
    public List e;

    static {
        i94 i94Var = new i94(yr2.class, "CompositionTimeToSample.java");
        i94Var.e(i94Var.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f = i94Var.e(i94Var.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override // g2, y1
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new xr2(psd.a(jne.g(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // g2, y1
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (xr2 xr2Var : this.e) {
            byteBuffer.putInt(xr2Var.a);
            byteBuffer.putInt(xr2Var.b);
        }
    }

    @Override // y1
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }
}
