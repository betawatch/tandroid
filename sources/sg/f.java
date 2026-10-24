package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public f(Context context, g6 g6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        k3.m(15.0f, 1, textView);
        r6.W(textView, k6.G6, g6Var);
        addView(textView, z5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        r6.W(textView2, k6.y6, g6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, g6Var, 20);
        this.c = limitPreviewView;
        addView(limitPreviewView, z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.a.setText(eVar.a);
        this.b.setText(eVar.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(eVar.c)));
    }
}
