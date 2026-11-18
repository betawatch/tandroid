package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class u1 extends Layout {
    public final t1 a;

    public u1(t1 t1Var) {
        super(t1Var.a, v1.b, Math.max(1, t1Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.a = t1Var;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas) {
    }

    @Override // android.text.Layout
    public final int getBottomPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisCount(int i7) {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisStart(int i7) {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean getLineContainsTab(int i7) {
        return false;
    }

    @Override // android.text.Layout
    public final int getLineCount() {
        return this.a.g.length;
    }

    @Override // android.text.Layout
    public final int getLineDescent(int i7) {
        return 0;
    }

    @Override // android.text.Layout
    public final Layout.Directions getLineDirections(int i7) {
        return null;
    }

    @Override // android.text.Layout
    public final int getLineForOffset(int i7) {
        int i10 = 0;
        while (true) {
            t1 t1Var = this.a;
            if (i10 >= t1Var.g.length) {
                return r2.length - 1;
            }
            int i11 = i10 + 1;
            if (i7 < t1Var.e[i11]) {
                return i10;
            }
            i10 = i11;
        }
    }

    @Override // android.text.Layout
    public final float getLineLeft(int i7) {
        return this.a.g[Math.max(0, Math.min(i7, r0.length - 1))][0];
    }

    @Override // android.text.Layout
    public final float getLineMax(int i7) {
        return getLineRight(i7);
    }

    @Override // android.text.Layout
    public final float getLineRight(int i7) {
        return this.a.g[Math.max(0, Math.min(i7, r0.length - 1))][r3.length - 1];
    }

    @Override // android.text.Layout
    public final int getLineStart(int i7) {
        t1 t1Var = this.a;
        return t1Var.e[Math.max(0, Math.min(i7, t1Var.g.length))];
    }

    @Override // android.text.Layout
    public final int getLineTop(int i7) {
        t1 t1Var = this.a;
        return t1Var.f[Math.max(0, Math.min(i7, t1Var.g.length))];
    }

    @Override // android.text.Layout
    public final float getLineWidth(int i7) {
        return getLineRight(i7) - getLineLeft(i7);
    }

    @Override // android.text.Layout
    public final int getOffsetForHorizontal(int i7, float f10) {
        t1 t1Var = this.a;
        int max = Math.max(0, Math.min(i7, t1Var.g.length - 1));
        float[] fArr = t1Var.g[max];
        int[] iArr = t1Var.e;
        int i10 = iArr[max + 1] - iArr[max];
        int i11 = 0;
        for (int i12 = 0; i12 <= i10 && i12 < fArr.length; i12++) {
            if (i12 < i10) {
                int i13 = i12 + 1;
                if (f10 >= (fArr[i12] + fArr[i13]) / 2.0f) {
                    i11 = i13;
                }
            }
        }
        if (i11 == i10 && i10 > 0 && max < t1Var.g.length - 1 && Character.isWhitespace(t1Var.a.charAt((t1Var.e[max] + i10) - 1))) {
            i11--;
        }
        return t1Var.e[max] + i11;
    }

    @Override // android.text.Layout
    public final int getParagraphDirection(int i7) {
        return 1;
    }

    @Override // android.text.Layout
    public final float getPrimaryHorizontal(int i7) {
        int lineForOffset = getLineForOffset(i7);
        t1 t1Var = this.a;
        return t1Var.g[lineForOffset][Math.max(0, Math.min(i7 - t1Var.e[lineForOffset], r2.length - 1))];
    }

    @Override // android.text.Layout
    public final float getSecondaryHorizontal(int i7) {
        return getPrimaryHorizontal(i7);
    }

    @Override // android.text.Layout
    public final void getSelectionPath(int i7, int i10, Path path) {
        Path path2;
        path.reset();
        if (i7 == i10) {
            return;
        }
        if (i10 < i7) {
            i10 = i7;
            i7 = i10;
        }
        int lineForOffset = getLineForOffset(i7);
        int lineForOffset2 = getLineForOffset(i10);
        int i11 = lineForOffset;
        while (i11 <= lineForOffset2) {
            float primaryHorizontal = i11 == lineForOffset ? getPrimaryHorizontal(i7) : getLineLeft(i11);
            float primaryHorizontal2 = i11 == lineForOffset2 ? getPrimaryHorizontal(i10) : getLineRight(i11);
            if (primaryHorizontal2 > primaryHorizontal) {
                path2 = path;
                path2.addRect(primaryHorizontal, getLineTop(i11), primaryHorizontal2, getLineTop(i11 + 1), Path.Direction.CW);
            } else {
                path2 = path;
            }
            i11++;
            path = path2;
        }
    }

    @Override // android.text.Layout
    public final int getTopPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean isRtlCharAt(int i7) {
        return false;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas, Path path, Paint paint, int i7) {
    }
}
