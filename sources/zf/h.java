package zf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.g9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends f3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = d20.s0;
        final int i10 = 1;
        setOrientation(1);
        a7.i(t6.a7, this, null);
        jg.d0 d0Var = new jg.d0(context, 3);
        d0Var.c = new Path();
        Paint paint = new Paint(1);
        d0Var.b = paint;
        final int i11 = 0;
        paint.setColor(t6.x0(null, t6.d6, false));
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.33f), 0.0f, org.telegram.messenger.i0.L(0.33f), 503316480);
        d0Var.setWillNotDraw(false);
        d0Var.setOrientation(1);
        d0Var.setPadding(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
        g9 g9Var = new g9(context);
        this.b = g9Var;
        g9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.e3
            public final /* synthetic */ zf.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b.getImageReceiver().P0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        a();
        d0Var.addView(g9Var, b6.r(zs.O1, zs.O1, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        a7.V(textView, t6.G6, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        d0Var.addView(textView, b6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, t6.y6, null);
        d0Var.addView(textView2, b6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(j6.f(t6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        a7.V(textView3, t6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.e3
            public final /* synthetic */ zf.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b.getImageReceiver().P0(false);
                        break;
                    default:
                        this.b.f.L();
                        break;
                }
            }
        });
        d0Var.addView(textView3, b6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(d0Var, b6.o(-1, -2));
        set(null);
    }
}
