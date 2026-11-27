// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class v14 extends FrameLayout implements snb {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ o24 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v14(o24 o24Var, Context context) {
        super(context);
        this.e = o24Var;
        xob xobVar = yob.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i = aob.Df;
        vnb vnbVar = o24Var.a2;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        qd4.u(16.0f, 2131747938, 1, textView, null);
        yob.X(textView, i, vnbVar);
        addView(textView, tre.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, vnbVar);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(o24Var.y(aob.h6));
        addView(radialProgressView, tre.e(-2, -2, 17));
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.a.setVisibility(z ? 8 : 0);
            this.b.setVisibility(z ? 8 : 0);
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (ik8.D(8.0f, r0 - r4.c1, 3) * 1.7f) : this.e.i0.getMeasuredHeight() - hl.L(80.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.y(aob.h6));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
