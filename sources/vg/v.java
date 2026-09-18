package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fw0;
import w7.y5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final fw0 a;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        addView(view, y5.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.h5, e6Var));
        fw0 fw0Var = new fw0(context, e6Var);
        this.a = fw0Var;
        addView(fw0Var, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.b7));
    }

    public void setCallBack(ew0 ew0Var) {
        this.a.setCallback(ew0Var);
    }
}
