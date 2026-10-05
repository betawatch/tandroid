package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class f extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public f(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(i6.v0(i6.G6, d6Var));
        addView(textView, z5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        bi.m(i6.y6, d6Var, textView2, 1, 14.0f);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, d6Var, 20);
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
