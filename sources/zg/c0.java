package zg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import b8.mf;
import cg.p0;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout {
    public final TableRow E;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final k9 f;
    public final k9 h;
    public final e6 n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public c0(Context context, e6 e6Var) {
        super(context);
        boolean z10;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = e6Var;
        TextView a10 = a(bd.M0(2131753523, null), false);
        TextView a11 = a(bd.M0(2131753179, null), false);
        TextView a12 = a(bd.M0(2131753501, null), false);
        TextView a13 = a(bd.M0(2131753322, null), false);
        TextView a14 = a(bd.M0(2131753540, null), false);
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
        k9 k9Var = new k9(context);
        this.f = k9Var;
        k9Var.setRoundRadius(g0.L(12.0f));
        k9 k9Var2 = new k9(context);
        this.h = k9Var2;
        k9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z11 = bd.a0;
        frameLayout.addView(k9Var, mf.d(24, 24.0f, z11 ? 5 : 3, z11 ? 0.0f : 12.0f, 0.0f, z11 ? 12.0f : 0.0f, 0.0f));
        boolean z12 = bd.a0;
        frameLayout.addView(a15, mf.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 29.0f, 0.0f, z12 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, bd.a0 ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (bd.a0) {
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
        boolean z13 = bd.a0;
        frameLayout2.addView(k9Var2, mf.d(24, 24.0f, z13 ? 5 : 3, z13 ? 0.0f : 12.0f, 0.0f, z13 ? 12.0f : 0.0f, 0.0f));
        boolean z14 = bd.a0;
        frameLayout2.addView(a16, mf.d(-2, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 0.0f : 29.0f, 0.0f, z14 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, bd.a0 ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (bd.a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (bd.a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (bd.a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (bd.a0) {
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, e6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (bd.a0) {
            z10 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, mf.c(-2.0f, -1));
        b0Var.setOutlineProvider(new p0(26));
        b0Var.setClipToOutline(z10);
        setPaddingRelative(g0.L(14.0f), g0.L(18.0f), g0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        e6 e6Var = this.n;
        if (z10) {
            textView = new s70(getContext(), e6Var);
            r6.H(textView, k6.J6, e6Var);
        } else {
            textView = new TextView(getContext());
        }
        r6.V(textView, z10 ? k6.m5 : k6.j5, e6Var);
        textView.setTextSize(1, 14.0f);
        if (!z10) {
            textView.setGravity(bd.a0 ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(g0.L(14.0f), 0, g0.L(14.0f), 0);
            return textView;
        }
        textView.setTypeface(g0.o());
        textView.setText(str);
        r6.i(k6.e7, textView, e6Var);
        textView.setPadding(g0.L(bd.a0 ? 32.0f : 12.0f), g0.L(11.0f), g0.L(bd.a0 ? 12.0f : 32.0f), g0.L(11.0f));
        return textView;
    }
}
