// default package

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q43 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ u43 e;

    public /* synthetic */ q43(u43 u43Var, ao6 ao6Var, int i, int i2, byte b) {
        this.a = b;
        this.e = u43Var;
        this.b = ao6Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f;
        float f2;
        float f3;
        float f4;
        byte b = this.a;
        ao6 ao6Var = this.b;
        u43 u43Var = this.e;
        int i = this.d;
        int i2 = this.c;
        switch (b) {
            case 0:
                u43Var.l(false);
                CropAreaView cropAreaView = u43Var.a;
                if (ao6Var != null) {
                    float f5 = ao6Var.v;
                    if (f5 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f5);
                        t43 t43Var = u43Var.N;
                        if (t43Var != null) {
                            t43Var.H0(true);
                        }
                    }
                    u43Var.setFreeform(ao6Var.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = ao6Var.k;
                    if (i3 == 90 || i3 == 270) {
                        aspectRatio = 1.0f / aspectRatio;
                        s43 s43Var = u43Var.M;
                        f = s43Var.b;
                        f2 = s43Var.a;
                        i2 = i;
                        i = i2;
                    } else {
                        s43 s43Var2 = u43Var.M;
                        f = s43Var2.a;
                        f2 = s43Var2.b;
                    }
                    if (!u43Var.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                        cropAreaView.e(u43Var.getCurrentWidth(), u43Var.getCurrentHeight(), (((float) i3) + u43Var.M.g) % 180.0f != 0.0f, u43Var.y);
                    } else {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    }
                    u43Var.M.d(i3);
                    cropAreaView.setActualRect((aspectRatio * ao6Var.e) / ao6Var.f);
                    s43 s43Var3 = u43Var.M;
                    s43Var3.j = ao6Var.l;
                    s43Var3.e(ao6Var.d);
                    s43 s43Var4 = u43Var.M;
                    float f6 = ao6Var.a * i;
                    float f7 = s43Var4.f;
                    s43Var4.g(f6 * f7, ao6Var.b * i2 * f7);
                    float max = Math.max(cropAreaView.getCropWidth() / f, cropAreaView.getCropHeight() / f2);
                    s43 s43Var5 = u43Var.M;
                    s43Var5.f(ao6Var.c * (max / s43Var5.f), 0.0f, 0.0f);
                    u43Var.r(false);
                    t43 t43Var2 = u43Var.N;
                    if (t43Var2 != null) {
                        t43Var2.R0(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            default:
                u43Var.l(false);
                CropAreaView cropAreaView2 = u43Var.a;
                if (ao6Var != null) {
                    float f8 = ao6Var.v;
                    if (f8 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f8);
                        t43 t43Var3 = u43Var.N;
                        if (t43Var3 != null) {
                            t43Var3.H0(true);
                        }
                    }
                    u43Var.setFreeform(ao6Var.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i4 = ao6Var.k;
                    if (i4 == 90 || i4 == 270) {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        s43 s43Var6 = u43Var.M;
                        f3 = s43Var6.b;
                        f4 = s43Var6.a;
                        i2 = i;
                        i = i2;
                    } else {
                        s43 s43Var7 = u43Var.M;
                        f3 = s43Var7.a;
                        f4 = s43Var7.b;
                    }
                    if (!u43Var.y || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.e(u43Var.getCurrentWidth(), u43Var.getCurrentHeight(), (((float) i4) + u43Var.M.g) % 180.0f != 0.0f, u43Var.y);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    u43Var.M.d(i4);
                    cropAreaView2.setActualRect((aspectRatio2 * ao6Var.e) / ao6Var.f);
                    s43 s43Var8 = u43Var.M;
                    s43Var8.j = ao6Var.l;
                    s43Var8.e(ao6Var.d);
                    s43 s43Var9 = u43Var.M;
                    float f9 = ao6Var.a * i;
                    float f10 = s43Var9.f;
                    s43Var9.g(f9 * f10, ao6Var.b * i2 * f10);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f3, cropAreaView2.getCropHeight() / f4);
                    s43 s43Var10 = u43Var.M;
                    s43Var10.f(ao6Var.c * (max2 / s43Var10.f), 0.0f, 0.0f);
                    u43Var.r(false);
                    t43 t43Var4 = u43Var.N;
                    if (t43Var4 != null) {
                        t43Var4.R0(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return false;
    }
}
