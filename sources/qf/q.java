package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class q extends g {
    public final float[] A1;
    public final Path B1;
    public boolean[] C1;
    public float[] D1;
    public final Matrix z1;

    public q(Context context) {
        super(context, null);
        this.z1 = new Matrix();
        this.A1 = new float[2];
        this.B1 = new Path();
        this.s0 = true;
        this.t0 = true;
        this.e = false;
    }

    @Override // qf.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public sf.i h(rf.a aVar) {
        return new sf.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.D0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        if (f10 >= centerX && f11 <= centerY) {
            return 0;
        }
        if (f10 < centerX || f11 < centerY) {
            return (f10 >= centerX || f11 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override // qf.g
    public float getMinDistance() {
        return 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03db  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        int i9;
        float f12;
        int i10;
        float f13;
        int i11;
        float f14;
        float f15;
        float measuredHeight;
        float f16;
        int i12;
        int i13;
        ArrayList arrayList2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i14;
        int i15;
        float f23;
        float f24;
        char c10;
        int i16;
        int i17;
        double degrees;
        int M;
        int M2;
        boolean z10;
        float f25;
        float f26;
        int i18;
        float f27;
        float f28;
        float f29;
        double degrees2;
        int i19;
        if (this.d0 != null) {
            float f30 = this.B0;
            j jVar = this.c0;
            float f31 = jVar.l;
            float f32 = jVar.k;
            float f33 = f30 / (f31 - f32);
            float f34 = g.g1;
            float f35 = (f32 * f33) - f34;
            RectF rectF = this.D0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
            int i20 = 0;
            while (true) {
                arrayList = this.d;
                if (i20 >= arrayList.size()) {
                    break;
                }
                ((sf.i) arrayList.get(i20)).f.reset();
                ((sf.i) arrayList.get(i20)).g.reset();
                i20++;
            }
            canvas.save();
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((rf.e) this.d0).d.size()) {
                this.C1 = new boolean[((rf.e) this.d0).d.size()];
                this.D1 = new float[((rf.e) this.d0).d.size()];
            }
            int i21 = this.u0;
            if (i21 == 2) {
                f12 = this.v0.f / 0.6f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                Path path = this.B1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f11 = 0.0f;
                float z11 = e2.c.z(1.0f, this.v0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f10 = 1.0f;
                rectF2.set(centerX - z11, centerY - z11, centerX + z11, centerY + z11);
                path.addRoundRect(rectF2, z11, z11, Path.Direction.CW);
                canvas.clipPath(path);
                i9 = 255;
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
                i9 = i21 == 3 ? (int) (this.v0.f * 255.0f) : 255;
                f12 = 0.0f;
            }
            float[] fArr = ((rf.e) this.d0).b;
            int i22 = ((int) (f34 / (fArr.length < 2 ? 1.0f : fArr[1] * f33))) + 1;
            int max = Math.max(0, (this.B - i22) - 1);
            int min = Math.min(((rf.e) this.d0).b.length - 1, this.C + i22 + 1);
            int i23 = max;
            float f36 = 0.0f;
            boolean z12 = false;
            float f37 = 0.0f;
            while (true) {
                i10 = g.j1;
                if (i23 > min) {
                    break;
                }
                float f38 = f33;
                float f39 = f35;
                float f40 = f12;
                boolean z13 = z12;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                float f41 = 0.0f;
                while (i26 < arrayList.size()) {
                    sf.f fVar = (sf.f) arrayList.get(i26);
                    int i27 = i26;
                    if (fVar.n || fVar.o != f11) {
                        i19 = i9;
                        long j10 = fVar.a.a[i23];
                        if (j10 > 0) {
                            f41 = (j10 * fVar.o) + f41;
                            i24++;
                        }
                        i25 = i27;
                    } else {
                        i19 = i9;
                    }
                    i26 = i27 + 1;
                    i9 = i19;
                }
                int i28 = i9;
                float f42 = 0.0f;
                int i29 = 0;
                while (i29 < arrayList.size()) {
                    sf.f fVar2 = (sf.f) arrayList.get(i29);
                    float f43 = f36;
                    boolean z14 = fVar2.n;
                    Path path2 = fVar2.f;
                    if (z14) {
                        f13 = f42;
                    } else {
                        f13 = f42;
                        if (fVar2.o == f11) {
                            i13 = i24;
                            i17 = min;
                            arrayList2 = arrayList;
                            i14 = max;
                            i15 = i10;
                            f42 = f13;
                            i16 = i25;
                            f36 = f43;
                            i29++;
                            min = i17;
                            i25 = i16;
                            max = i14;
                            i24 = i13;
                            i10 = i15;
                            arrayList = arrayList2;
                            f11 = 0.0f;
                        }
                    }
                    long[] jArr = fVar2.a.a;
                    if (i24 == 1) {
                        if (jArr[i23] != 0) {
                            f14 = fVar2.o;
                            i11 = i24;
                            float[] fArr2 = ((rf.e) this.d0).b;
                            f15 = (fArr2[i23] * f38) - f39;
                            float measuredWidth = i23 != min ? getMeasuredWidth() : (fArr2[i23 + 1] * f38) - f39;
                            if (f14 == f11 && i29 == i25) {
                                z13 = true;
                            }
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - i10) * f14;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f13;
                            this.D1[i29] = measuredHeight;
                            float measuredHeight3 = getMeasuredHeight() - this.s;
                            if (i23 != min) {
                                f16 = measuredHeight3;
                                f43 = f15;
                            } else {
                                f16 = measuredHeight3;
                                if (i23 == max) {
                                    f37 = f15;
                                }
                            }
                            i12 = this.u0;
                            float f44 = measuredWidth;
                            float[] fArr3 = this.A1;
                            i13 = i11;
                            Matrix matrix = this.z1;
                            if (i12 == 2 || i29 == i25) {
                                arrayList2 = arrayList;
                                f17 = measuredHeight;
                                f18 = f16;
                                f19 = f15;
                                f20 = 0.0f;
                            } else {
                                int i30 = (f15 > centerX ? 1 : (f15 == centerX ? 0 : -1));
                                if (i30 < 0) {
                                    sf.j jVar2 = this.v0;
                                    i18 = i30;
                                    f28 = jVar2.g[i29];
                                    f27 = jVar2.h[i29];
                                } else {
                                    i18 = i30;
                                    sf.j jVar3 = this.v0;
                                    float f45 = jVar3.i[i29];
                                    f27 = jVar3.j[i29];
                                    f28 = f45;
                                }
                                float f46 = centerX - f28;
                                float f47 = centerY - f27;
                                float f48 = (((f15 - f28) * f47) / f46) + f27;
                                float f49 = f10 - f40;
                                float f50 = measuredHeight * f49;
                                float f51 = f48 * f40;
                                float f52 = f50 + f51;
                                float f53 = (f16 * f49) + f51;
                                float f54 = f47 / f46;
                                if (f54 > f11) {
                                    f29 = f49;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(-Math.atan(f54));
                                } else {
                                    f29 = f49;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(Math.atan(Math.abs(f54)));
                                }
                                float f55 = ((float) degrees2) - 90.0f;
                                if (f15 >= centerX) {
                                    fArr3[0] = f15;
                                    fArr3[1] = f52;
                                    matrix.reset();
                                    matrix.postRotate(this.v0.f * f55, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    float f56 = fArr3[0];
                                    f17 = fArr3[1];
                                    if (f56 < centerX) {
                                        f56 = centerX;
                                    }
                                    fArr3[0] = f15;
                                    fArr3[1] = f53;
                                    matrix.reset();
                                    f20 = f55;
                                    matrix.postRotate(this.v0.f * f20, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    f18 = fArr3[1];
                                    f21 = f37;
                                    f22 = f56;
                                    f19 = i18 < 0 ? centerX : f15;
                                } else {
                                    f20 = f55;
                                    if (f44 >= centerX) {
                                        f19 = (f15 * f29) + (centerX * f40);
                                        f18 = (centerY * f40) + (f52 * f29);
                                        f17 = f18;
                                    } else {
                                        fArr3[0] = f15;
                                        fArr3[1] = f52;
                                        matrix.reset();
                                        sf.j jVar4 = this.v0;
                                        float f57 = jVar4.f;
                                        matrix.postRotate((f57 * jVar4.k[i29]) + (f57 * f20), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        float f58 = fArr3[0];
                                        f17 = fArr3[1];
                                        if (f44 >= centerX) {
                                            float f59 = this.v0.f;
                                            fArr3[0] = (f59 * centerX) + ((f10 - f59) * f15);
                                        } else {
                                            fArr3[0] = f15;
                                        }
                                        fArr3[1] = f53;
                                        matrix.reset();
                                        sf.j jVar5 = this.v0;
                                        float f60 = jVar5.f;
                                        matrix.postRotate((f60 * jVar5.k[i29]) + (f60 * f20), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        f19 = fArr3[0];
                                        f18 = fArr3[1];
                                        f21 = f37;
                                        f22 = f58;
                                    }
                                }
                                i14 = max;
                                if (i23 == max) {
                                    float measuredHeight4 = getMeasuredHeight();
                                    i15 = i10;
                                    if (this.u0 != 2 || i29 == i25) {
                                        z10 = false;
                                        f25 = measuredHeight4;
                                        f26 = 0.0f;
                                    } else {
                                        fArr3[0] = f11 - centerX;
                                        fArr3[1] = measuredHeight4;
                                        matrix.reset();
                                        sf.j jVar6 = this.v0;
                                        float f61 = jVar6.f;
                                        matrix.postRotate((f61 * jVar6.k[i29]) + (f20 * f61), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        z10 = false;
                                        f26 = fArr3[0];
                                        f25 = fArr3[1];
                                    }
                                    path2.moveTo(f26, f25);
                                    this.C1[i29] = z10;
                                } else {
                                    i15 = i10;
                                }
                                sf.j jVar7 = this.v0;
                                f23 = jVar7 == null ? 0.0f : jVar7.f;
                                if (f14 == f11 || i23 <= 0 || jArr[i23 - 1] != 0 || i23 >= min || jArr[i23 + 1] != 0) {
                                    f24 = f23;
                                } else {
                                    f24 = f23;
                                    if (this.u0 != 2) {
                                        if (!this.C1[i29]) {
                                            if (i29 == i25) {
                                                path2.lineTo(f19, (f10 - f24) * f18);
                                            } else {
                                                path2.lineTo(f19, f18);
                                            }
                                        }
                                        this.C1[i29] = true;
                                        c10 = 0;
                                        if (i23 == min) {
                                            float measuredWidth2 = getMeasuredWidth();
                                            float measuredHeight5 = getMeasuredHeight();
                                            if (this.u0 != 2 || i29 == i25) {
                                                path2.lineTo(measuredWidth2, measuredHeight5);
                                            } else {
                                                fArr3[c10] = measuredWidth2 + centerX;
                                                fArr3[1] = measuredHeight5;
                                                matrix.reset();
                                                sf.j jVar8 = this.v0;
                                                matrix.postRotate(jVar8.f * jVar8.k[i29], centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f62 = fArr3[c10];
                                                float f63 = fArr3[1];
                                            }
                                            if (this.u0 != 2) {
                                                i16 = i25;
                                                i17 = min;
                                                f42 = f13 + measuredHeight2;
                                                f37 = f21;
                                            } else if (i29 != i25) {
                                                sf.j jVar9 = this.v0;
                                                float f64 = (centerY - jVar9.h[i29]) / (centerX - jVar9.g[i29]);
                                                if (f64 > f11) {
                                                    i16 = i25;
                                                    i17 = min;
                                                    degrees = Math.toDegrees(-Math.atan(f64));
                                                } else {
                                                    i16 = i25;
                                                    i17 = min;
                                                    degrees = Math.toDegrees(Math.atan(Math.abs(f64)));
                                                }
                                                sf.j jVar10 = this.v0;
                                                float f65 = jVar10.g[i29];
                                                float f66 = jVar10.h[i29];
                                                fArr3[0] = f65;
                                                fArr3[1] = f66;
                                                matrix.reset();
                                                sf.j jVar11 = this.v0;
                                                float f67 = jVar11.f;
                                                matrix.postRotate((f67 * jVar11.k[i29]) + ((((float) degrees) - 90.0f) * f67), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f68 = fArr3[0];
                                                float f69 = fArr3[1];
                                                if (Math.abs(f22 - f68) >= 0.001d || ((f69 >= centerY || f17 >= centerY) && (f69 <= centerY || f17 <= centerY))) {
                                                    M = M(f22, f17);
                                                    M2 = M(f68, f69);
                                                } else {
                                                    M2 = this.v0.k[i29] == -180.0f ? 0 : 3;
                                                    M = 0;
                                                }
                                                while (M <= M2) {
                                                    if (M == 0) {
                                                        path2.lineTo(getMeasuredWidth(), 0.0f);
                                                    } else if (M == 1) {
                                                        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                    } else {
                                                        if (M == 2) {
                                                            path2.lineTo(0.0f, getMeasuredHeight());
                                                        } else {
                                                            path2.lineTo(0.0f, 0.0f);
                                                        }
                                                        M++;
                                                    }
                                                    M++;
                                                }
                                                f42 = f13 + measuredHeight2;
                                                f37 = f21;
                                            }
                                        }
                                        i16 = i25;
                                        i17 = min;
                                        f42 = f13 + measuredHeight2;
                                        f37 = f21;
                                    }
                                }
                                if (this.C1[i29]) {
                                    if (i29 == i25) {
                                        path2.lineTo(f19, (f10 - f24) * f18);
                                    } else {
                                        path2.lineTo(f19, f18);
                                    }
                                }
                                if (i29 == i25) {
                                    path2.lineTo(f22, (f10 - f24) * f17);
                                } else {
                                    path2.lineTo(f22, f17);
                                }
                                c10 = 0;
                                this.C1[i29] = false;
                                if (i23 == min) {
                                }
                                i16 = i25;
                                i17 = min;
                                f42 = f13 + measuredHeight2;
                                f37 = f21;
                            }
                            f21 = f37;
                            f22 = f19;
                            i14 = max;
                            if (i23 == max) {
                            }
                            sf.j jVar72 = this.v0;
                            if (jVar72 == null) {
                            }
                            if (f14 == f11) {
                            }
                            f24 = f23;
                            if (this.C1[i29]) {
                            }
                            if (i29 == i25) {
                            }
                            c10 = 0;
                            this.C1[i29] = false;
                            if (i23 == min) {
                            }
                            i16 = i25;
                            i17 = min;
                            f42 = f13 + measuredHeight2;
                            f37 = f21;
                        }
                        i11 = i24;
                        f14 = 0.0f;
                        float[] fArr22 = ((rf.e) this.d0).b;
                        f15 = (fArr22[i23] * f38) - f39;
                        if (i23 != min) {
                        }
                        if (f14 == f11) {
                            z13 = true;
                        }
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - i10) * f14;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f13;
                        this.D1[i29] = measuredHeight;
                        float measuredHeight32 = getMeasuredHeight() - this.s;
                        if (i23 != min) {
                        }
                        i12 = this.u0;
                        float f442 = measuredWidth;
                        float[] fArr32 = this.A1;
                        i13 = i11;
                        Matrix matrix2 = this.z1;
                        if (i12 == 2) {
                        }
                        arrayList2 = arrayList;
                        f17 = measuredHeight;
                        f18 = f16;
                        f19 = f15;
                        f20 = 0.0f;
                        f21 = f37;
                        f22 = f19;
                        i14 = max;
                        if (i23 == max) {
                        }
                        sf.j jVar722 = this.v0;
                        if (jVar722 == null) {
                        }
                        if (f14 == f11) {
                        }
                        f24 = f23;
                        if (this.C1[i29]) {
                        }
                        if (i29 == i25) {
                        }
                        c10 = 0;
                        this.C1[i29] = false;
                        if (i23 == min) {
                        }
                        i16 = i25;
                        i17 = min;
                        f42 = f13 + measuredHeight22;
                        f37 = f21;
                    } else {
                        if (f41 != f11) {
                            i11 = i24;
                            f14 = (jArr[i23] * fVar2.o) / f41;
                            float[] fArr222 = ((rf.e) this.d0).b;
                            f15 = (fArr222[i23] * f38) - f39;
                            if (i23 != min) {
                            }
                            if (f14 == f11) {
                            }
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - i10) * f14;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f13;
                            this.D1[i29] = measuredHeight;
                            float measuredHeight322 = getMeasuredHeight() - this.s;
                            if (i23 != min) {
                            }
                            i12 = this.u0;
                            float f4422 = measuredWidth;
                            float[] fArr322 = this.A1;
                            i13 = i11;
                            Matrix matrix22 = this.z1;
                            if (i12 == 2) {
                            }
                            arrayList2 = arrayList;
                            f17 = measuredHeight;
                            f18 = f16;
                            f19 = f15;
                            f20 = 0.0f;
                            f21 = f37;
                            f22 = f19;
                            i14 = max;
                            if (i23 == max) {
                            }
                            sf.j jVar7222 = this.v0;
                            if (jVar7222 == null) {
                            }
                            if (f14 == f11) {
                            }
                            f24 = f23;
                            if (this.C1[i29]) {
                            }
                            if (i29 == i25) {
                            }
                            c10 = 0;
                            this.C1[i29] = false;
                            if (i23 == min) {
                            }
                            i16 = i25;
                            i17 = min;
                            f42 = f13 + measuredHeight222;
                            f37 = f21;
                        }
                        i11 = i24;
                        f14 = 0.0f;
                        float[] fArr2222 = ((rf.e) this.d0).b;
                        f15 = (fArr2222[i23] * f38) - f39;
                        if (i23 != min) {
                        }
                        if (f14 == f11) {
                        }
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i10) * f14;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f13;
                        this.D1[i29] = measuredHeight;
                        float measuredHeight3222 = getMeasuredHeight() - this.s;
                        if (i23 != min) {
                        }
                        i12 = this.u0;
                        float f44222 = measuredWidth;
                        float[] fArr3222 = this.A1;
                        i13 = i11;
                        Matrix matrix222 = this.z1;
                        if (i12 == 2) {
                        }
                        arrayList2 = arrayList;
                        f17 = measuredHeight;
                        f18 = f16;
                        f19 = f15;
                        f20 = 0.0f;
                        f21 = f37;
                        f22 = f19;
                        i14 = max;
                        if (i23 == max) {
                        }
                        sf.j jVar72222 = this.v0;
                        if (jVar72222 == null) {
                        }
                        if (f14 == f11) {
                        }
                        f24 = f23;
                        if (this.C1[i29]) {
                        }
                        if (i29 == i25) {
                        }
                        c10 = 0;
                        this.C1[i29] = false;
                        if (i23 == min) {
                        }
                        i16 = i25;
                        i17 = min;
                        f42 = f13 + measuredHeight2222;
                        f37 = f21;
                    }
                    f36 = f43;
                    i29++;
                    min = i17;
                    i25 = i16;
                    max = i14;
                    i24 = i13;
                    i10 = i15;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
                i23++;
                min = min;
                f33 = f38;
                f35 = f39;
                f12 = f40;
                z12 = z13;
                i9 = i28;
                f11 = 0.0f;
            }
            int i31 = i9;
            ArrayList arrayList3 = arrayList;
            boolean z15 = z12;
            canvas.save();
            canvas.clipRect(f37, i10, f36, getMeasuredHeight() - this.s);
            if (z15) {
                canvas.drawColor(f6.w0(null, f6.rj, false));
            }
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                sf.f fVar3 = (sf.f) arrayList3.get(size);
                Paint paint = fVar3.c;
                paint.setAlpha(i31);
                canvas.drawPath(fVar3.f, paint);
                paint.setAlpha(255);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i9;
        boolean z10;
        float f10;
        boolean z11;
        rf.b bVar;
        if (this.d0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((sf.i) arrayList.get(i10)).g.reset();
            }
            rf.b bVar2 = this.d0;
            int i11 = ((rf.e) bVar2).n;
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((rf.e) bVar2).d.size()) {
                this.C1 = new boolean[((rf.e) this.d0).d.size()];
            }
            boolean z12 = false;
            for (int i12 = 0; i12 < i11; i12++) {
                float f11 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    sf.f fVar = (sf.f) arrayList.get(i15);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((rf.e) this.d0).m[i15][i12] > 0) {
                            f11 += ((rf.e) r12).m[i15][i12] * fVar.o;
                            i13++;
                        }
                        i14 = i15;
                    }
                }
                int i16 = i11 - 1;
                float f12 = (i12 / i16) * this.y0;
                int i17 = 0;
                float f13 = 0.0f;
                while (i17 < arrayList.size()) {
                    sf.f fVar2 = (sf.f) arrayList.get(i17);
                    boolean z13 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z13 && fVar2.o == 0.0f) {
                        i9 = i11;
                    } else if (i13 == 1) {
                        if (((rf.e) this.d0).m[i17][i12] != 0) {
                            f10 = fVar2.o;
                            i9 = i11;
                            z10 = z12;
                            boolean z14 = (f10 == 0.0f || i17 != i14) ? z10 : true;
                            int i18 = this.x0;
                            float f14 = f10 * i18;
                            float f15 = (i18 - f14) - f13;
                            if (i12 != 0) {
                                z11 = z14;
                                path.moveTo(0.0f, i18);
                                this.C1[i17] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.d0;
                            if (((rf.e) bVar).m[i17][i12] == 0 || i12 <= 0 || ((rf.e) bVar).m[i17][i12 - 1] != 0 || i12 >= i16 || ((rf.e) bVar).m[i17][i12 + 1] != 0) {
                                if (this.C1[i17]) {
                                    path.lineTo(f12, i18);
                                }
                                path.lineTo(f12, f15);
                                this.C1[i17] = false;
                            } else {
                                if (!this.C1[i17]) {
                                    path.lineTo(f12, i18);
                                }
                                this.C1[i17] = true;
                            }
                            if (i12 == i16) {
                                path.lineTo(this.y0, i18);
                            }
                            f13 += f14;
                            z12 = z11;
                        }
                        i9 = i11;
                        z10 = z12;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i182 = this.x0;
                        float f142 = f10 * i182;
                        float f152 = (i182 - f142) - f13;
                        if (i12 != 0) {
                        }
                        bVar = this.d0;
                        if (((rf.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.C1[i17]) {
                        }
                        path.lineTo(f12, f152);
                        this.C1[i17] = false;
                        if (i12 == i16) {
                        }
                        f13 += f142;
                        z12 = z11;
                    } else {
                        if (f11 != 0.0f) {
                            i9 = i11;
                            z10 = z12;
                            f10 = (((rf.e) this.d0).m[i17][i12] * fVar2.o) / f11;
                            if (f10 == 0.0f) {
                            }
                            int i1822 = this.x0;
                            float f1422 = f10 * i1822;
                            float f1522 = (i1822 - f1422) - f13;
                            if (i12 != 0) {
                            }
                            bVar = this.d0;
                            if (((rf.e) bVar).m[i17][i12] == 0) {
                            }
                            if (this.C1[i17]) {
                            }
                            path.lineTo(f12, f1522);
                            this.C1[i17] = false;
                            if (i12 == i16) {
                            }
                            f13 += f1422;
                            z12 = z11;
                        }
                        i9 = i11;
                        z10 = z12;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i18222 = this.x0;
                        float f14222 = f10 * i18222;
                        float f15222 = (i18222 - f14222) - f13;
                        if (i12 != 0) {
                        }
                        bVar = this.d0;
                        if (((rf.e) bVar).m[i17][i12] == 0) {
                        }
                        if (this.C1[i17]) {
                        }
                        path.lineTo(f12, f15222);
                        this.C1[i17] = false;
                        if (i12 == i16) {
                        }
                        f13 += f14222;
                        z12 = z11;
                    }
                    i17++;
                    i11 = i9;
                }
            }
            if (z12) {
                canvas.drawColor(f6.w0(null, f6.rj, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                sf.f fVar3 = (sf.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // qf.g, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.i0 = arrayList.size();
        int i9 = 0;
        while (true) {
            this.j0 = i9;
            int i10 = this.j0;
            if (i10 >= this.i0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (sf.d) arrayList.get(i10));
            p(canvas, (sf.d) arrayList.get(this.j0));
            i9 = this.j0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(sf.j jVar) {
        ArrayList arrayList;
        int i9;
        float f10;
        rf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f11 = this.B0;
        j jVar2 = this.c0;
        float f12 = jVar2.l;
        float f13 = jVar2.k;
        float f14 = f11 / (f12 - f13);
        float f15 = g.g1;
        float f16 = (f13 * f14) - f15;
        int i10 = 2;
        int i11 = 1;
        int i12 = ((int) (f15 / (((rf.e) bVar).b.length < 2 ? 1.0f : ((rf.e) bVar).b[1] * f14))) + 1;
        int max = Math.max(0, (this.B - i12) - 1);
        int min = Math.min(((rf.e) this.d0).b.length - 1, this.C + i12 + 1);
        this.v0.g = new float[((rf.e) this.d0).d.size()];
        this.v0.h = new float[((rf.e) this.d0).d.size()];
        this.v0.i = new float[((rf.e) this.d0).d.size()];
        this.v0.j = new float[((rf.e) this.d0).d.size()];
        this.v0.k = new float[((rf.e) this.d0).d.size()];
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i13 == i11 ? min : max;
            int i15 = 0;
            float f17 = 0.0f;
            int i16 = 0;
            while (true) {
                arrayList = this.d;
                if (i15 >= arrayList.size()) {
                    break;
                }
                sf.f fVar = (sf.f) arrayList.get(i15);
                if (fVar.n || fVar.o != 0.0f) {
                    long j10 = fVar.a.a[i14];
                    if (j10 > 0) {
                        f17 += j10 * fVar.o;
                        i16++;
                    }
                }
                i15++;
            }
            int i17 = 0;
            int i18 = 0;
            while (i17 < arrayList.size()) {
                sf.f fVar2 = (sf.f) arrayList.get(i17);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i16 == i11) {
                        if (jArr[i14] != 0) {
                            f10 = fVar2.o;
                            i9 = i13;
                            float f18 = (((rf.e) this.d0).b[i14] * f14) - f16;
                            float measuredHeight = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f19 = i18;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f19;
                            i18 = (int) (f19 + measuredHeight);
                            if (i9 != 0) {
                                sf.j jVar3 = this.v0;
                                jVar3.g[i17] = f18;
                                jVar3.h[i17] = measuredHeight2;
                            } else {
                                sf.j jVar4 = this.v0;
                                jVar4.i[i17] = f18;
                                jVar4.j[i17] = measuredHeight2;
                            }
                        }
                        i9 = i13;
                        f10 = 0.0f;
                        float f182 = (((rf.e) this.d0).b[i14] * f14) - f16;
                        float measuredHeight3 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f192 = i18;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f192;
                        i18 = (int) (f192 + measuredHeight3);
                        if (i9 != 0) {
                        }
                    } else {
                        if (f17 != 0.0f) {
                            i9 = i13;
                            f10 = (jArr[i14] * fVar2.o) / f17;
                            float f1822 = (((rf.e) this.d0).b[i14] * f14) - f16;
                            float measuredHeight32 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f1922 = i18;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1922;
                            i18 = (int) (f1922 + measuredHeight32);
                            if (i9 != 0) {
                            }
                        }
                        i9 = i13;
                        f10 = 0.0f;
                        float f18222 = (((rf.e) this.d0).b[i14] * f14) - f16;
                        float measuredHeight322 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f19222 = i18;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f19222;
                        i18 = (int) (f19222 + measuredHeight322);
                        if (i9 != 0) {
                        }
                    }
                } else {
                    i9 = i13;
                }
                i17++;
                i13 = i9;
                i11 = 1;
            }
            i13++;
            i10 = 2;
            i11 = 1;
        }
    }

    @Override // qf.g
    public final long r(int i9, int i10) {
        return 100L;
    }
}
