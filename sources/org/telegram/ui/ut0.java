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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ut0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public ut0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        zt0 zt0Var = photoViewer.d;
        if (zt0Var == null || zt0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) q1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i9 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        z5Var.f = dp;
        org.telegram.ui.Components.dp dpVar = z5Var.c;
        org.telegram.ui.Components.o9 o9Var = z5Var.a;
        bh.g gVar = z5Var.e;
        z5Var.h = dp2;
        ((FrameLayout.LayoutParams) z5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) o9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) gVar.getLayoutParams()).rightMargin = dp2;
        o9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i9));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                z5Var.setTag(searchImage);
                z5Var.setImage(searchImage);
                gVar.setVisibility(4);
                dpVar.a.f(-1, true, false);
                dpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        z5Var.setTag(photoEntry);
        gVar.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            o9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            o9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                gVar.setVisibility(0);
                z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                o9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            o9Var.setImageResource(R.drawable.nophotos);
        }
        dpVar.a.f(-1, true, false);
        dpVar.setVisibility(0);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        new Paint();
        z5Var.setWillNotDraw(false);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        z5Var.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z5Var.addView(o9Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        z5Var.b = frameLayout;
        z5Var.addView(frameLayout, g7.e6.e(42, 42, 53));
        bh.g gVar = new bh.g(context);
        gVar.b = new Path();
        gVar.c = new float[8];
        gVar.d = new RectF();
        gVar.e = new Paint(1);
        z5Var.e = gVar;
        gVar.setWillNotDraw(false);
        gVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        z5Var.addView(gVar, g7.e6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        gVar.addView(imageView, g7.e6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        z5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        gVar.addView(textView, g7.e6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 24, null);
        z5Var.c = dpVar;
        dpVar.setDrawBackgroundAsArc(11);
        dpVar.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
        z5Var.addView(dpVar, g7.e6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        dpVar.setVisibility(0);
        z5Var.setFocusable(true);
        frameLayout.setOnClickListener(new q50(this, 21));
        return new org.telegram.ui.Components.ik0(z5Var);
    }
}
