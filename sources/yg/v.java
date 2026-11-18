package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.eu0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final eu0 a;
    public final View b;

    public v(Context context, i6 i6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ma.o(-1, -1));
        u6.h(n6.h5, view, i6Var);
        eu0 eu0Var = new eu0(context, i6Var);
        this.a = eu0Var;
        addView(eu0Var, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        u6.Z(this, getContext(), R.drawable.greydivider_top, n6.b7);
    }

    public void setCallBack(du0 du0Var) {
        this.a.setCallback(du0Var);
    }
}
