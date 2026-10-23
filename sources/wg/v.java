package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final sw0 a;
    public final View b;

    public v(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, z5.n(-1, -1));
        r6.i(k6.h5, view, g6Var);
        sw0 sw0Var = new sw0(context, g6Var);
        this.a = sw0Var;
        addView(sw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.b0(R.drawable.greydivider_top, k6.b7, getContext(), this, null);
    }

    public void setCallBack(rw0 rw0Var) {
        this.a.setCallback(rw0Var);
    }
}
