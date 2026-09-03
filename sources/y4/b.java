package y4;

import android.graphics.Bitmap;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;
import v4.e;
import v4.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends e {
    public final w n;
    public final w o;
    public final a p;
    public Inflater q;

    public b() {
        super("PgsDecoder");
        this.n = new w();
        this.o = new w();
        this.p = new a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r6.E(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        r2.reset();
        r0.D(r6.c, r6.a);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f k(int i10, boolean z4, byte[] bArr) {
        int[] iArr;
        v4.b bVar;
        int i11;
        int i12;
        int w10;
        Inflater inflater;
        w wVar = this.n;
        wVar.D(i10, bArr);
        int i13 = 0;
        int i14 = 2;
        if (wVar.a() > 0 && (wVar.a[wVar.b] & 255) == 120) {
            if (this.q == null) {
                this.q = new Inflater();
            }
            inflater = this.q;
            int i15 = d0.a;
            if (wVar.a() > 0) {
                w wVar2 = this.o;
                if (wVar2.a.length < wVar.a()) {
                    wVar2.b(wVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(wVar.a, wVar.b, wVar.a());
                int i16 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = wVar2.a;
                        i16 += inflater.inflate(bArr2, i16, bArr2.length - i16);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr3 = wVar2.a;
                            if (i16 == bArr3.length) {
                                wVar2.b(bArr3.length * 2);
                            }
                        } else {
                            break;
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th2) {
                        inflater.reset();
                        throw th2;
                    }
                }
            }
        }
        a aVar = this.p;
        aVar.d = 0;
        int[] iArr2 = aVar.b;
        w wVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        wVar3.C(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (wVar.a() >= 3) {
            int i17 = wVar.c;
            int u10 = wVar.u();
            int z10 = wVar.z();
            int i18 = wVar.b + z10;
            if (i18 > i17) {
                wVar.F(i17);
                iArr = iArr2;
                bVar = null;
            } else {
                if (u10 != 128) {
                    switch (u10) {
                        case 20:
                            if (z10 % 5 == i14) {
                                wVar.G(i14);
                                Arrays.fill(iArr2, i13);
                                int i19 = z10 / 5;
                                int i20 = 0;
                                while (i20 < i19) {
                                    int u11 = wVar.u();
                                    double u12 = wVar.u();
                                    double u13 = wVar.u() - 128;
                                    int[] iArr3 = iArr2;
                                    double u14 = wVar.u() - 128;
                                    iArr3[u11] = (d0.h((int) ((u12 - (0.34414d * u14)) - (u13 * 0.71414d)), 0, 255) << 8) | (d0.h((int) ((1.402d * u13) + u12), 0, 255) << 16) | (wVar.u() << 24) | d0.h((int) ((u14 * 1.772d) + u12), 0, 255);
                                    i20++;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                aVar.c = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (z10 >= 4) {
                                wVar.G(3);
                                int i21 = z10 - 4;
                                if ((128 & wVar.u()) != 0) {
                                    if (i21 >= 7 && (w10 = wVar.w()) >= 4) {
                                        aVar.h = wVar.z();
                                        aVar.i = wVar.z();
                                        wVar3.C(w10 - 4);
                                        i21 = z10 - 11;
                                    }
                                }
                                int i22 = wVar3.b;
                                int i23 = wVar3.c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    wVar.e(i22, min, wVar3.a);
                                    wVar3.F(i22 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (z10 >= 19) {
                                aVar.d = wVar.z();
                                aVar.e = wVar.z();
                                wVar.G(11);
                                aVar.f = wVar.z();
                                aVar.g = wVar.z();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    bVar = null;
                } else {
                    iArr = iArr2;
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i11 = wVar3.c) == 0 || wVar3.b != i11 || !aVar.c) {
                        bVar = null;
                    } else {
                        wVar3.F(0);
                        int i24 = aVar.h * aVar.i;
                        int[] iArr4 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int u15 = wVar3.u();
                            if (u15 != 0) {
                                i12 = i25 + 1;
                                iArr4[i25] = iArr[u15];
                            } else {
                                int u16 = wVar3.u();
                                if (u16 != 0) {
                                    i12 = ((u16 & 64) == 0 ? u16 & 63 : ((u16 & 63) << 8) | wVar3.u()) + i25;
                                    Arrays.fill(iArr4, i25, i12, (u16 & 128) == 0 ? 0 : iArr[wVar3.u()]);
                                }
                            }
                            i25 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.g;
                        float f14 = aVar.e;
                        bVar = new v4.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f);
                    }
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    wVar3.C(0);
                    aVar.c = false;
                }
                wVar.F(i18);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            iArr2 = iArr;
            i13 = 0;
            i14 = 2;
        }
        return new e5.b(2, DesugarCollections.unmodifiableList(arrayList));
        inflater.reset();
        a aVar2 = this.p;
        aVar2.d = 0;
        int[] iArr22 = aVar2.b;
        w wVar32 = aVar2.a;
        aVar2.e = 0;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.h = 0;
        aVar2.i = 0;
        wVar32.C(0);
        aVar2.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (wVar.a() >= 3) {
        }
        return new e5.b(2, DesugarCollections.unmodifiableList(arrayList2));
    }
}
