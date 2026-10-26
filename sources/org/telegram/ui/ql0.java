package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ql0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean a;
    public int b;
    public final int c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.y9 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String v;

    public ql0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = i10;
        this.d = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, org.telegram.ui.Components.gb1.h(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f = y9Var;
        y9Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.i(36, 36, 17));
        TextView L = org.telegram.ui.Components.gb1.L(context, 15.0f, org.telegram.ui.ActionBar.y6.G6, true, null);
        this.h = L;
        L.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        L.setEllipsize(truncateAt);
        addView(L, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.y6.y6;
        TextView L2 = org.telegram.ui.Components.gb1.L(context, 13.0f, i11, false, null);
        this.n = L2;
        L2.setSingleLine();
        L2.setEllipsize(truncateAt);
        addView(L2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        addView(imageView, org.telegram.ui.Components.gb1.h(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = org.telegram.ui.ActionBar.y6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 0.0f), getMeasuredHeight(), V0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.y9 y9Var;
        int o12;
        try {
            if (!this.a || (y9Var = this.f) == null || (o12 = org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d))) == this.b) {
                return;
            }
            this.b = o12;
            y9Var.setColorFilter(new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
