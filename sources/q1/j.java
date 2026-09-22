package q1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        l a2 = l.a();
        a2.getClass();
        return a2.e(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
