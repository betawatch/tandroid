// default package

import android.app.Activity;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
