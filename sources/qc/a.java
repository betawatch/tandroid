package qc;

import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import lc.c;
import org.telegram.messenger.qs;
import ui.e;
import y7.i6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a extends com.googlecode.mp4parser.a {
    public static final /* synthetic */ i6 D;
    public static final /* synthetic */ i6 b;
    public static final /* synthetic */ i6 c;
    public static final /* synthetic */ i6 d;
    public static final /* synthetic */ i6 e;
    public static final /* synthetic */ i6 f;
    public static final /* synthetic */ i6 h;
    public static final /* synthetic */ i6 n;
    public static final /* synthetic */ i6 r;
    public static final /* synthetic */ i6 s;
    public static final /* synthetic */ i6 w;
    public static final /* synthetic */ i6 x;
    public static final /* synthetic */ i6 y;
    public b a;

    static {
        ze.a aVar = new ze.a(a.class, "AvcConfigurationBox.java");
        aVar.e(aVar.d("getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        e = aVar.e(aVar.d("setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "void"));
        f = aVar.e(aVar.d("setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "void"));
        h = aVar.e(aVar.d("setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "void"));
        n = aVar.e(aVar.d("setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "void"));
        aVar.e(aVar.d("getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        r = aVar.e(aVar.d("setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "void"));
        aVar.e(aVar.d("getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        s = aVar.e(aVar.d("setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "void"));
        aVar.e(aVar.d("getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        w = aVar.e(aVar.d("setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "void"));
        aVar.e(aVar.d("getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "void"));
        aVar.e(aVar.d("hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "boolean"));
        aVar.e(aVar.d("setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "void"));
        x = aVar.e(aVar.d("getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "long"));
        y = aVar.e(aVar.d("getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "void"));
        aVar.e(aVar.d("getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "[Ljava.lang.String;"));
        aVar.e(aVar.d("getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"));
        D = aVar.e(aVar.d("toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "int"));
        aVar.e(aVar.d("getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        aVar.e(aVar.d("getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "java.util.List"));
        b = aVar.e(aVar.d("setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "void"));
        c = aVar.e(aVar.d("setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "void"));
        d = aVar.e(aVar.d("setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "void"));
    }

    @Override // com.googlecode.mp4parser.a
    public final void _parseDetails(ByteBuffer byteBuffer) {
        int i7;
        b bVar = new b();
        bVar.f = new ArrayList();
        bVar.g = new ArrayList();
        bVar.h = true;
        bVar.i = 1;
        bVar.j = 0;
        bVar.k = 0;
        bVar.l = new ArrayList();
        bVar.m = 63;
        bVar.n = 7;
        bVar.o = 31;
        bVar.p = 31;
        bVar.q = 31;
        bVar.a = h5.b.k(byteBuffer);
        bVar.b = h5.b.a(byteBuffer.get());
        bVar.c = h5.b.a(byteBuffer.get());
        bVar.d = h5.b.a(byteBuffer.get());
        c cVar = new c(0, byteBuffer);
        bVar.m = cVar.a(6);
        bVar.e = cVar.a(2);
        bVar.n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i10 = 0; i10 < a10; i10++) {
            byte[] bArr = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr);
            bVar.f.add(bArr);
        }
        long a11 = h5.b.a(byteBuffer.get());
        for (int i11 = 0; i11 < a11; i11++) {
            byte[] bArr2 = new byte[h5.b.h(byteBuffer)];
            byteBuffer.get(bArr2);
            bVar.g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            bVar.h = false;
        }
        if (bVar.h && ((i7 = bVar.b) == 100 || i7 == 110 || i7 == 122 || i7 == 144)) {
            c cVar2 = new c(0, byteBuffer);
            bVar.o = cVar2.a(6);
            bVar.i = cVar2.a(2);
            bVar.p = cVar2.a(5);
            bVar.j = cVar2.a(3);
            bVar.q = cVar2.a(5);
            bVar.k = cVar2.a(3);
            long a12 = h5.b.a(byteBuffer.get());
            for (int i12 = 0; i12 < a12; i12++) {
                byte[] bArr3 = new byte[h5.b.h(byteBuffer)];
                byteBuffer.get(bArr3);
                bVar.l.add(bArr3);
            }
        } else {
            bVar.i = -1;
            bVar.j = -1;
            bVar.k = -1;
        }
        this.a = bVar;
    }

    public final void d(int i7) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(e, this, this, new Integer(i7)));
        this.a.d = i7;
    }

    public final void e(int i7) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(c, this, this, new Integer(i7)));
        this.a.b = i7;
    }

    @Override // com.googlecode.mp4parser.a
    public final void getContent(ByteBuffer byteBuffer) {
        com.google.android.recaptcha.internal.a.t(ze.a.c(y, this, this, byteBuffer));
        b bVar = this.a;
        h5.b.r(bVar.a, byteBuffer);
        byteBuffer.put((byte) (bVar.b & qs.e4));
        byteBuffer.put((byte) (bVar.c & qs.e4));
        byteBuffer.put((byte) (bVar.d & qs.e4));
        c cVar = new c(1, byteBuffer);
        cVar.c(bVar.m, 6);
        cVar.c(bVar.e, 2);
        cVar.c(bVar.n, 3);
        cVar.c(bVar.g.size(), 5);
        ArrayList arrayList = bVar.f;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            byte[] bArr = (byte[]) obj;
            h5.b.p(bArr.length, byteBuffer);
            byteBuffer.put(bArr);
        }
        byteBuffer.put((byte) (bVar.g.size() & qs.e4));
        ArrayList arrayList2 = bVar.g;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj2;
            h5.b.p(bArr2.length, byteBuffer);
            byteBuffer.put(bArr2);
        }
        if (bVar.h) {
            int i12 = bVar.b;
            if (i12 == 100 || i12 == 110 || i12 == 122 || i12 == 144) {
                c cVar2 = new c(1, byteBuffer);
                cVar2.c(bVar.o, 6);
                cVar2.c(bVar.i, 2);
                cVar2.c(bVar.p, 5);
                cVar2.c(bVar.j, 3);
                cVar2.c(bVar.q, 5);
                cVar2.c(bVar.k, 3);
                ArrayList arrayList3 = bVar.l;
                int size3 = arrayList3.size();
                while (i7 < size3) {
                    Object obj3 = arrayList3.get(i7);
                    i7++;
                    byte[] bArr3 = (byte[]) obj3;
                    h5.b.p(bArr3.length, byteBuffer);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    public final long getContentSize() {
        int i7;
        com.google.android.recaptcha.internal.a.t(ze.a.b(x, this, this));
        b bVar = this.a;
        ArrayList arrayList = bVar.f;
        int size = arrayList.size();
        long j3 = 6;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j3 = j3 + 2 + ((byte[]) obj).length;
        }
        long j10 = j3 + 1;
        ArrayList arrayList2 = bVar.g;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j10 = j10 + 2 + ((byte[]) obj2).length;
        }
        if (!bVar.h || ((i7 = bVar.b) != 100 && i7 != 110 && i7 != 122 && i7 != 144)) {
            return j10;
        }
        long j11 = j10 + 4;
        ArrayList arrayList3 = bVar.l;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj3 = arrayList3.get(i10);
            i10++;
            j11 = j11 + 2 + ((byte[]) obj3).length;
        }
        return j11;
    }

    public final String toString() {
        e b10 = ze.a.b(D, this, this);
        g.a().getClass();
        g.b(b10);
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.a + '}';
    }
}
