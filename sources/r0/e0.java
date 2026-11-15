package r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class e0 {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i10);
    }
}
