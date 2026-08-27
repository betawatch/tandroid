package q2;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends com.googlecode.mp4parser.a {
    public static final /* synthetic */ ae.b d;
    public static final /* synthetic */ ae.b e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        ae.a aVar = new ae.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override // com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = p2.b.d(byteBuffer);
        this.b = p2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.c.add(p2.b.d(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(p2.c.d(this.a));
        byteBuffer.putInt((int) this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(p2.c.d((String) it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        pa.u(ae.a.b(d, this, this));
        sb2.append(this.a);
        sb2.append(";minorVersion=");
        pa.u(ae.a.b(e, this, this));
        sb2.append(this.b);
        for (String str : this.c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
