// default package

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ua9 extends n21 {
    public final va9 c;

    public ua9(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        va9 va9Var = new va9();
        this.c = va9Var;
        imageView.setImageDrawable(va9Var);
    }

    @Override // z11
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        va9 va9Var = this.c;
        va9Var.getClass();
        va9Var.g = System.currentTimeMillis();
        va9Var.invalidateSelf();
    }

    @Override // z11
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        va9 va9Var = this.c;
        va9Var.g = -1L;
        va9Var.invalidateSelf();
    }
}
