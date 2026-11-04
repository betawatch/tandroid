package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class l0 extends Layout {
    public final k0 a;

    public l0(k0 k0Var) {
        super(k0Var.a, m0.b, Math.max(1, k0Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.a = k0Var;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas) {
    }

    @Override // android.text.Layout
    public final int getBottomPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisCount(int i3) {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisStart(int i3) {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean getLineContainsTab(int i3) {
        return false;
    }

    @Override // android.text.Layout
    public final int getLineCount() {
        return this.a.g.length;
    }

    @Override // android.text.Layout
    public final int getLineDescent(int i3) {
        return 0;
    }

    @Override // android.text.Layout
    public final Layout.Directions getLineDirections(int i3) {
        return null;
    }

    @Override // android.text.Layout
    public final int getLineForOffset(int i3) {
        int i10 = 0;
        while (true) {
            k0 k0Var = this.a;
            if (i10 >= k0Var.g.length) {
                return r2.length - 1;
            }
            int i11 = i10 + 1;
            if (i3 < k0Var.e[i11]) {
                return i10;
            }
            i10 = i11;
        }
    }

    @Override // android.text.Layout
    public final float getLineLeft(int i3) {
        return this.a.g[Math.max(0, Math.min(i3, r0.length - 1))][0];
    }

    @Override // android.text.Layout
    public final float getLineMax(int i3) {
        return getLineRight(i3);
    }

    @Override // android.text.Layout
    public final float getLineRight(int i3) {
        return this.a.g[Math.max(0, Math.min(i3, r0.length - 1))][r3.length - 1];
    }

    @Override // android.text.Layout
    public final int getLineStart(int i3) {
        k0 k0Var = this.a;
        return k0Var.e[Math.max(0, Math.min(i3, k0Var.g.length))];
    }

    @Override // android.text.Layout
    public final int getLineTop(int i3) {
        k0 k0Var = this.a;
        return k0Var.f[Math.max(0, Math.min(i3, k0Var.g.length))];
    }

    @Override // android.text.Layout
    public final float getLineWidth(int i3) {
        return getLineRight(i3) - getLineLeft(i3);
    }

    @Override // android.text.Layout
    public final int getOffsetForHorizontal(int i3, float f10) {
        k0 k0Var = this.a;
        int max = Math.max(0, Math.min(i3, k0Var.g.length - 1));
        float[] fArr = k0Var.g[max];
        int[] iArr = k0Var.e;
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
        if (i11 == i10 && i10 > 0 && max < k0Var.g.length - 1 && Character.isWhitespace(k0Var.a.charAt((k0Var.e[max] + i10) - 1))) {
            i11--;
        }
        return k0Var.e[max] + i11;
    }

    @Override // android.text.Layout
    public final int getParagraphDirection(int i3) {
        return 1;
    }

    @Override // android.text.Layout
    public final float getPrimaryHorizontal(int i3) {
        int lineForOffset = getLineForOffset(i3);
        k0 k0Var = this.a;
        return k0Var.g[lineForOffset][Math.max(0, Math.min(i3 - k0Var.e[lineForOffset], r2.length - 1))];
    }

    @Override // android.text.Layout
    public final float getSecondaryHorizontal(int i3) {
        return getPrimaryHorizontal(i3);
    }

    @Override // android.text.Layout
    public final void getSelectionPath(int i3, int i10, Path path) {
        Path path2;
        path.reset();
        if (i3 == i10) {
            return;
        }
        if (i10 < i3) {
            i10 = i3;
            i3 = i10;
        }
        int lineForOffset = getLineForOffset(i3);
        int lineForOffset2 = getLineForOffset(i10);
        int i11 = lineForOffset;
        while (i11 <= lineForOffset2) {
            float primaryHorizontal = i11 == lineForOffset ? getPrimaryHorizontal(i3) : getLineLeft(i11);
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
    public final boolean isRtlCharAt(int i3) {
        return false;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas, Path path, Paint paint, int i3) {
    }
}
