package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // tf.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public vf.i h(uf.a aVar) {
        return new vf.i(aVar);
    }

    public final int M(float f9, float f10) {
        RectF rectF = this.D0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        if (f9 >= centerX && f10 <= centerY) {
            return 0;
        }
        if (f9 < centerX || f10 < centerY) {
            return (f9 >= centerX || f10 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override // tf.g
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
    @Override // tf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f9;
        float f10;
        int i10;
        float f11;
        int i11;
        float f12;
        int i12;
        float f13;
        float f14;
        float measuredHeight;
        float f15;
        int i13;
        int i14;
        ArrayList arrayList2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i15;
        int i16;
        float f22;
        float f23;
        char c3;
        int i17;
        int i18;
        double degrees;
        int M;
        int M2;
        boolean z10;
        float f24;
        float f25;
        int i19;
        float f26;
        float f27;
        float f28;
        double degrees2;
        int i20;
        if (this.d0 != null) {
            float f29 = this.B0;
            j jVar = this.c0;
            float f30 = jVar.l;
            float f31 = jVar.k;
            float f32 = f29 / (f30 - f31);
            float f33 = g.g1;
            float f34 = (f31 * f32) - f33;
            RectF rectF = this.D0;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
            int i21 = 0;
            while (true) {
                arrayList = this.d;
                if (i21 >= arrayList.size()) {
                    break;
                }
                ((vf.i) arrayList.get(i21)).f.reset();
                ((vf.i) arrayList.get(i21)).g.reset();
                i21++;
            }
            canvas.save();
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((uf.e) this.d0).d.size()) {
                this.C1 = new boolean[((uf.e) this.d0).d.size()];
                this.D1 = new float[((uf.e) this.d0).d.size()];
            }
            int i22 = this.u0;
            if (i22 == 2) {
                f11 = this.v0.f / 0.6f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                Path path = this.B1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f10 = 0.0f;
                float z11 = com.google.android.recaptcha.internal.a.z(1.0f, this.v0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f9 = 1.0f;
                rectF2.set(centerX - z11, centerY - z11, centerX + z11, centerY + z11);
                path.addRoundRect(rectF2, z11, z11, Path.Direction.CW);
                canvas.clipPath(path);
                i10 = 255;
            } else {
                f9 = 1.0f;
                f10 = 0.0f;
                i10 = i22 == 3 ? (int) (this.v0.f * 255.0f) : 255;
                f11 = 0.0f;
            }
            float[] fArr = ((uf.e) this.d0).b;
            int i23 = ((int) (f33 / (fArr.length < 2 ? 1.0f : fArr[1] * f32))) + 1;
            int max = Math.max(0, (this.B - i23) - 1);
            int min = Math.min(((uf.e) this.d0).b.length - 1, this.C + i23 + 1);
            int i24 = max;
            float f35 = 0.0f;
            boolean z12 = false;
            float f36 = 0.0f;
            while (true) {
                i11 = g.j1;
                if (i24 > min) {
                    break;
                }
                float f37 = f32;
                float f38 = f34;
                float f39 = f11;
                boolean z13 = z12;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                float f40 = 0.0f;
                while (i27 < arrayList.size()) {
                    vf.f fVar = (vf.f) arrayList.get(i27);
                    int i28 = i27;
                    if (fVar.n || fVar.o != f10) {
                        i20 = i10;
                        long j10 = fVar.a.a[i24];
                        if (j10 > 0) {
                            f40 = (j10 * fVar.o) + f40;
                            i25++;
                        }
                        i26 = i28;
                    } else {
                        i20 = i10;
                    }
                    i27 = i28 + 1;
                    i10 = i20;
                }
                int i29 = i10;
                float f41 = 0.0f;
                int i30 = 0;
                while (i30 < arrayList.size()) {
                    vf.f fVar2 = (vf.f) arrayList.get(i30);
                    float f42 = f35;
                    boolean z14 = fVar2.n;
                    Path path2 = fVar2.f;
                    if (z14) {
                        f12 = f41;
                    } else {
                        f12 = f41;
                        if (fVar2.o == f10) {
                            i14 = i25;
                            i18 = min;
                            arrayList2 = arrayList;
                            i15 = max;
                            i16 = i11;
                            f41 = f12;
                            i17 = i26;
                            f35 = f42;
                            i30++;
                            min = i18;
                            i26 = i17;
                            max = i15;
                            i25 = i14;
                            i11 = i16;
                            arrayList = arrayList2;
                            f10 = 0.0f;
                        }
                    }
                    long[] jArr = fVar2.a.a;
                    if (i25 == 1) {
                        if (jArr[i24] != 0) {
                            f13 = fVar2.o;
                            i12 = i25;
                            float[] fArr2 = ((uf.e) this.d0).b;
                            f14 = (fArr2[i24] * f37) - f38;
                            float measuredWidth = i24 != min ? getMeasuredWidth() : (fArr2[i24 + 1] * f37) - f38;
                            if (f13 == f10 && i30 == i26) {
                                z13 = true;
                            }
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - i11) * f13;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f12;
                            this.D1[i30] = measuredHeight;
                            float measuredHeight3 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                                f15 = measuredHeight3;
                                f42 = f14;
                            } else {
                                f15 = measuredHeight3;
                                if (i24 == max) {
                                    f36 = f14;
                                }
                            }
                            i13 = this.u0;
                            float f43 = measuredWidth;
                            float[] fArr3 = this.A1;
                            i14 = i12;
                            Matrix matrix = this.z1;
                            if (i13 == 2 || i30 == i26) {
                                arrayList2 = arrayList;
                                f16 = measuredHeight;
                                f17 = f15;
                                f18 = f14;
                                f19 = 0.0f;
                            } else {
                                int i31 = (f14 > centerX ? 1 : (f14 == centerX ? 0 : -1));
                                if (i31 < 0) {
                                    vf.j jVar2 = this.v0;
                                    i19 = i31;
                                    f27 = jVar2.g[i30];
                                    f26 = jVar2.h[i30];
                                } else {
                                    i19 = i31;
                                    vf.j jVar3 = this.v0;
                                    float f44 = jVar3.i[i30];
                                    f26 = jVar3.j[i30];
                                    f27 = f44;
                                }
                                float f45 = centerX - f27;
                                float f46 = centerY - f26;
                                float f47 = (((f14 - f27) * f46) / f45) + f26;
                                float f48 = f9 - f39;
                                float f49 = measuredHeight * f48;
                                float f50 = f47 * f39;
                                float f51 = f49 + f50;
                                float f52 = (f15 * f48) + f50;
                                float f53 = f46 / f45;
                                if (f53 > f10) {
                                    f28 = f48;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(-Math.atan(f53));
                                } else {
                                    f28 = f48;
                                    arrayList2 = arrayList;
                                    degrees2 = Math.toDegrees(Math.atan(Math.abs(f53)));
                                }
                                float f54 = ((float) degrees2) - 90.0f;
                                if (f14 >= centerX) {
                                    fArr3[0] = f14;
                                    fArr3[1] = f51;
                                    matrix.reset();
                                    matrix.postRotate(this.v0.f * f54, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    float f55 = fArr3[0];
                                    f16 = fArr3[1];
                                    if (f55 < centerX) {
                                        f55 = centerX;
                                    }
                                    fArr3[0] = f14;
                                    fArr3[1] = f52;
                                    matrix.reset();
                                    f19 = f54;
                                    matrix.postRotate(this.v0.f * f19, centerX, centerY);
                                    matrix.mapPoints(fArr3);
                                    f17 = fArr3[1];
                                    f20 = f36;
                                    f21 = f55;
                                    f18 = i19 < 0 ? centerX : f14;
                                } else {
                                    f19 = f54;
                                    if (f43 >= centerX) {
                                        f18 = (f14 * f28) + (centerX * f39);
                                        f17 = (centerY * f39) + (f51 * f28);
                                        f16 = f17;
                                    } else {
                                        fArr3[0] = f14;
                                        fArr3[1] = f51;
                                        matrix.reset();
                                        vf.j jVar4 = this.v0;
                                        float f56 = jVar4.f;
                                        matrix.postRotate((f56 * jVar4.k[i30]) + (f56 * f19), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        float f57 = fArr3[0];
                                        f16 = fArr3[1];
                                        if (f43 >= centerX) {
                                            float f58 = this.v0.f;
                                            fArr3[0] = (f58 * centerX) + ((f9 - f58) * f14);
                                        } else {
                                            fArr3[0] = f14;
                                        }
                                        fArr3[1] = f52;
                                        matrix.reset();
                                        vf.j jVar5 = this.v0;
                                        float f59 = jVar5.f;
                                        matrix.postRotate((f59 * jVar5.k[i30]) + (f59 * f19), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        f18 = fArr3[0];
                                        f17 = fArr3[1];
                                        f20 = f36;
                                        f21 = f57;
                                    }
                                }
                                i15 = max;
                                if (i24 == max) {
                                    float measuredHeight4 = getMeasuredHeight();
                                    i16 = i11;
                                    if (this.u0 != 2 || i30 == i26) {
                                        z10 = false;
                                        f24 = measuredHeight4;
                                        f25 = 0.0f;
                                    } else {
                                        fArr3[0] = f10 - centerX;
                                        fArr3[1] = measuredHeight4;
                                        matrix.reset();
                                        vf.j jVar6 = this.v0;
                                        float f60 = jVar6.f;
                                        matrix.postRotate((f60 * jVar6.k[i30]) + (f19 * f60), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        z10 = false;
                                        f25 = fArr3[0];
                                        f24 = fArr3[1];
                                    }
                                    path2.moveTo(f25, f24);
                                    this.C1[i30] = z10;
                                } else {
                                    i16 = i11;
                                }
                                vf.j jVar7 = this.v0;
                                f22 = jVar7 == null ? 0.0f : jVar7.f;
                                if (f13 == f10 || i24 <= 0 || jArr[i24 - 1] != 0 || i24 >= min || jArr[i24 + 1] != 0) {
                                    f23 = f22;
                                } else {
                                    f23 = f22;
                                    if (this.u0 != 2) {
                                        if (!this.C1[i30]) {
                                            if (i30 == i26) {
                                                path2.lineTo(f18, (f9 - f23) * f17);
                                            } else {
                                                path2.lineTo(f18, f17);
                                            }
                                        }
                                        this.C1[i30] = true;
                                        c3 = 0;
                                        if (i24 == min) {
                                            float measuredWidth2 = getMeasuredWidth();
                                            float measuredHeight5 = getMeasuredHeight();
                                            if (this.u0 != 2 || i30 == i26) {
                                                path2.lineTo(measuredWidth2, measuredHeight5);
                                            } else {
                                                fArr3[c3] = measuredWidth2 + centerX;
                                                fArr3[1] = measuredHeight5;
                                                matrix.reset();
                                                vf.j jVar8 = this.v0;
                                                matrix.postRotate(jVar8.f * jVar8.k[i30], centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f61 = fArr3[c3];
                                                float f62 = fArr3[1];
                                            }
                                            if (this.u0 != 2) {
                                                i17 = i26;
                                                i18 = min;
                                                f41 = f12 + measuredHeight2;
                                                f36 = f20;
                                            } else if (i30 != i26) {
                                                vf.j jVar9 = this.v0;
                                                float f63 = (centerY - jVar9.h[i30]) / (centerX - jVar9.g[i30]);
                                                if (f63 > f10) {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(-Math.atan(f63));
                                                } else {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(Math.atan(Math.abs(f63)));
                                                }
                                                vf.j jVar10 = this.v0;
                                                float f64 = jVar10.g[i30];
                                                float f65 = jVar10.h[i30];
                                                fArr3[0] = f64;
                                                fArr3[1] = f65;
                                                matrix.reset();
                                                vf.j jVar11 = this.v0;
                                                float f66 = jVar11.f;
                                                matrix.postRotate((f66 * jVar11.k[i30]) + ((((float) degrees) - 90.0f) * f66), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f67 = fArr3[0];
                                                float f68 = fArr3[1];
                                                if (Math.abs(f21 - f67) >= 0.001d || ((f68 >= centerY || f16 >= centerY) && (f68 <= centerY || f16 <= centerY))) {
                                                    M = M(f21, f16);
                                                    M2 = M(f67, f68);
                                                } else {
                                                    M2 = this.v0.k[i30] == -180.0f ? 0 : 3;
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
                                                f41 = f12 + measuredHeight2;
                                                f36 = f20;
                                            }
                                        }
                                        i17 = i26;
                                        i18 = min;
                                        f41 = f12 + measuredHeight2;
                                        f36 = f20;
                                    }
                                }
                                if (this.C1[i30]) {
                                    if (i30 == i26) {
                                        path2.lineTo(f18, (f9 - f23) * f17);
                                    } else {
                                        path2.lineTo(f18, f17);
                                    }
                                }
                                if (i30 == i26) {
                                    path2.lineTo(f21, (f9 - f23) * f16);
                                } else {
                                    path2.lineTo(f21, f16);
                                }
                                c3 = 0;
                                this.C1[i30] = false;
                                if (i24 == min) {
                                }
                                i17 = i26;
                                i18 = min;
                                f41 = f12 + measuredHeight2;
                                f36 = f20;
                            }
                            f20 = f36;
                            f21 = f18;
                            i15 = max;
                            if (i24 == max) {
                            }
                            vf.j jVar72 = this.v0;
                            if (jVar72 == null) {
                            }
                            if (f13 == f10) {
                            }
                            f23 = f22;
                            if (this.C1[i30]) {
                            }
                            if (i30 == i26) {
                            }
                            c3 = 0;
                            this.C1[i30] = false;
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f41 = f12 + measuredHeight2;
                            f36 = f20;
                        }
                        i12 = i25;
                        f13 = 0.0f;
                        float[] fArr22 = ((uf.e) this.d0).b;
                        f14 = (fArr22[i24] * f37) - f38;
                        if (i24 != min) {
                        }
                        if (f13 == f10) {
                            z13 = true;
                        }
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - i11) * f13;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f12;
                        this.D1[i30] = measuredHeight;
                        float measuredHeight32 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.u0;
                        float f432 = measuredWidth;
                        float[] fArr32 = this.A1;
                        i14 = i12;
                        Matrix matrix2 = this.z1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f16 = measuredHeight;
                        f17 = f15;
                        f18 = f14;
                        f19 = 0.0f;
                        f20 = f36;
                        f21 = f18;
                        i15 = max;
                        if (i24 == max) {
                        }
                        vf.j jVar722 = this.v0;
                        if (jVar722 == null) {
                        }
                        if (f13 == f10) {
                        }
                        f23 = f22;
                        if (this.C1[i30]) {
                        }
                        if (i30 == i26) {
                        }
                        c3 = 0;
                        this.C1[i30] = false;
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f41 = f12 + measuredHeight22;
                        f36 = f20;
                    } else {
                        if (f40 != f10) {
                            i12 = i25;
                            f13 = (jArr[i24] * fVar2.o) / f40;
                            float[] fArr222 = ((uf.e) this.d0).b;
                            f14 = (fArr222[i24] * f37) - f38;
                            if (i24 != min) {
                            }
                            if (f13 == f10) {
                            }
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - i11) * f13;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f12;
                            this.D1[i30] = measuredHeight;
                            float measuredHeight322 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                            }
                            i13 = this.u0;
                            float f4322 = measuredWidth;
                            float[] fArr322 = this.A1;
                            i14 = i12;
                            Matrix matrix22 = this.z1;
                            if (i13 == 2) {
                            }
                            arrayList2 = arrayList;
                            f16 = measuredHeight;
                            f17 = f15;
                            f18 = f14;
                            f19 = 0.0f;
                            f20 = f36;
                            f21 = f18;
                            i15 = max;
                            if (i24 == max) {
                            }
                            vf.j jVar7222 = this.v0;
                            if (jVar7222 == null) {
                            }
                            if (f13 == f10) {
                            }
                            f23 = f22;
                            if (this.C1[i30]) {
                            }
                            if (i30 == i26) {
                            }
                            c3 = 0;
                            this.C1[i30] = false;
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f41 = f12 + measuredHeight222;
                            f36 = f20;
                        }
                        i12 = i25;
                        f13 = 0.0f;
                        float[] fArr2222 = ((uf.e) this.d0).b;
                        f14 = (fArr2222[i24] * f37) - f38;
                        if (i24 != min) {
                        }
                        if (f13 == f10) {
                        }
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i11) * f13;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f12;
                        this.D1[i30] = measuredHeight;
                        float measuredHeight3222 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.u0;
                        float f43222 = measuredWidth;
                        float[] fArr3222 = this.A1;
                        i14 = i12;
                        Matrix matrix222 = this.z1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f16 = measuredHeight;
                        f17 = f15;
                        f18 = f14;
                        f19 = 0.0f;
                        f20 = f36;
                        f21 = f18;
                        i15 = max;
                        if (i24 == max) {
                        }
                        vf.j jVar72222 = this.v0;
                        if (jVar72222 == null) {
                        }
                        if (f13 == f10) {
                        }
                        f23 = f22;
                        if (this.C1[i30]) {
                        }
                        if (i30 == i26) {
                        }
                        c3 = 0;
                        this.C1[i30] = false;
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f41 = f12 + measuredHeight2222;
                        f36 = f20;
                    }
                    f35 = f42;
                    i30++;
                    min = i18;
                    i26 = i17;
                    max = i15;
                    i25 = i14;
                    i11 = i16;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
                i24++;
                min = min;
                f32 = f37;
                f34 = f38;
                f11 = f39;
                z12 = z13;
                i10 = i29;
                f10 = 0.0f;
            }
            int i32 = i10;
            ArrayList arrayList3 = arrayList;
            boolean z15 = z12;
            canvas.save();
            canvas.clipRect(f36, i11, f35, getMeasuredHeight() - this.s);
            if (z15) {
                canvas.drawColor(g6.w0(null, g6.rj, false));
            }
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                vf.f fVar3 = (vf.f) arrayList3.get(size);
                Paint paint = fVar3.c;
                paint.setAlpha(i32);
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
    @Override // tf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i10;
        boolean z10;
        float f9;
        boolean z11;
        uf.b bVar;
        if (this.d0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((vf.i) arrayList.get(i11)).g.reset();
            }
            uf.b bVar2 = this.d0;
            int i12 = ((uf.e) bVar2).n;
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((uf.e) bVar2).d.size()) {
                this.C1 = new boolean[((uf.e) this.d0).d.size()];
            }
            boolean z12 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                float f10 = 0.0f;
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    vf.f fVar = (vf.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((uf.e) this.d0).m[i16][i13] > 0) {
                            f10 += ((uf.e) r12).m[i16][i13] * fVar.o;
                            i14++;
                        }
                        i15 = i16;
                    }
                }
                int i17 = i12 - 1;
                float f11 = (i13 / i17) * this.y0;
                int i18 = 0;
                float f12 = 0.0f;
                while (i18 < arrayList.size()) {
                    vf.f fVar2 = (vf.f) arrayList.get(i18);
                    boolean z13 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z13 && fVar2.o == 0.0f) {
                        i10 = i12;
                    } else if (i14 == 1) {
                        if (((uf.e) this.d0).m[i18][i13] != 0) {
                            f9 = fVar2.o;
                            i10 = i12;
                            z10 = z12;
                            boolean z14 = (f9 == 0.0f || i18 != i15) ? z10 : true;
                            int i19 = this.x0;
                            float f13 = f9 * i19;
                            float f14 = (i19 - f13) - f12;
                            if (i13 != 0) {
                                z11 = z14;
                                path.moveTo(0.0f, i19);
                                this.C1[i18] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.d0;
                            if (((uf.e) bVar).m[i18][i13] == 0 || i13 <= 0 || ((uf.e) bVar).m[i18][i13 - 1] != 0 || i13 >= i17 || ((uf.e) bVar).m[i18][i13 + 1] != 0) {
                                if (this.C1[i18]) {
                                    path.lineTo(f11, i19);
                                }
                                path.lineTo(f11, f14);
                                this.C1[i18] = false;
                            } else {
                                if (!this.C1[i18]) {
                                    path.lineTo(f11, i19);
                                }
                                this.C1[i18] = true;
                            }
                            if (i13 == i17) {
                                path.lineTo(this.y0, i19);
                            }
                            f12 += f13;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f9 = 0.0f;
                        if (f9 == 0.0f) {
                        }
                        int i192 = this.x0;
                        float f132 = f9 * i192;
                        float f142 = (i192 - f132) - f12;
                        if (i13 != 0) {
                        }
                        bVar = this.d0;
                        if (((uf.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.C1[i18]) {
                        }
                        path.lineTo(f11, f142);
                        this.C1[i18] = false;
                        if (i13 == i17) {
                        }
                        f12 += f132;
                        z12 = z11;
                    } else {
                        if (f10 != 0.0f) {
                            i10 = i12;
                            z10 = z12;
                            f9 = (((uf.e) this.d0).m[i18][i13] * fVar2.o) / f10;
                            if (f9 == 0.0f) {
                            }
                            int i1922 = this.x0;
                            float f1322 = f9 * i1922;
                            float f1422 = (i1922 - f1322) - f12;
                            if (i13 != 0) {
                            }
                            bVar = this.d0;
                            if (((uf.e) bVar).m[i18][i13] == 0) {
                            }
                            if (this.C1[i18]) {
                            }
                            path.lineTo(f11, f1422);
                            this.C1[i18] = false;
                            if (i13 == i17) {
                            }
                            f12 += f1322;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f9 = 0.0f;
                        if (f9 == 0.0f) {
                        }
                        int i19222 = this.x0;
                        float f13222 = f9 * i19222;
                        float f14222 = (i19222 - f13222) - f12;
                        if (i13 != 0) {
                        }
                        bVar = this.d0;
                        if (((uf.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.C1[i18]) {
                        }
                        path.lineTo(f11, f14222);
                        this.C1[i18] = false;
                        if (i13 == i17) {
                        }
                        f12 += f13222;
                        z12 = z11;
                    }
                    i18++;
                    i12 = i10;
                }
            }
            if (z12) {
                canvas.drawColor(g6.w0(null, g6.rj, false));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                vf.f fVar3 = (vf.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // tf.g, android.view.View
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.j0 = i10;
            int i11 = this.j0;
            if (i11 >= this.i0) {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
            l(canvas, (vf.d) arrayList.get(i11));
            p(canvas, (vf.d) arrayList.get(this.j0));
            i10 = this.j0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    @Override // tf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(vf.j jVar) {
        ArrayList arrayList;
        int i10;
        float f9;
        uf.b bVar = this.d0;
        if (bVar == null) {
            return;
        }
        float f10 = this.B0;
        j jVar2 = this.c0;
        float f11 = jVar2.l;
        float f12 = jVar2.k;
        float f13 = f10 / (f11 - f12);
        float f14 = g.g1;
        float f15 = (f12 * f13) - f14;
        int i11 = 2;
        int i12 = 1;
        int i13 = ((int) (f14 / (((uf.e) bVar).b.length < 2 ? 1.0f : ((uf.e) bVar).b[1] * f13))) + 1;
        int max = Math.max(0, (this.B - i13) - 1);
        int min = Math.min(((uf.e) this.d0).b.length - 1, this.C + i13 + 1);
        this.v0.g = new float[((uf.e) this.d0).d.size()];
        this.v0.h = new float[((uf.e) this.d0).d.size()];
        this.v0.i = new float[((uf.e) this.d0).d.size()];
        this.v0.j = new float[((uf.e) this.d0).d.size()];
        this.v0.k = new float[((uf.e) this.d0).d.size()];
        int i14 = 0;
        while (i14 < i11) {
            int i15 = i14 == i12 ? min : max;
            int i16 = 0;
            float f16 = 0.0f;
            int i17 = 0;
            while (true) {
                arrayList = this.d;
                if (i16 >= arrayList.size()) {
                    break;
                }
                vf.f fVar = (vf.f) arrayList.get(i16);
                if (fVar.n || fVar.o != 0.0f) {
                    long j10 = fVar.a.a[i15];
                    if (j10 > 0) {
                        f16 += j10 * fVar.o;
                        i17++;
                    }
                }
                i16++;
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList.size()) {
                vf.f fVar2 = (vf.f) arrayList.get(i18);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i17 == i12) {
                        if (jArr[i15] != 0) {
                            f9 = fVar2.o;
                            i10 = i14;
                            float f17 = (((uf.e) this.d0).b[i15] * f13) - f15;
                            float measuredHeight = f9 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f18 = i19;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f18;
                            i19 = (int) (f18 + measuredHeight);
                            if (i10 != 0) {
                                vf.j jVar3 = this.v0;
                                jVar3.g[i18] = f17;
                                jVar3.h[i18] = measuredHeight2;
                            } else {
                                vf.j jVar4 = this.v0;
                                jVar4.i[i18] = f17;
                                jVar4.j[i18] = measuredHeight2;
                            }
                        }
                        i10 = i14;
                        f9 = 0.0f;
                        float f172 = (((uf.e) this.d0).b[i15] * f13) - f15;
                        float measuredHeight3 = f9 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f182 = i19;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f182;
                        i19 = (int) (f182 + measuredHeight3);
                        if (i10 != 0) {
                        }
                    } else {
                        if (f16 != 0.0f) {
                            i10 = i14;
                            f9 = (jArr[i15] * fVar2.o) / f16;
                            float f1722 = (((uf.e) this.d0).b[i15] * f13) - f15;
                            float measuredHeight32 = f9 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f1822 = i19;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1822;
                            i19 = (int) (f1822 + measuredHeight32);
                            if (i10 != 0) {
                            }
                        }
                        i10 = i14;
                        f9 = 0.0f;
                        float f17222 = (((uf.e) this.d0).b[i15] * f13) - f15;
                        float measuredHeight322 = f9 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f18222 = i19;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f18222;
                        i19 = (int) (f18222 + measuredHeight322);
                        if (i10 != 0) {
                        }
                    }
                } else {
                    i10 = i14;
                }
                i18++;
                i14 = i10;
                i12 = 1;
            }
            i14++;
            i11 = 2;
            i12 = 1;
        }
    }

    @Override // tf.g
    public final long r(int i10, int i11) {
        return 100L;
    }
}
