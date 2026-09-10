package x4;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // x4.k
    public final boolean a() {
        return this.f.l() || this.d.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // x4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        a5.a aVar;
        a5.a aVar2 = this.f;
        boolean z11 = true;
        if (aVar2.l()) {
            ColorStateList colorStateList = (ColorStateList) aVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != aVar2.b) {
                aVar2.b = colorForState;
                z10 = true;
                aVar = this.d;
                if (aVar.l()) {
                    ColorStateList colorStateList2 = (ColorStateList) aVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != aVar.b) {
                        aVar.b = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        aVar = this.d;
        if (aVar.l()) {
        }
        z11 = false;
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f.b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.i = f7;
    }
}
