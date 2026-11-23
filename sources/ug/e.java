package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public e(Context context, i6 i6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        i5.c.x(textView, 1, 15.0f);
        u6.U(textView, n6.G6, i6Var);
        addView(textView, na.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        u6.U(textView2, n6.y6, i6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, na.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, i6Var);
        this.c = limitPreviewView;
        addView(limitPreviewView, na.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.a.setText(dVar.a);
        this.b.setText(dVar.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(dVar.c)));
    }
}
