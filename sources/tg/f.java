package tg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public f(Context context, u6 u6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        ic.a.o(15.0f, 1, textView);
        f7.V(textView, y6.G6, u6Var);
        addView(textView, kb1.t(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        f7.V(textView2, y6.y6, u6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, kb1.t(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, u6Var, 20);
        this.c = limitPreviewView;
        addView(limitPreviewView, kb1.t(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.a.setText(eVar.a);
        this.b.setText(eVar.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(eVar.c)));
    }
}
