package u4;

import android.graphics.Bitmap;
import d5.f0;
import d5.y;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import n2.p;
import org.telegram.tgnet.TLObject;
import r4.e;
import r4.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends e {
    public final y b;
    public final y c;
    public final a d;
    public Inflater e;

    public b() {
        super("PgsDecoder");
        this.b = new y();
        this.c = new y();
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
    @Override // r4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f c(int i9, boolean z10, byte[] bArr) {
        int[] iArr;
        r4.b bVar;
        int i10;
        int i11;
        int t10;
        Inflater inflater;
        y yVar = this.b;
        yVar.A(i9, bArr);
        int i12 = 0;
        int i13 = 2;
        if (yVar.a() > 0 && (yVar.a[yVar.b] & 255) == 120) {
            if (this.e == null) {
                this.e = new Inflater();
            }
            inflater = this.e;
            int i14 = f0.a;
            if (yVar.a() > 0) {
                y yVar2 = this.c;
                if (yVar2.a.length < yVar.a()) {
                    yVar2.b(yVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(yVar.a, yVar.b, yVar.a());
                int i15 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = yVar2.a;
                        i15 += inflater.inflate(bArr2, i15, bArr2.length - i15);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr3 = yVar2.a;
                            if (i15 == bArr3.length) {
                                yVar2.b(bArr3.length * 2);
                            }
                        } else {
                            break;
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
        int[] iArr2 = aVar.b;
        y yVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        yVar3.z(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (yVar.a() >= 3) {
            int i16 = yVar.c;
            int r10 = yVar.r();
            int w8 = yVar.w();
            int i17 = yVar.b + w8;
            if (i17 > i16) {
                yVar.C(i16);
                iArr = iArr2;
                bVar = null;
            } else {
                if (r10 != 128) {
                    switch (r10) {
                        case 20:
                            if (w8 % 5 == i13) {
                                yVar.D(i13);
                                Arrays.fill(iArr2, i12);
                                int i18 = w8 / 5;
                                int i19 = 0;
                                while (i19 < i18) {
                                    int r11 = yVar.r();
                                    double r12 = yVar.r();
                                    double r13 = yVar.r() - 128;
                                    int[] iArr3 = iArr2;
                                    double r14 = yVar.r() - 128;
                                    iArr3[r11] = (f0.h((int) ((1.402d * r13) + r12), 0, 255) << 16) | (yVar.r() << 24) | (f0.h((int) ((r12 - (0.34414d * r14)) - (r13 * 0.71414d)), 0, 255) << 8) | f0.h((int) ((r14 * 1.772d) + r12), 0, 255);
                                    i19++;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                aVar.c = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (w8 >= 4) {
                                yVar.D(3);
                                int i20 = w8 - 4;
                                if ((128 & yVar.r()) != 0) {
                                    if (i20 >= 7 && (t10 = yVar.t()) >= 4) {
                                        aVar.h = yVar.w();
                                        aVar.i = yVar.w();
                                        yVar3.z(t10 - 4);
                                        i20 = w8 - 11;
                                    }
                                }
                                int i21 = yVar3.b;
                                int i22 = yVar3.c;
                                if (i21 < i22 && i20 > 0) {
                                    int min = Math.min(i20, i22 - i21);
                                    yVar.c(i21, min, yVar3.a);
                                    yVar3.C(i21 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (w8 >= 19) {
                                aVar.d = yVar.w();
                                aVar.e = yVar.w();
                                yVar.D(11);
                                aVar.f = yVar.w();
                                aVar.g = yVar.w();
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
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i10 = yVar3.c) == 0 || yVar3.b != i10 || !aVar.c) {
                        bVar = null;
                    } else {
                        yVar3.C(0);
                        int i23 = aVar.h * aVar.i;
                        int[] iArr4 = new int[i23];
                        int i24 = 0;
                        while (i24 < i23) {
                            int r15 = yVar3.r();
                            if (r15 != 0) {
                                i11 = i24 + 1;
                                iArr4[i24] = iArr[r15];
                            } else {
                                int r16 = yVar3.r();
                                if (r16 != 0) {
                                    i11 = ((r16 & 64) == 0 ? r16 & 63 : ((r16 & 63) << 8) | yVar3.r()) + i24;
                                    Arrays.fill(iArr4, i24, i11, (r16 & 128) == 0 ? 0 : iArr[yVar3.r()]);
                                }
                            }
                            i24 = i11;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.g;
                        float f14 = aVar.e;
                        bVar = new r4.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f);
                    }
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    yVar3.z(0);
                    aVar.c = false;
                }
                yVar.C(i17);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            iArr2 = iArr;
            i12 = 0;
            i13 = 2;
        }
        return new p(DesugarCollections.unmodifiableList(arrayList), 23);
        inflater.reset();
        a aVar2 = this.d;
        aVar2.d = 0;
        int[] iArr22 = aVar2.b;
        y yVar32 = aVar2.a;
        aVar2.e = 0;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.h = 0;
        aVar2.i = 0;
        yVar32.z(0);
        aVar2.c = false;
        ArrayList arrayList2 = new ArrayList();
        while (yVar.a() >= 3) {
        }
        return new p(DesugarCollections.unmodifiableList(arrayList2), 23);
    }
}
