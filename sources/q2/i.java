package q2;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends com.googlecode.mp4parser.a {
    public static final /* synthetic */ zd.b d;
    public static final /* synthetic */ zd.b e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        zd.a aVar = new zd.a(i.class, "FileTypeBox.java");
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
        for (int i9 = 0; i9 < remaining; i9++) {
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
        j2.t(zd.a.b(d, this, this));
        sb2.append(this.a);
        sb2.append(";minorVersion=");
        j2.t(zd.a.b(e, this, this));
        sb2.append(this.b);
        for (String str : this.c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
