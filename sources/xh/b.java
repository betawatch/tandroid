package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final e6 a;
    public final int b;

    public b(Context context, int i10, e6 e6Var) {
        super(context);
        this.b = i10;
        this.a = e6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
