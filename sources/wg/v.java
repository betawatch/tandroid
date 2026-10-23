package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final pw0 a;
    public final View b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.h5, d6Var));
        pw0 pw0Var = new pw0(context, d6Var);
        this.a = pw0Var;
        addView(pw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.b7));
    }

    public void setCallBack(ow0 ow0Var) {
        this.a.setCallback(ow0Var);
    }
}
