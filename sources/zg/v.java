package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.ut0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final ut0 a;
    public final View b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, mf.o(-1, -1));
        r6.i(k6.h5, view, e6Var);
        ut0 ut0Var = new ut0(context, e6Var);
        this.a = ut0Var;
        addView(ut0Var, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.a0(this, getContext(), R.drawable.greydivider_top, k6.b7);
    }

    public void setCallBack(tt0 tt0Var) {
        this.a.setCallback(tt0Var);
    }
}
