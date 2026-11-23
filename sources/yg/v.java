package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.gu0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final gu0 a;
    public final View b;

    public v(Context context, i6 i6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, na.o(-1, -1));
        u6.h(n6.h5, view, i6Var);
        gu0 gu0Var = new gu0(context, i6Var);
        this.a = gu0Var;
        addView(gu0Var, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        u6.Z(this, getContext(), R.drawable.greydivider_top, n6.b7);
    }

    public void setCallBack(fu0 fu0Var) {
        this.a.setCallback(fu0Var);
    }
}
