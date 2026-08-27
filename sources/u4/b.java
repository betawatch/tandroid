package u4;

import android.graphics.Bitmap;
import d5.g0;
import d5.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m5.o;
import org.telegram.tgnet.TLObject;
import r4.c;
import r4.f;
import r4.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends f {
    public final z b;
    public final z c;
    public final a d;
    public Inflater e;

    public b() {
        super("PgsDecoder");
        this.b = new z();
        this.c = new z();
        this.d = new a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r6.B(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        r2.reset();
        r0.A(r6.c, r6.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // r4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g c(int i10, boolean z10, byte[] bArr) {
        c cVar;
        int i11;
        int i12;
        int t10;
        Inflater inflater;
        z zVar = this.b;
        zVar.A(i10, bArr);
        int i13 = 0;
        int i14 = 2;
        if (zVar.a() > 0 && (zVar.a[zVar.b] & 255) == 120) {
            if (this.e == null) {
                this.e = new Inflater();
            }
            inflater = this.e;
            int i15 = g0.a;
            if (zVar.a() > 0) {
                z zVar2 = this.c;
                if (zVar2.a.length < zVar.a()) {
                    zVar2.b(zVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(zVar.a, zVar.b, zVar.a());
                int i16 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = zVar2.a;
                        i16 += inflater.inflate(bArr2, i16, bArr2.length - i16);
                        if (inflater.finished()) {
                            break;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr3 = zVar2.a;
                        if (i16 == bArr3.length) {
                            zVar2.b(bArr3.length * 2);
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
            }
        }
        a aVar = this.d;
        aVar.d = 0;
        int[] iArr = aVar.b;
        z zVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        zVar3.z(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (zVar.a() >= 3) {
            int i17 = zVar.c;
            int r10 = zVar.r();
            int w10 = zVar.w();
            int i18 = zVar.b + w10;
            if (i18 > i17) {
                zVar.C(i17);
                cVar = null;
            } else {
                if (r10 != 128) {
                    switch (r10) {
                        case 20:
                            if (w10 % 5 == i14) {
                                zVar.D(i14);
                                Arrays.fill(iArr, i13);
                                int i19 = w10 / 5;
                                for (int i20 = 0; i20 < i19; i20++) {
                                    int r11 = zVar.r();
                                    double r12 = zVar.r();
                                    double r13 = zVar.r() - 128;
                                    double r14 = zVar.r() - 128;
                                    iArr[r11] = (g0.h((int) ((1.402d * r13) + r12), 0, 255) << 16) | (zVar.r() << 24) | (g0.h((int) ((r12 - (0.34414d * r14)) - (r13 * 0.71414d)), 0, 255) << 8) | g0.h((int) ((1.772d * r14) + r12), 0, 255);
                                }
                                aVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (w10 >= 4) {
                                zVar.D(3);
                                int i21 = w10 - 4;
                                if ((128 & zVar.r()) != 0) {
                                    if (i21 >= 7 && (t10 = zVar.t()) >= 4) {
                                        aVar.h = zVar.w();
                                        aVar.i = zVar.w();
                                        zVar3.z(t10 - 4);
                                        i21 = w10 - 11;
                                    }
                                }
                                int i22 = zVar3.b;
                                int i23 = zVar3.c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    zVar.c(i22, min, zVar3.a);
                                    zVar3.C(i22 + min);
                                }
                            }
                            break;
                        case 22:
                            if (w10 >= 19) {
                                aVar.d = zVar.w();
                                aVar.e = zVar.w();
                                zVar.D(11);
                                aVar.f = zVar.w();
                                aVar.g = zVar.w();
                            }
                            break;
                    }
                    cVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i11 = zVar3.c) == 0 || zVar3.b != i11 || !aVar.c) {
                        cVar = null;
                    } else {
                        zVar3.C(0);
                        int i24 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int r15 = zVar3.r();
                            if (r15 != 0) {
                                i12 = i25 + 1;
                                iArr2[i25] = iArr[r15];
                            } else {
                                int r16 = zVar3.r();
                                if (r16 != 0) {
                                    i12 = ((r16 & 64) == 0 ? r16 & 63 : ((r16 & 63) << 8) | zVar3.r()) + i25;
                                    Arrays.fill(iArr2, i25, i12, (r16 & 128) == 0 ? 0 : iArr[zVar3.r()]);
                                }
                            }
                            i25 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.g;
                        float f14 = aVar.e;
                        cVar = new c(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f);
                    }
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    zVar3.z(0);
                    aVar.c = false;
                }
                zVar.C(i18);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            i13 = 0;
            i14 = 2;
        }
        return new o(DesugarCollections.unmodifiableList(arrayList), 24);
        inflater.reset();
        a aVar2 = this.d;
        aVar2.d = 0;
        int[] iArr3 = aVar2.b;
        z zVar32 = aVar2.a;
        aVar2.e = 0;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.h = 0;
        aVar2.i = 0;
        zVar32.z(0);
        aVar2.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (zVar.a() >= 3) {
        }
        return new o(DesugarCollections.unmodifiableList(arrayList2), 24);
    }
}
