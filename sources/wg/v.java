package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final ow0 a;
    public final View b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.h5, d6Var));
        ow0 ow0Var = new ow0(context, d6Var);
        this.a = ow0Var;
        addView(ow0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.b7));
    }

    public void setCallBack(nw0 nw0Var) {
        this.a.setCallback(nw0Var);
    }
}
