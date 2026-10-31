package rh;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a9 extends b2.h {
    public final ArrayList b;
    public final RuntimeShader c;
    public RenderEffect d;
    public int e;
    public int f;
    public int g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;

    public a9(View view) {
        super(view);
        this.b = new ArrayList();
        this.i = new float[7];
        this.j = new float[7];
        this.k = new float[7];
        this.l = new float[7];
        RuntimeShader runtimeShader = new RuntimeShader(org.telegram.messenger.i0.y2(null, R.raw.superripple_effect));
        this.c = runtimeShader;
        e1(true);
        this.d = RenderEffect.createRuntimeShaderEffect(runtimeShader, "img");
    }

    public final void e1(boolean z10) {
        View view = (View) this.a;
        if (z10 || this.f != view.getWidth() || this.g != view.getHeight() || Math.abs(this.h - org.telegram.messenger.i0.p) > 0.01f) {
            RuntimeShader runtimeShader = this.c;
            int width = view.getWidth();
            this.f = width;
            int height = view.getHeight();
            this.g = height;
            runtimeShader.setFloatUniform("size", width, height);
            RuntimeShader runtimeShader2 = this.c;
            float f7 = org.telegram.messenger.i0.p;
            this.h = f7;
            runtimeShader2.setFloatUniform("density", f7);
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = rootWindowInsets == null ? null : rootWindowInsets.getRoundedCorner(3);
            this.c.setFloatUniform("radius", ((rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null) == null || (view != view.getRootView() && org.telegram.messenger.i0.n > 0)) ? 0.0f : r1.getRadius(), roundedCorner2 == null ? 0.0f : roundedCorner2.getRadius(), (roundedCorner3 == null || (view != view.getRootView() && org.telegram.messenger.i0.n > 0)) ? 0.0f : roundedCorner3.getRadius(), roundedCorner != null ? roundedCorner.getRadius() : 0.0f);
        }
    }

    public final void f1() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        View view = (View) this.a;
        ArrayList arrayList = this.b;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            boolean z11 = true;
            boolean z12 = this.e != Math.min(7, arrayList.size());
            this.e = Math.min(7, arrayList.size());
            int i10 = 0;
            while (true) {
                int i11 = this.e;
                fArr = this.l;
                fArr2 = this.k;
                fArr3 = this.j;
                fArr4 = this.i;
                if (i10 >= i11) {
                    break;
                }
                z8 z8Var = (z8) arrayList.get(i10);
                boolean z13 = z12 || Math.abs(fArr4[i10] - z8Var.d) > 0.001f;
                float f7 = z8Var.d;
                float f10 = z8Var.c;
                float f11 = z8Var.b;
                float f12 = z8Var.a;
                fArr4[i10] = f7;
                boolean z14 = z13 || Math.abs(fArr3[i10] - f12) > 0.001f;
                fArr3[i10] = f12;
                boolean z15 = z14 || Math.abs(fArr2[i10] - f11) > 0.001f;
                fArr2[i10] = f11;
                z12 = z15 || Math.abs(fArr[i10] - f10) > 0.001f;
                fArr[i10] = f10;
                i10++;
            }
            if (!z12 && this.f == view.getWidth() && this.g == view.getHeight() && Math.abs(this.h - org.telegram.messenger.i0.p) <= 0.01f) {
                z11 = false;
            }
            if (z11) {
                this.c.setIntUniform("count", this.e);
                this.c.setFloatUniform("t", fArr4);
                this.c.setFloatUniform("centerX", fArr3);
                this.c.setFloatUniform("centerY", fArr2);
                this.c.setFloatUniform("intensity", fArr);
                e1(false);
                this.d = RenderEffect.createRuntimeShaderEffect(this.c, "img");
            }
            z10 = z11;
        }
        view.setRenderEffect(arrayList.isEmpty() ? null : this.d);
        if (z10) {
            view.invalidate();
        }
    }
}
