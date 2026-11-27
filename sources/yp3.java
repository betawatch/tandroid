// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yp3 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public yp3(Context context, vnb vnbVar) {
        super(context);
        setOrientation(1);
        setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        bs2.t(textView, 1, 15.0f);
        yob.X(textView, aob.G6, vnbVar);
        addView(textView, tre.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.y6, vnbVar);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, tre.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, 20, vnbVar);
        this.c = limitPreviewView;
        addView(limitPreviewView, tre.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(xp3 xp3Var) {
        this.a.setText(xp3Var.a);
        this.b.setText(xp3Var.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(xp3Var.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(xp3Var.c)));
    }
}
