package yg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bg.q0;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final TableRow D;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final l9 f;
    public final l9 h;
    public final f6 n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public c0(Context context, f6 f6Var) {
        super(context);
        boolean z9;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = f6Var;
        TextView a10 = a(hd.M0(2131753523, null), false);
        TextView a11 = a(hd.M0(2131753179, null), false);
        TextView a12 = a(hd.M0(2131753501, null), false);
        TextView a13 = a(hd.M0(2131753322, null), false);
        TextView a14 = a(hd.M0(2131753540, null), false);
        TextView a15 = a(null, true);
        this.a = a15;
        TextView a16 = a(null, true);
        this.b = a16;
        TextView a17 = a(null, false);
        this.c = a17;
        TextView a18 = a(null, true);
        this.d = a18;
        TextView a19 = a(null, false);
        this.e = a19;
        l9 l9Var = new l9(context);
        this.f = l9Var;
        l9Var.setRoundRadius(g0.L(12.0f));
        l9 l9Var2 = new l9(context);
        this.h = l9Var2;
        l9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z10 = hd.a0;
        frameLayout.addView(l9Var, ha.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 12.0f, 0.0f, z10 ? 12.0f : 0.0f, 0.0f));
        boolean z11 = hd.a0;
        frameLayout.addView(a15, ha.d(-2, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 0.0f : 29.0f, 0.0f, z11 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, hd.a0 ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (hd.a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        boolean z12 = hd.a0;
        frameLayout2.addView(l9Var2, ha.d(24, 24.0f, z12 ? 5 : 3, z12 ? 0.0f : 12.0f, 0.0f, z12 ? 12.0f : 0.0f, 0.0f));
        boolean z13 = hd.a0;
        frameLayout2.addView(a16, ha.d(-2, -2.0f, (z13 ? 5 : 3) | 16, z13 ? 0.0f : 29.0f, 0.0f, z13 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, hd.a0 ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (hd.a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (hd.a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.D = tableRow4;
        if (hd.a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (hd.a0) {
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, f6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (hd.a0) {
            z9 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z9 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, ha.c(-2.0f, -1));
        b0Var.setOutlineProvider(new q0(23));
        b0Var.setClipToOutline(z9);
        setPaddingRelative(g0.L(14.0f), g0.L(18.0f), g0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z9) {
        TextView textView;
        f6 f6Var = this.n;
        if (z9) {
            textView = new w70(getContext(), f6Var);
            r6.H(textView, k6.J6, f6Var);
        } else {
            textView = new TextView(getContext());
        }
        r6.V(textView, z9 ? k6.m5 : k6.j5, f6Var);
        textView.setTextSize(1, 14.0f);
        if (!z9) {
            textView.setGravity(hd.a0 ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(g0.L(14.0f), 0, g0.L(14.0f), 0);
            return textView;
        }
        textView.setTypeface(g0.o());
        textView.setText(str);
        r6.i(k6.e7, textView, f6Var);
        textView.setPadding(g0.L(hd.a0 ? 32.0f : 12.0f), g0.L(11.0f), g0.L(hd.a0 ? 12.0f : 32.0f), g0.L(11.0f));
        return textView;
    }
}
