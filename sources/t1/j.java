package t1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {
    public final TransformationMethod a;

    public j(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l.a().b() != 1) {
            return charSequence;
        }
        l a10 = l.a();
        a10.getClass();
        return a10.e(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i7, rect);
        }
    }
}
