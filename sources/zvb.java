// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zvb extends FrameLayout implements vlb {
    public final bf0 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public zvb(Context context) {
        super(context);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        td4.x(textView, cmb.F6, null, 1, 16.0f);
        if (jb6.a0) {
            addView(bf0Var, qoe.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, qoe.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(bf0Var, qoe.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, qoe.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = gm.L(56.0f);
            if (jb6.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, cmb.j0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        String str = tL_forumTopic.title;
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(gm.A2(str));
        } else {
            textView.setText(gm.u1(gm.A2(str), tL_forumTopic.searchQuery, null));
        }
        bf0 bf0Var = this.a;
        no4.q(bf0Var, tL_forumTopic, false, false, null);
        if (bf0Var == null || bf0Var.getImageReceiver() == null || !(bf0Var.getImageReceiver().t() instanceof mo4)) {
            return;
        }
        ((mo4) bf0Var.getImageReceiver().t()).a(cmb.w0(null, cmb.b9, false));
    }

    @Override // vlb
    public final void updateColors() {
        bf0 bf0Var = this.a;
        if (bf0Var != null) {
            try {
                if (bf0Var.getImageReceiver() == null || !(bf0Var.getImageReceiver().t() instanceof mo4)) {
                    return;
                }
                ((mo4) bf0Var.getImageReceiver().t()).a(cmb.w0(null, cmb.b9, false));
                bf0Var.invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
