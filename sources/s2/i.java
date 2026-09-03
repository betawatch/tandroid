package s2;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends com.googlecode.mp4parser.a {
    public static final /* synthetic */ bb.b d;
    public static final /* synthetic */ bb.b e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        de.a aVar = new de.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override // com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = r2.b.d(byteBuffer);
        this.b = r2.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.c.add(r2.b.d(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(r2.c.d(this.a));
        byteBuffer.putInt((int) this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(r2.c.d((String) it.next()));
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return (this.c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        ai.x(de.a.b(d, this, this));
        sb.append(this.a);
        sb.append(";minorVersion=");
        ai.x(de.a.b(e, this, this));
        sb.append(this.b);
        for (String str : this.c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
