package rf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // rf.g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public tf.i h(sf.a aVar) {
        return new tf.i(aVar);
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

    @Override // rf.g
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
    @Override // rf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        float f13;
        int i12;
        float f14;
        float f15;
        float measuredHeight;
        float f16;
        int i13;
        int i14;
        ArrayList arrayList2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i15;
        int i16;
        float f23;
        float f24;
        char c10;
        int i17;
        int i18;
        double degrees;
        int M;
        int M2;
        boolean z10;
        float f25;
        float f26;
        int i19;
        float f27;
        float f28;
        float f29;
        double degrees2;
        int i20;
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
            int i21 = 0;
            while (true) {
                arrayList = this.d;
                if (i21 >= arrayList.size()) {
                    break;
                }
                ((tf.i) arrayList.get(i21)).f.reset();
                ((tf.i) arrayList.get(i21)).g.reset();
                i21++;
            }
            canvas.save();
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((sf.e) this.d0).d.size()) {
                this.C1 = new boolean[((sf.e) this.d0).d.size()];
                this.D1 = new float[((sf.e) this.d0).d.size()];
            }
            int i22 = this.u0;
            if (i22 == 2) {
                f12 = this.v0.f / 0.6f;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                Path path = this.B1;
                path.reset();
                float width = rectF.width() > rectF.height() ? rectF.width() : rectF.height();
                float height = (rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f;
                f11 = 0.0f;
                float z11 = com.google.android.recaptcha.internal.a.z(1.0f, this.v0.f, (width - height) / 2.0f, height);
                RectF rectF2 = new RectF();
                f10 = 1.0f;
                rectF2.set(centerX - z11, centerY - z11, centerX + z11, centerY + z11);
                path.addRoundRect(rectF2, z11, z11, Path.Direction.CW);
                canvas.clipPath(path);
                i10 = 255;
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
                i10 = i22 == 3 ? (int) (this.v0.f * 255.0f) : 255;
                f12 = 0.0f;
            }
            float[] fArr = ((sf.e) this.d0).b;
            int i23 = ((int) (f34 / (fArr.length < 2 ? 1.0f : fArr[1] * f33))) + 1;
            int max = Math.max(0, (this.B - i23) - 1);
            int min = Math.min(((sf.e) this.d0).b.length - 1, this.C + i23 + 1);
            int i24 = max;
            float f36 = 0.0f;
            boolean z12 = false;
            float f37 = 0.0f;
            while (true) {
                i11 = g.j1;
                if (i24 > min) {
                    break;
                }
                float f38 = f33;
                float f39 = f35;
                float f40 = f12;
                boolean z13 = z12;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                float f41 = 0.0f;
                while (i27 < arrayList.size()) {
                    tf.f fVar = (tf.f) arrayList.get(i27);
                    int i28 = i27;
                    if (fVar.n || fVar.o != f11) {
                        i20 = i10;
                        long j10 = fVar.a.a[i24];
                        if (j10 > 0) {
                            f41 = (j10 * fVar.o) + f41;
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
                float f42 = 0.0f;
                int i30 = 0;
                while (i30 < arrayList.size()) {
                    tf.f fVar2 = (tf.f) arrayList.get(i30);
                    float f43 = f36;
                    boolean z14 = fVar2.n;
                    Path path2 = fVar2.f;
                    if (z14) {
                        f13 = f42;
                    } else {
                        f13 = f42;
                        if (fVar2.o == f11) {
                            i14 = i25;
                            i18 = min;
                            arrayList2 = arrayList;
                            i15 = max;
                            i16 = i11;
                            f42 = f13;
                            i17 = i26;
                            f36 = f43;
                            i30++;
                            min = i18;
                            i26 = i17;
                            max = i15;
                            i25 = i14;
                            i11 = i16;
                            arrayList = arrayList2;
                            f11 = 0.0f;
                        }
                    }
                    long[] jArr = fVar2.a.a;
                    if (i25 == 1) {
                        if (jArr[i24] != 0) {
                            f14 = fVar2.o;
                            i12 = i25;
                            float[] fArr2 = ((sf.e) this.d0).b;
                            f15 = (fArr2[i24] * f38) - f39;
                            float measuredWidth = i24 != min ? getMeasuredWidth() : (fArr2[i24 + 1] * f38) - f39;
                            if (f14 == f11 && i30 == i26) {
                                z13 = true;
                            }
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - i11) * f14;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2) - f13;
                            this.D1[i30] = measuredHeight;
                            float measuredHeight3 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                                f16 = measuredHeight3;
                                f43 = f15;
                            } else {
                                f16 = measuredHeight3;
                                if (i24 == max) {
                                    f37 = f15;
                                }
                            }
                            i13 = this.u0;
                            float f44 = measuredWidth;
                            float[] fArr3 = this.A1;
                            i14 = i12;
                            Matrix matrix = this.z1;
                            if (i13 == 2 || i30 == i26) {
                                arrayList2 = arrayList;
                                f17 = measuredHeight;
                                f18 = f16;
                                f19 = f15;
                                f20 = 0.0f;
                            } else {
                                int i31 = (f15 > centerX ? 1 : (f15 == centerX ? 0 : -1));
                                if (i31 < 0) {
                                    tf.j jVar2 = this.v0;
                                    i19 = i31;
                                    f28 = jVar2.g[i30];
                                    f27 = jVar2.h[i30];
                                } else {
                                    i19 = i31;
                                    tf.j jVar3 = this.v0;
                                    float f45 = jVar3.i[i30];
                                    f27 = jVar3.j[i30];
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
                                    f19 = i19 < 0 ? centerX : f15;
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
                                        tf.j jVar4 = this.v0;
                                        float f57 = jVar4.f;
                                        matrix.postRotate((f57 * jVar4.k[i30]) + (f57 * f20), centerX, centerY);
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
                                        tf.j jVar5 = this.v0;
                                        float f60 = jVar5.f;
                                        matrix.postRotate((f60 * jVar5.k[i30]) + (f60 * f20), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        f19 = fArr3[0];
                                        f18 = fArr3[1];
                                        f21 = f37;
                                        f22 = f58;
                                    }
                                }
                                i15 = max;
                                if (i24 == max) {
                                    float measuredHeight4 = getMeasuredHeight();
                                    i16 = i11;
                                    if (this.u0 != 2 || i30 == i26) {
                                        z10 = false;
                                        f25 = measuredHeight4;
                                        f26 = 0.0f;
                                    } else {
                                        fArr3[0] = f11 - centerX;
                                        fArr3[1] = measuredHeight4;
                                        matrix.reset();
                                        tf.j jVar6 = this.v0;
                                        float f61 = jVar6.f;
                                        matrix.postRotate((f61 * jVar6.k[i30]) + (f20 * f61), centerX, centerY);
                                        matrix.mapPoints(fArr3);
                                        z10 = false;
                                        f26 = fArr3[0];
                                        f25 = fArr3[1];
                                    }
                                    path2.moveTo(f26, f25);
                                    this.C1[i30] = z10;
                                } else {
                                    i16 = i11;
                                }
                                tf.j jVar7 = this.v0;
                                f23 = jVar7 == null ? 0.0f : jVar7.f;
                                if (f14 == f11 || i24 <= 0 || jArr[i24 - 1] != 0 || i24 >= min || jArr[i24 + 1] != 0) {
                                    f24 = f23;
                                } else {
                                    f24 = f23;
                                    if (this.u0 != 2) {
                                        if (!this.C1[i30]) {
                                            if (i30 == i26) {
                                                path2.lineTo(f19, (f10 - f24) * f18);
                                            } else {
                                                path2.lineTo(f19, f18);
                                            }
                                        }
                                        this.C1[i30] = true;
                                        c10 = 0;
                                        if (i24 == min) {
                                            float measuredWidth2 = getMeasuredWidth();
                                            float measuredHeight5 = getMeasuredHeight();
                                            if (this.u0 != 2 || i30 == i26) {
                                                path2.lineTo(measuredWidth2, measuredHeight5);
                                            } else {
                                                fArr3[c10] = measuredWidth2 + centerX;
                                                fArr3[1] = measuredHeight5;
                                                matrix.reset();
                                                tf.j jVar8 = this.v0;
                                                matrix.postRotate(jVar8.f * jVar8.k[i30], centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f62 = fArr3[c10];
                                                float f63 = fArr3[1];
                                            }
                                            if (this.u0 != 2) {
                                                i17 = i26;
                                                i18 = min;
                                                f42 = f13 + measuredHeight2;
                                                f37 = f21;
                                            } else if (i30 != i26) {
                                                tf.j jVar9 = this.v0;
                                                float f64 = (centerY - jVar9.h[i30]) / (centerX - jVar9.g[i30]);
                                                if (f64 > f11) {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(-Math.atan(f64));
                                                } else {
                                                    i17 = i26;
                                                    i18 = min;
                                                    degrees = Math.toDegrees(Math.atan(Math.abs(f64)));
                                                }
                                                tf.j jVar10 = this.v0;
                                                float f65 = jVar10.g[i30];
                                                float f66 = jVar10.h[i30];
                                                fArr3[0] = f65;
                                                fArr3[1] = f66;
                                                matrix.reset();
                                                tf.j jVar11 = this.v0;
                                                float f67 = jVar11.f;
                                                matrix.postRotate((f67 * jVar11.k[i30]) + ((((float) degrees) - 90.0f) * f67), centerX, centerY);
                                                matrix.mapPoints(fArr3);
                                                float f68 = fArr3[0];
                                                float f69 = fArr3[1];
                                                if (Math.abs(f22 - f68) >= 0.001d || ((f69 >= centerY || f17 >= centerY) && (f69 <= centerY || f17 <= centerY))) {
                                                    M = M(f22, f17);
                                                    M2 = M(f68, f69);
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
                                                f42 = f13 + measuredHeight2;
                                                f37 = f21;
                                            }
                                        }
                                        i17 = i26;
                                        i18 = min;
                                        f42 = f13 + measuredHeight2;
                                        f37 = f21;
                                    }
                                }
                                if (this.C1[i30]) {
                                    if (i30 == i26) {
                                        path2.lineTo(f19, (f10 - f24) * f18);
                                    } else {
                                        path2.lineTo(f19, f18);
                                    }
                                }
                                if (i30 == i26) {
                                    path2.lineTo(f22, (f10 - f24) * f17);
                                } else {
                                    path2.lineTo(f22, f17);
                                }
                                c10 = 0;
                                this.C1[i30] = false;
                                if (i24 == min) {
                                }
                                i17 = i26;
                                i18 = min;
                                f42 = f13 + measuredHeight2;
                                f37 = f21;
                            }
                            f21 = f37;
                            f22 = f19;
                            i15 = max;
                            if (i24 == max) {
                            }
                            tf.j jVar72 = this.v0;
                            if (jVar72 == null) {
                            }
                            if (f14 == f11) {
                            }
                            f24 = f23;
                            if (this.C1[i30]) {
                            }
                            if (i30 == i26) {
                            }
                            c10 = 0;
                            this.C1[i30] = false;
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f42 = f13 + measuredHeight2;
                            f37 = f21;
                        }
                        i12 = i25;
                        f14 = 0.0f;
                        float[] fArr22 = ((sf.e) this.d0).b;
                        f15 = (fArr22[i24] * f38) - f39;
                        if (i24 != min) {
                        }
                        if (f14 == f11) {
                            z13 = true;
                        }
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - i11) * f14;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight22) - f13;
                        this.D1[i30] = measuredHeight;
                        float measuredHeight32 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.u0;
                        float f442 = measuredWidth;
                        float[] fArr32 = this.A1;
                        i14 = i12;
                        Matrix matrix2 = this.z1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f17 = measuredHeight;
                        f18 = f16;
                        f19 = f15;
                        f20 = 0.0f;
                        f21 = f37;
                        f22 = f19;
                        i15 = max;
                        if (i24 == max) {
                        }
                        tf.j jVar722 = this.v0;
                        if (jVar722 == null) {
                        }
                        if (f14 == f11) {
                        }
                        f24 = f23;
                        if (this.C1[i30]) {
                        }
                        if (i30 == i26) {
                        }
                        c10 = 0;
                        this.C1[i30] = false;
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f42 = f13 + measuredHeight22;
                        f37 = f21;
                    } else {
                        if (f41 != f11) {
                            i12 = i25;
                            f14 = (jArr[i24] * fVar2.o) / f41;
                            float[] fArr222 = ((sf.e) this.d0).b;
                            f15 = (fArr222[i24] * f38) - f39;
                            if (i24 != min) {
                            }
                            if (f14 == f11) {
                            }
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                            measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight222) - f13;
                            this.D1[i30] = measuredHeight;
                            float measuredHeight322 = getMeasuredHeight() - this.s;
                            if (i24 != min) {
                            }
                            i13 = this.u0;
                            float f4422 = measuredWidth;
                            float[] fArr322 = this.A1;
                            i14 = i12;
                            Matrix matrix22 = this.z1;
                            if (i13 == 2) {
                            }
                            arrayList2 = arrayList;
                            f17 = measuredHeight;
                            f18 = f16;
                            f19 = f15;
                            f20 = 0.0f;
                            f21 = f37;
                            f22 = f19;
                            i15 = max;
                            if (i24 == max) {
                            }
                            tf.j jVar7222 = this.v0;
                            if (jVar7222 == null) {
                            }
                            if (f14 == f11) {
                            }
                            f24 = f23;
                            if (this.C1[i30]) {
                            }
                            if (i30 == i26) {
                            }
                            c10 = 0;
                            this.C1[i30] = false;
                            if (i24 == min) {
                            }
                            i17 = i26;
                            i18 = min;
                            f42 = f13 + measuredHeight222;
                            f37 = f21;
                        }
                        i12 = i25;
                        f14 = 0.0f;
                        float[] fArr2222 = ((sf.e) this.d0).b;
                        f15 = (fArr2222[i24] * f38) - f39;
                        if (i24 != min) {
                        }
                        if (f14 == f11) {
                        }
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - i11) * f14;
                        measuredHeight = ((getMeasuredHeight() - this.s) - measuredHeight2222) - f13;
                        this.D1[i30] = measuredHeight;
                        float measuredHeight3222 = getMeasuredHeight() - this.s;
                        if (i24 != min) {
                        }
                        i13 = this.u0;
                        float f44222 = measuredWidth;
                        float[] fArr3222 = this.A1;
                        i14 = i12;
                        Matrix matrix222 = this.z1;
                        if (i13 == 2) {
                        }
                        arrayList2 = arrayList;
                        f17 = measuredHeight;
                        f18 = f16;
                        f19 = f15;
                        f20 = 0.0f;
                        f21 = f37;
                        f22 = f19;
                        i15 = max;
                        if (i24 == max) {
                        }
                        tf.j jVar72222 = this.v0;
                        if (jVar72222 == null) {
                        }
                        if (f14 == f11) {
                        }
                        f24 = f23;
                        if (this.C1[i30]) {
                        }
                        if (i30 == i26) {
                        }
                        c10 = 0;
                        this.C1[i30] = false;
                        if (i24 == min) {
                        }
                        i17 = i26;
                        i18 = min;
                        f42 = f13 + measuredHeight2222;
                        f37 = f21;
                    }
                    f36 = f43;
                    i30++;
                    min = i18;
                    i26 = i17;
                    max = i15;
                    i25 = i14;
                    i11 = i16;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
                i24++;
                min = min;
                f33 = f38;
                f35 = f39;
                f12 = f40;
                z12 = z13;
                i10 = i29;
                f11 = 0.0f;
            }
            int i32 = i10;
            ArrayList arrayList3 = arrayList;
            boolean z15 = z12;
            canvas.save();
            canvas.clipRect(f37, i11, f36, getMeasuredHeight() - this.s);
            if (z15) {
                canvas.drawColor(g6.w0(null, g6.rj, false));
            }
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                tf.f fVar3 = (tf.f) arrayList3.get(size);
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
    @Override // rf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(Canvas canvas) {
        int i10;
        boolean z10;
        float f10;
        boolean z11;
        sf.b bVar;
        if (this.d0 != null) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((tf.i) arrayList.get(i11)).g.reset();
            }
            sf.b bVar2 = this.d0;
            int i12 = ((sf.e) bVar2).n;
            boolean[] zArr = this.C1;
            if (zArr == null || zArr.length < ((sf.e) bVar2).d.size()) {
                this.C1 = new boolean[((sf.e) this.d0).d.size()];
            }
            boolean z12 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                float f11 = 0.0f;
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    tf.f fVar = (tf.f) arrayList.get(i16);
                    if (fVar.n || fVar.o != 0.0f) {
                        if (((sf.e) this.d0).m[i16][i13] > 0) {
                            f11 += ((sf.e) r12).m[i16][i13] * fVar.o;
                            i14++;
                        }
                        i15 = i16;
                    }
                }
                int i17 = i12 - 1;
                float f12 = (i13 / i17) * this.y0;
                int i18 = 0;
                float f13 = 0.0f;
                while (i18 < arrayList.size()) {
                    tf.f fVar2 = (tf.f) arrayList.get(i18);
                    boolean z13 = fVar2.n;
                    Path path = fVar2.g;
                    if (!z13 && fVar2.o == 0.0f) {
                        i10 = i12;
                    } else if (i14 == 1) {
                        if (((sf.e) this.d0).m[i18][i13] != 0) {
                            f10 = fVar2.o;
                            i10 = i12;
                            z10 = z12;
                            boolean z14 = (f10 == 0.0f || i18 != i15) ? z10 : true;
                            int i19 = this.x0;
                            float f14 = f10 * i19;
                            float f15 = (i19 - f14) - f13;
                            if (i13 != 0) {
                                z11 = z14;
                                path.moveTo(0.0f, i19);
                                this.C1[i18] = false;
                            } else {
                                z11 = z14;
                            }
                            bVar = this.d0;
                            if (((sf.e) bVar).m[i18][i13] == 0 || i13 <= 0 || ((sf.e) bVar).m[i18][i13 - 1] != 0 || i13 >= i17 || ((sf.e) bVar).m[i18][i13 + 1] != 0) {
                                if (this.C1[i18]) {
                                    path.lineTo(f12, i19);
                                }
                                path.lineTo(f12, f15);
                                this.C1[i18] = false;
                            } else {
                                if (!this.C1[i18]) {
                                    path.lineTo(f12, i19);
                                }
                                this.C1[i18] = true;
                            }
                            if (i13 == i17) {
                                path.lineTo(this.y0, i19);
                            }
                            f13 += f14;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i192 = this.x0;
                        float f142 = f10 * i192;
                        float f152 = (i192 - f142) - f13;
                        if (i13 != 0) {
                        }
                        bVar = this.d0;
                        if (((sf.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.C1[i18]) {
                        }
                        path.lineTo(f12, f152);
                        this.C1[i18] = false;
                        if (i13 == i17) {
                        }
                        f13 += f142;
                        z12 = z11;
                    } else {
                        if (f11 != 0.0f) {
                            i10 = i12;
                            z10 = z12;
                            f10 = (((sf.e) this.d0).m[i18][i13] * fVar2.o) / f11;
                            if (f10 == 0.0f) {
                            }
                            int i1922 = this.x0;
                            float f1422 = f10 * i1922;
                            float f1522 = (i1922 - f1422) - f13;
                            if (i13 != 0) {
                            }
                            bVar = this.d0;
                            if (((sf.e) bVar).m[i18][i13] == 0) {
                            }
                            if (this.C1[i18]) {
                            }
                            path.lineTo(f12, f1522);
                            this.C1[i18] = false;
                            if (i13 == i17) {
                            }
                            f13 += f1422;
                            z12 = z11;
                        }
                        i10 = i12;
                        z10 = z12;
                        f10 = 0.0f;
                        if (f10 == 0.0f) {
                        }
                        int i19222 = this.x0;
                        float f14222 = f10 * i19222;
                        float f15222 = (i19222 - f14222) - f13;
                        if (i13 != 0) {
                        }
                        bVar = this.d0;
                        if (((sf.e) bVar).m[i18][i13] == 0) {
                        }
                        if (this.C1[i18]) {
                        }
                        path.lineTo(f12, f15222);
                        this.C1[i18] = false;
                        if (i13 == i17) {
                        }
                        f13 += f14222;
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
                tf.f fVar3 = (tf.f) arrayList.get(size2);
                canvas.drawPath(fVar3.g, fVar3.c);
            }
        }
    }

    @Override // rf.g, android.view.View
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
            l(canvas, (tf.d) arrayList.get(i11));
            p(canvas, (tf.d) arrayList.get(this.j0));
            i10 = this.j0 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    @Override // rf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(tf.j jVar) {
        ArrayList arrayList;
        int i10;
        float f10;
        sf.b bVar = this.d0;
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
        int i11 = 2;
        int i12 = 1;
        int i13 = ((int) (f15 / (((sf.e) bVar).b.length < 2 ? 1.0f : ((sf.e) bVar).b[1] * f14))) + 1;
        int max = Math.max(0, (this.B - i13) - 1);
        int min = Math.min(((sf.e) this.d0).b.length - 1, this.C + i13 + 1);
        this.v0.g = new float[((sf.e) this.d0).d.size()];
        this.v0.h = new float[((sf.e) this.d0).d.size()];
        this.v0.i = new float[((sf.e) this.d0).d.size()];
        this.v0.j = new float[((sf.e) this.d0).d.size()];
        this.v0.k = new float[((sf.e) this.d0).d.size()];
        int i14 = 0;
        while (i14 < i11) {
            int i15 = i14 == i12 ? min : max;
            int i16 = 0;
            float f17 = 0.0f;
            int i17 = 0;
            while (true) {
                arrayList = this.d;
                if (i16 >= arrayList.size()) {
                    break;
                }
                tf.f fVar = (tf.f) arrayList.get(i16);
                if (fVar.n || fVar.o != 0.0f) {
                    long j10 = fVar.a.a[i15];
                    if (j10 > 0) {
                        f17 += j10 * fVar.o;
                        i17++;
                    }
                }
                i16++;
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList.size()) {
                tf.f fVar2 = (tf.f) arrayList.get(i18);
                if (fVar2.n || fVar2.o != 0.0f) {
                    long[] jArr = fVar2.a.a;
                    if (i17 == i12) {
                        if (jArr[i15] != 0) {
                            f10 = fVar2.o;
                            i10 = i14;
                            float f18 = (((sf.e) this.d0).b[i15] * f14) - f16;
                            float measuredHeight = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f19 = i19;
                            float measuredHeight2 = ((getMeasuredHeight() - this.s) - measuredHeight) - f19;
                            i19 = (int) (f19 + measuredHeight);
                            if (i10 != 0) {
                                tf.j jVar3 = this.v0;
                                jVar3.g[i18] = f18;
                                jVar3.h[i18] = measuredHeight2;
                            } else {
                                tf.j jVar4 = this.v0;
                                jVar4.i[i18] = f18;
                                jVar4.j[i18] = measuredHeight2;
                            }
                        }
                        i10 = i14;
                        f10 = 0.0f;
                        float f182 = (((sf.e) this.d0).b[i15] * f14) - f16;
                        float measuredHeight3 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f192 = i19;
                        float measuredHeight22 = ((getMeasuredHeight() - this.s) - measuredHeight3) - f192;
                        i19 = (int) (f192 + measuredHeight3);
                        if (i10 != 0) {
                        }
                    } else {
                        if (f17 != 0.0f) {
                            i10 = i14;
                            f10 = (jArr[i15] * fVar2.o) / f17;
                            float f1822 = (((sf.e) this.d0).b[i15] * f14) - f16;
                            float measuredHeight32 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                            float f1922 = i19;
                            float measuredHeight222 = ((getMeasuredHeight() - this.s) - measuredHeight32) - f1922;
                            i19 = (int) (f1922 + measuredHeight32);
                            if (i10 != 0) {
                            }
                        }
                        i10 = i14;
                        f10 = 0.0f;
                        float f18222 = (((sf.e) this.d0).b[i15] * f14) - f16;
                        float measuredHeight322 = f10 * ((getMeasuredHeight() - this.s) - g.j1);
                        float f19222 = i19;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.s) - measuredHeight322) - f19222;
                        i19 = (int) (f19222 + measuredHeight322);
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

    @Override // rf.g
    public final long r(int i10, int i11) {
        return 100L;
    }
}
