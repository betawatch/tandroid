package s2;

import androidx.biometric.f0;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends com.googlecode.mp4parser.c {
    public static final /* synthetic */ f0 B;
    public static final /* synthetic */ f0 C;
    public static final /* synthetic */ f0 w;
    public static final /* synthetic */ f0 x;
    public static final /* synthetic */ f0 y;
    public String e;
    public String f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public long v;

    static {
        de.a aVar = new de.a(j.class, "HandlerBox.java");
        w = aVar.e(aVar.d("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        x = aVar.e(aVar.d("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "void"));
        y = aVar.e(aVar.d("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "void"));
        B = aVar.e(aVar.d("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        C = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "java.lang.String"));
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        DesugarCollections.unmodifiableMap(hashMap);
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.v = r2.b.i(byteBuffer);
        this.e = r2.b.d(byteBuffer);
        this.h = r2.b.i(byteBuffer);
        this.n = r2.b.i(byteBuffer);
        this.r = r2.b.i(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.s = false;
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            String str = new String(bArr, "UTF-8");
            this.f = str;
            if (!str.endsWith(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                this.s = false;
            } else {
                this.f = e2.c.j(this.f, 1, 0);
                this.s = true;
            }
        } catch (UnsupportedEncodingException e6) {
            throw new Error(e6);
        }
    }

    @Override // com.googlecode.mp4parser.c, com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.v);
        byteBuffer.put(r2.c.d(this.e));
        byteBuffer.putInt((int) this.h);
        byteBuffer.putInt((int) this.n);
        byteBuffer.putInt((int) this.r);
        String str = this.f;
        if (str != null) {
            byteBuffer.put(r2.b.b(str));
        }
        if (this.s) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        return this.s ? r2.b.l(this.f) + 25 : r2.b.l(this.f) + 24;
    }

    public final String toString() {
        sf.f b10 = de.a.b(C, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb = new StringBuilder("HandlerBox[handlerType=");
        yh.x(de.a.b(w, this, this));
        sb.append(this.e);
        sb.append(";name=");
        yh.x(de.a.b(B, this, this));
        return android.support.v4.media.a.r(sb, this.f, "]");
    }
}
