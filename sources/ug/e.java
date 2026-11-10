package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public e(Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        t6.U(textView, m6.G6, h6Var);
        addView(textView, ha.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        t6.U(textView2, m6.y6, h6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ha.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, h6Var);
        this.c = limitPreviewView;
        addView(limitPreviewView, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.a.setText(dVar.a);
        this.b.setText(dVar.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(dVar.c)));
    }
}
