package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public st0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        xt0 xt0Var = photoViewer.d;
        if (xt0Var == null || xt0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) n1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        x5Var.f = dp;
        org.telegram.ui.Components.hp hpVar = x5Var.c;
        org.telegram.ui.Components.t9 t9Var = x5Var.a;
        bg.u1 u1Var = x5Var.e;
        x5Var.h = dp2;
        ((FrameLayout.LayoutParams) x5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) t9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) u1Var.getLayoutParams()).rightMargin = dp2;
        t9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                x5Var.setTag(searchImage);
                x5Var.setImage(searchImage);
                u1Var.setVisibility(4);
                hpVar.a.f(-1, true, false);
                hpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        x5Var.setTag(photoEntry);
        u1Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            t9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            t9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                u1Var.setVisibility(0);
                x5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                t9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            t9Var.setImageResource(R.drawable.nophotos);
        }
        hpVar.a.f(-1, true, false);
        hpVar.setVisibility(0);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context);
        new Paint();
        x5Var.setWillNotDraw(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        x5Var.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        x5Var.addView(t9Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        x5Var.b = frameLayout;
        x5Var.addView(frameLayout, i7.f6.e(42, 42, 53));
        bg.u1 u1Var = new bg.u1(context);
        u1Var.d = new Path();
        u1Var.c = new float[8];
        u1Var.b = new RectF();
        u1Var.e = new Paint(1);
        x5Var.e = u1Var;
        u1Var.setWillNotDraw(false);
        u1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        x5Var.addView(u1Var, i7.f6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        u1Var.addView(imageView, i7.f6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        x5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u1Var.addView(textView, i7.f6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 24, null);
        x5Var.c = hpVar;
        hpVar.setDrawBackgroundAsArc(11);
        hpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        x5Var.addView(hpVar, i7.f6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        hpVar.setVisibility(0);
        x5Var.setFocusable(true);
        frameLayout.setOnClickListener(new t50(this, 21));
        return new org.telegram.ui.Components.vk0(x5Var);
    }
}
