// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qj2 extends FrameLayout {
    public final View a;
    public final TextView b;

    public qj2(Activity activity) {
        super(activity);
        View view = new View(activity);
        this.a = view;
        int L = gm.L(4.0f);
        int i = cmb.Ei;
        int w0 = cmb.w0(null, i, false);
        int i2 = cmb.Gi;
        int w02 = cmb.w0(null, i2, false);
        Drawable i0 = cmb.i0(L, L, L, L, w0, w02, w02);
        wmb M = anb.M(i);
        wmb M2 = anb.M(i2);
        view.setBackground(i0);
        anb.j(view, i0, M, M2, null);
        addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        td4.x(textView, cmb.Ii, null, 1, 14.0f);
        addView(textView, qoe.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), TLObject.FLAG_30));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
