package w4;

import android.graphics.Bitmap;
import f5.d0;
import f5.w;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;
import t4.e;
import t4.f;
import u4.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends e {
    public final w b;
    public final w c;
    public final a d;
    public Inflater e;

    public b() {
        super("PgsDecoder");
        this.b = new w();
        this.c = new w();
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
    @Override // t4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f c(int i10, boolean z10, byte[] bArr) {
        int[] iArr;
        t4.b bVar;
        int i11;
        int i12;
        int t10;
        Inflater inflater;
        w wVar = this.b;
        wVar.A(i10, bArr);
        int i13 = 0;
        int i14 = 2;
        if (wVar.a() > 0 && (wVar.a[wVar.b] & 255) == 120) {
            if (this.e == null) {
                this.e = new Inflater();
            }
            inflater = this.e;
            int i15 = d0.a;
            if (wVar.a() > 0) {
                w wVar2 = this.c;
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
        a aVar = this.d;
        aVar.d = 0;
        int[] iArr2 = aVar.b;
        w wVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        wVar3.z(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (wVar.a() >= 3) {
            int i17 = wVar.c;
            int r6 = wVar.r();
            int w10 = wVar.w();
            int i18 = wVar.b + w10;
            if (i18 > i17) {
                wVar.C(i17);
                iArr = iArr2;
                bVar = null;
            } else {
                if (r6 != 128) {
                    switch (r6) {
                        case 20:
                            if (w10 % 5 == i14) {
                                wVar.D(i14);
                                Arrays.fill(iArr2, i13);
                                int i19 = w10 / 5;
                                int i20 = 0;
                                while (i20 < i19) {
                                    int r9 = wVar.r();
                                    int[] iArr3 = iArr2;
                                    double r10 = wVar.r();
                                    double r11 = wVar.r() - 128;
                                    double r12 = wVar.r() - 128;
                                    iArr3[r9] = (d0.h((int) ((1.402d * r11) + r10), 0, 255) << 16) | (wVar.r() << 24) | (d0.h((int) ((r10 - (0.34414d * r12)) - (r11 * 0.71414d)), 0, 255) << 8) | d0.h((int) ((r12 * 1.772d) + r10), 0, 255);
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
                            if (w10 >= 4) {
                                wVar.D(3);
                                int i21 = w10 - 4;
                                if ((128 & wVar.r()) != 0) {
                                    if (i21 >= 7 && (t10 = wVar.t()) >= 4) {
                                        aVar.h = wVar.w();
                                        aVar.i = wVar.w();
                                        wVar3.z(t10 - 4);
                                        i21 = w10 - 11;
                                    }
                                }
                                int i22 = wVar3.b;
                                int i23 = wVar3.c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    wVar.c(i22, min, wVar3.a);
                                    wVar3.C(i22 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (w10 >= 19) {
                                aVar.d = wVar.w();
                                aVar.e = wVar.w();
                                wVar.D(11);
                                aVar.f = wVar.w();
                                aVar.g = wVar.w();
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
                        wVar3.C(0);
                        int i24 = aVar.h * aVar.i;
                        int[] iArr4 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int r13 = wVar3.r();
                            if (r13 != 0) {
                                i12 = i25 + 1;
                                iArr4[i25] = iArr[r13];
                            } else {
                                int r14 = wVar3.r();
                                if (r14 != 0) {
                                    i12 = ((r14 & 64) == 0 ? r14 & 63 : ((r14 & 63) << 8) | wVar3.r()) + i25;
                                    Arrays.fill(iArr4, i25, i12, (r14 & 128) == 0 ? 0 : iArr[wVar3.r()]);
                                }
                            }
                            i25 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f9 = aVar.f;
                        float f10 = aVar.d;
                        float f11 = f9 / f10;
                        float f12 = aVar.g;
                        float f13 = aVar.e;
                        bVar = new t4.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f);
                    }
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    wVar3.z(0);
                    aVar.c = false;
                }
                wVar.C(i18);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            iArr2 = iArr;
            i13 = 0;
            i14 = 2;
        }
        return new j(2, DesugarCollections.unmodifiableList(arrayList));
        inflater.reset();
        a aVar2 = this.d;
        aVar2.d = 0;
        int[] iArr22 = aVar2.b;
        w wVar32 = aVar2.a;
        aVar2.e = 0;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.h = 0;
        aVar2.i = 0;
        wVar32.z(0);
        aVar2.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (wVar.a() >= 3) {
        }
        return new j(2, DesugarCollections.unmodifiableList(arrayList2));
    }
}
