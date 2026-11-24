// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y23 extends FrameLayout {
    public final lka a;
    public final ImageView b;
    public boolean c;
    public byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public y23(int i, ylb ylbVar, Context context) {
        super(context);
        this.d = i;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        int i2 = cmb.n6;
        anb.W(lkaVar, i2, ylbVar);
        lkaVar.setTag(Integer.valueOf(i2));
        addView(lkaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawLine(gm.L(this.d), getMeasuredHeight() - 1, gm.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        boolean z2 = jb6.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - lkaVar.getMeasuredWidth()) - gm.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = gm.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        int L2 = !jb6.a0 ? (gm.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i5 - imageView.getMeasuredWidth()) - gm.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = gm.a;
        this.a.measure(wi8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, gm.L(50.0f));
    }
}
