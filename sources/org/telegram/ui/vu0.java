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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class vu0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public vu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        av0 av0Var = photoViewer.d;
        if (av0Var == null || av0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) c1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        y5Var.f = dp;
        org.telegram.ui.Components.mp mpVar = y5Var.c;
        org.telegram.ui.Components.x9 x9Var = y5Var.a;
        t5 t5Var = y5Var.e;
        y5Var.h = dp2;
        ((FrameLayout.LayoutParams) y5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) x9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).rightMargin = dp2;
        x9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                y5Var.setTag(searchImage);
                y5Var.setImage(searchImage);
                t5Var.setVisibility(4);
                mpVar.a.f(-1, true, false);
                mpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        y5Var.setTag(photoEntry);
        t5Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            x9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            x9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                x9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                t5Var.setVisibility(0);
                y5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                x9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            x9Var.setImageResource(R.drawable.nophotos);
        }
        mpVar.a.f(-1, true, false);
        mpVar.setVisibility(0);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context);
        new Paint();
        y5Var.setWillNotDraw(false);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        y5Var.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y5Var.addView(x9Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        y5Var.b = frameLayout;
        y5Var.addView(frameLayout, w7.x5.e(42, 42, 53));
        t5 t5Var = new t5(context);
        t5Var.c = new Path();
        t5Var.d = new float[8];
        t5Var.b = new RectF();
        t5Var.e = new Paint(1);
        y5Var.e = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        y5Var.addView(t5Var, w7.x5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        t5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        y5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        t5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 24, null);
        y5Var.c = mpVar;
        mpVar.setDrawBackgroundAsArc(11);
        mpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        y5Var.addView(mpVar, w7.x5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        mpVar.setVisibility(0);
        y5Var.setFocusable(true);
        frameLayout.setOnClickListener(new l60(this, 20));
        return new org.telegram.ui.Components.vk0(y5Var);
    }
}
