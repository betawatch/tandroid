package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b1 extends LinearLayout {
    public final g6 a;
    public final k90 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public b1(Context context, g6 g6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = g6Var;
        setOrientation(1);
        k90 k90Var = new k90();
        this.b = k90Var;
        int i10 = k6.G6;
        int v02 = k6.v0(i10, g6Var);
        k90Var.f(k6.l1(0.05f, v02), k6.l1(0.15f, v02), k6.l1(0.1f, v02), k6.l1(0.3f, v02));
        k90Var.j(4.0f);
        k90Var.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(k6.v0(i10, g6Var));
        textView.setTextSize(1, 16.0f);
        boolean z4 = LocaleController.isRTL;
        addView(textView, c6.t(-1, -2, 55, z4 ? 70 : 18, 10, z4 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(k6.v0(k6.z6, g6Var));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView2, c6.t(-1, -2, 55, z10 ? 70 : 18, 0, z10 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z4) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.b, 0L, (String) null, (Object) null, 0);
            } else {
                this.c.setImageBitmap((Drawable) null);
            }
        }
        this.e = z4;
        setPadding(0, 0, 0, z4 ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float dp = LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : getWidth() - AndroidUtilities.dp(60.0f);
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(44.0f);
        float dp4 = AndroidUtilities.dp(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setImageCoords(dp, dp2, dp3, dp4);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = k6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = k6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
