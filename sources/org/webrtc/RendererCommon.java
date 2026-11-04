package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public interface GlDrawer {
        void drawOes(int i3, int i10, int i11, int i12, int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10);

        void drawRgb(int i3, int i10, int i11, int i12, int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10);

        void drawYuv(int[] iArr, int i3, int i10, int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10);

        void release();
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i3, int i10, int i11);
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        
            if ((r11 > 1.0f) == (r12 > 1.0f)) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Point measure(boolean z10, int i3, int i10, int i11, int i12) {
            int defaultSize = View.getDefaultSize(ConnectionsManager.DEFAULT_DATACENTER_ID, i3);
            int defaultSize2 = View.getDefaultSize(ConnectionsManager.DEFAULT_DATACENTER_ID, i10);
            if (i11 == 0 || i12 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f10 = i11 / i12;
            float f11 = defaultSize / defaultSize2;
            Point displaySize = RendererCommon.getDisplaySize(((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) > 0) == ((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) > 0) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f10, defaultSize, defaultSize2);
            if (!z10) {
                if (View.MeasureSpec.getMode(i3) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i10) != 1073741824) {
                }
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f10, float f11) {
            this.visibleFractionMatchOrientation = f10;
            this.visibleFractionMismatchOrientation = f11;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f10 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f10;
        float f11 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f11;
        fArr[12] = f10 + 0.5f;
        fArr[13] = f11 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int ordinal = scalingType.ordinal();
        if (ordinal == 0) {
            return 1.0f;
        }
        if (ordinal == 1) {
            return 0.0f;
        }
        if (ordinal == 2) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f10, int i3, int i10) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f10, i3, i10);
    }

    public static float[] getLayoutMatrix(boolean z10, float f10, float f11) {
        float f12;
        float f13;
        if (f11 > f10) {
            f13 = f10 / f11;
            f12 = 1.0f;
        } else {
            f12 = f11 / f10;
            f13 = 1.0f;
        }
        if (z10) {
            f12 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f12, f13, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f10, float f11, int i3, int i10) {
        return (f10 == 0.0f || f11 == 0.0f) ? new Point(i3, i10) : new Point(Math.min(i3, Math.round((i10 / f10) * f11)), Math.min(i10, Math.round((i3 / f10) / f11)));
    }
}
