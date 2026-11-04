package z4;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import b8.kg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends k {
    public kg d;
    public float e;
    public kg f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // z4.j
    public final boolean a() {
        return this.f.o() || this.d.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // z4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        kg kgVar;
        kg kgVar2 = this.f;
        boolean z11 = true;
        if (kgVar2.o()) {
            ColorStateList colorStateList = (ColorStateList) kgVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != kgVar2.b) {
                kgVar2.b = colorForState;
                z10 = true;
                kgVar = this.d;
                if (kgVar.o()) {
                    ColorStateList colorStateList2 = (ColorStateList) kgVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != kgVar.b) {
                        kgVar.b = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        kgVar = this.d;
        if (kgVar.o()) {
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

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i3) {
        this.f.b = i3;
    }

    public void setStrokeAlpha(float f10) {
        this.g = f10;
    }

    public void setStrokeColor(int i3) {
        this.d.b = i3;
    }

    public void setStrokeWidth(float f10) {
        this.e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.i = f10;
    }
}
